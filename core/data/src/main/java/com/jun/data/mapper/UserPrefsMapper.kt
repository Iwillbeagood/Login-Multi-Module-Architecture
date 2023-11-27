package com.jun.data.mapper

import com.jun.datastore.model.UserPreferences
import com.jun.model.User

fun User.toUserPrefs() = UserPreferences(
    email, password
)

fun UserPreferences.toUser() = User(
    email, password
)