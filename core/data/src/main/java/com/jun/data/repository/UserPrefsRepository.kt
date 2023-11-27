package com.jun.data.repository

import com.jun.model.User
import kotlinx.coroutines.flow.Flow

interface UserPrefsRepository {

    fun getUserPrefs(): Flow<User>

    suspend fun setUserPrefs(user: User)
}