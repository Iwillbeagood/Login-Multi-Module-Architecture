package com.jun.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jun.home.HomeScreen

fun NavController.navigateHome() {
    navigate(HomeRoute.route)
}

fun NavGraphBuilder.homeNavGraph() {
    composable(route = HomeRoute.route) {
        HomeScreen()
    }
}

object HomeRoute {
    const val route = "home"
}

