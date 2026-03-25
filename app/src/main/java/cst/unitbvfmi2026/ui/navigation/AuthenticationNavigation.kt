package cst.unitbvfmi2026.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cst.unitbvfmi2026.ui.screens.LogInScreen
import cst.unitbvfmi2026.ui.screens.RegisterScreen

@Composable
fun AuthenticationNavigation(){
    val navController=rememberNavController()
    NavHost (
        navController= navController,
        startDestination = "login"
    ){
        composable("login") {
            LogInScreen(
                onRegisterClick = {
                    navController.navigate("register")
                }
            )
        }
        composable("register") {
            RegisterScreen(
                onLoginClick = {
                    navController.popBackStack()
                }
            )
        }
    }

}