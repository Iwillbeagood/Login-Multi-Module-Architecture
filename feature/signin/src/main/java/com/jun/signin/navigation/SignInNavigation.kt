package com.jun.signin.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jun.signin.SignInScreen

fun NavController.navigateSignIn() {
    navigate(SignInRoute.route)
}

fun NavGraphBuilder.signInNavGraph(
    onLoginClick: (Int) -> Unit
) {
    composable(route = SignInRoute.route) {
        SignInScreen(onLoginClick)
    }
}

object SignInRoute {
    const val route = "sign_in"
}