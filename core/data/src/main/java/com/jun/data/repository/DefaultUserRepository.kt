package com.jun.data.repository

import com.jun.data.mapper.toUser
import com.jun.data.mapper.toUserEntity
import com.jun.database.UserDao
import com.jun.model.User
import javax.inject.Inject

class DefaultUserRepository @Inject constructor(
    private val userDao: UserDao
) : UserRepository {

    override suspend fun insertUser(user: User) {
        userDao.insertUser(user.toUserEntity())
    }

    override suspend fun getUserByEmail(email: String): User? {
        userDao.getUserByEmail(email)?.let {
            return it.toUser()
        }
        return null
    }
}