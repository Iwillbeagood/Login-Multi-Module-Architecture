package com.jun.data.mapper

import com.jun.database.UserEntity
import com.jun.datastore.model.UserPreferences
import com.jun.model.User

fun User.toUserEntity() = UserEntity(
    email, password
)

fun UserEntity.toUser() = User(
    email, password
)