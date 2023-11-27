package com.jun.data.repository

import androidx.datastore.core.DataStore
import com.jun.data.mapper.toUser
import com.jun.data.mapper.toUserPrefs
import com.jun.datastore.model.UserPreferences
import com.jun.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class DefaultUserPrefsRepository @Inject constructor(
    private val datastore: DataStore<UserPreferences>
): UserPrefsRepository {

    override fun getUserPrefs(): Flow<User> {
        return datastore.data.map { it.toUser() }
    }

    override suspend fun setUserPrefs(user: User) {
        datastore.updateData { user.toUserPrefs() }
    }
}