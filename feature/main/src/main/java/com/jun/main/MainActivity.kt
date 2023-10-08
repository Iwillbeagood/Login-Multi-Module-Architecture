package com.jun.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.jun.login.navigation.LoginRoute
import com.jun.login.navigation.loginNavGraph
import com.jun.login.navigation.navigateLogin
import com.jun.signin.navigation.navigateSignIn
import com.jun.signin.navigation.signInNavGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Surface(
                color = MaterialTheme.colorScheme.background
            ) {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = LoginRoute.route
                ) {
                    loginNavGraph(
                        onSignInClick = { navController.navigateSignIn() }
                    )
                    signInNavGraph(
                        onLoginClick = { navController.navigateLogin() }
                    )
                }
            }
        }
    }
}