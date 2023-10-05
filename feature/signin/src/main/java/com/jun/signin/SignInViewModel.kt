package com.jun.signin

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jun.domain.usecase.SignInUsecase
import com.jun.model.InvalidUserException
import com.jun.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val signInUseCase: SignInUsecase
) : ViewModel() {

    private val _userEmail = mutableStateOf("")
    val userEmail: State<String> = _userEmail

    private val _userPassword = mutableStateOf("")
    val userPassword: State<String> = _userPassword

    private val _eventFlow = MutableSharedFlow<UiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onEvent(event: SignInEvent) {
        when (event) {
            is SignInEvent.EnteredEmail -> {
                _userEmail.value = event.value

            }
            is SignInEvent.EnteredPassword -> {
                _userPassword.value = event.value
            }
            is SignInEvent.SignIn -> {
                viewModelScope.launch {
                    try {
                        signInUseCase(
                            User(
                                email = userEmail.value,
                                password = userPassword.value
                            )
                        )
                        _eventFlow.emit(UiEvent.SignIn)
                    } catch (e: InvalidUserException) {
                        _eventFlow.emit(
                            UiEvent.ShowSnackBar(
                                message = e.message ?: "회원가입할 수 없습니다."
                            )
                        )
                    }
                }
            }
        }
    }

    sealed class UiEvent {
        data class ShowSnackBar(val message: String) : UiEvent()
        object SignIn : UiEvent()
    }
}
