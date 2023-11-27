package com.jun.model

data class User(
    val email: String,
    val password: String
)

class InvalidUserException(message: String): Exception(message)