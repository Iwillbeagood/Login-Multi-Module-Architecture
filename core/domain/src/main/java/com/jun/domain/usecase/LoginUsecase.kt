package com.jun.domain.usecase

import com.jun.data.repository.UserRepository
import com.jun.model.InvalidUserException
import com.jun.model.User
import javax.inject.Inject

class LoginUsecase @Inject constructor(
    private val repository: UserRepository
) {

    @Throws(InvalidUserException::class)
    suspend operator fun invoke(user: User) {
        repository.getUserByEmail(user.email)?.let { userByEmail ->
            if (userByEmail.password != user.password)
                throw InvalidUserException("비밀번호가 일치하지 않습니다.")
        } ?: throw InvalidUserException("존재하지 않는 이메일입니다.")
    }
}