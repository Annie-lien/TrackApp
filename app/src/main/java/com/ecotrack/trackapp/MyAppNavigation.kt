package com.ecotrack.trackapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ecotrack.trackapp.pages.HomePage
import com.ecotrack.trackapp.pages.LoginPage
import com.ecotrack.trackapp.pages.SignupPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier,authVieModel: AuthViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder =  {
        composable("login"){
            LoginPage(modifier,navController,authVieModel)
        }
        composable("signup"){
            SignupPage(modifier,navController,authVieModel)
        }
        composable("home"){
            HomePage(modifier,navController,authVieModel)
        }


    })
}