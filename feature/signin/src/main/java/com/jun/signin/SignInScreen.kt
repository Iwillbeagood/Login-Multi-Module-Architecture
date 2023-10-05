package com.jun.signin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.coroutines.flow.collectLatest

@Composable
fun SignInScreen(
    onLoginClick: (Int) -> Unit,
    viewModel: SignInViewModel = hiltViewModel()
) {
    val emailState = viewModel.userEmail.value
    val passwordState = viewModel.userPassword.value

    val snackBarHostState = remember { SnackbarHostState() }
    SnackbarHost(hostState = snackBarHostState)
    LaunchedEffect(key1 = true) {
        viewModel.eventFlow.collectLatest { event ->
            when(event) {
                is SignInViewModel.UiEvent.ShowSnackBar -> {
                    snackBarHostState.showSnackbar(
                        message = event.message,
                    )
                }
                is SignInViewModel.UiEvent.SignIn -> {
                    snackBarHostState.showSnackbar(
                        message = "회원가입을 성공했습니다."
                    )
                    onLoginClick(0)
                }
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = "회원가입 화면",
            style = MaterialTheme.typography.displayMedium,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            ClickableText(
                text = AnnotatedString("Login"),
                style = MaterialTheme.typography.headlineLarge.copy(
                    color = Color.Gray
                ),
                onClick = onLoginClick
            )
            Text(
                text = "  /  ",
                style = MaterialTheme.typography.headlineLarge,
                color = Color.DarkGray
            )
            Text(
                text = AnnotatedString("Sign In"),
                style = MaterialTheme.typography.headlineLarge,
                color = Color.DarkGray
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = emailState,
            label = { Text(text = "Email") },
            placeholder = { Text(text = "이메일을 입력해 주세요.") },
            onValueChange = { newValue ->
                viewModel.onEvent(SignInEvent.EnteredEmail(newValue))
            },
            modifier = Modifier.fillMaxWidth(),
            textStyle = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedTextField(
            value = passwordState,
            label = { Text(text = "Password") },
            placeholder = { Text(text = "비밀번호를 입력해 주세요") },
            onValueChange = { newValue ->
                viewModel.onEvent(SignInEvent.EnteredPassword(newValue))
            },
            modifier = Modifier.fillMaxWidth(),
            textStyle = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(15.dp))
        Button(
            onClick = {
                viewModel.onEvent(SignInEvent.SignIn)
            },
            modifier = Modifier
                .wrapContentSize()
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            contentPadding = PaddingValues(15.dp),
            shape = RoundedCornerShape(4.dp)
        ) {
            Text(text = "Sign In", fontSize = 20.sp)
        }
    }
}