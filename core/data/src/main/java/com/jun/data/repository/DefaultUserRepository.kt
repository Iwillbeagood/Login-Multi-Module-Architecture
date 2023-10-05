package com.jun.data.repository

import com.jun.database.UserDao
import com.jun.model.User
import javax.inject.Inject

class DefaultUserRepository @Inject constructor(
    private val userDao: UserDao
) : UserRepository {

    override suspend fun insertUser(user: User) {
        userDao.insertUser(user)
    }

    override suspend fun getUserByEmail(email: String): User? {
        return userDao.getUserByEmail(email)
    }
}