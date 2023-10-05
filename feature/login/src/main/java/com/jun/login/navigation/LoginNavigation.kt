package com.jun.login.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jun.login.LoginScreen

fun NavController.navigateLogin() {
    navigate(LoginRoute.route)
}

fun NavGraphBuilder.loginNavGraph(
    onSignInClick: (Int) -> Unit
) {
    composable(route = LoginRoute.route) {
        LoginScreen(onSignInClick)
    }
}

object LoginRoute {
    const val route = "login"
}