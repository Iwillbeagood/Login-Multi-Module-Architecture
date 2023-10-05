package com.jun.signin

sealed class SignInEvent {
    data class EnteredEmail(val value: String): SignInEvent()
    data class EnteredPassword(val value: String): SignInEvent()
    object SignIn: SignInEvent()
}
