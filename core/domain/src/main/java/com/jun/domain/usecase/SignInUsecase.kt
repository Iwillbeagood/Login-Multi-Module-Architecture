package com.jun.domain.usecase

import android.text.TextUtils
import android.util.Patterns
import com.jun.data.repository.UserRepository
import com.jun.model.InvalidUserException
import com.jun.model.User
import javax.inject.Inject

class SignInUsecase  @Inject constructor(
    private val repository: UserRepository
) {

    @Throws(InvalidUserException::class)
    suspend operator fun invoke(user: User) {
        if (repository.getUserByEmail(user.email) != null)
            throw InvalidUserException("이메일이 존재합니다.")
        else {
            isUserInformationValid(user).let { message ->
                if (message != "성공") throw InvalidUserException(message)
                repository.insertUser(user)
            }
        }
    }

    private fun isUserInformationValid(user: User): String =
        when {
            TextUtils.isEmpty(user.email) -> {
                "이메일을 입력해 주세요."
            }
            !Patterns.EMAIL_ADDRESS.matcher(user.email).matches() -> {
                "유효한 이메일을 입력해 주세요."
            }
            TextUtils.isEmpty(user.password) -> {
                "비밀번호를 입력해 주세요."
            }
            user.password.length <= 6 -> {
                "비밀번호는 최소 길이는 6입니다."
            }
            else -> "성공"
        }
}