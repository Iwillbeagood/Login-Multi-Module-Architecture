package com.jun.data.repository

import com.jun.model.User

interface UserRepository {

    suspend fun insertUser(user: User)

    suspend fun getUserByEmail(email: String): User?
}