package com.jun.datastore.model

import kotlinx.serialization.Serializable

@Serializable
data class UserPreferences(
    val email: String = "",
    val password: String = ""
)