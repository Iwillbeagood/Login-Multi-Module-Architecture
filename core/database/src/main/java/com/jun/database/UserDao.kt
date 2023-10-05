package com.jun.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.jun.model.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM users WHERE email = :email")
    suspend fun getUserByEmail(email: String): User?
}