package com.travelin_example.diplincs.core.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navDeepLink
import com.travelin_example.diplincs.DetailScreen
import com.travelin_example.diplincs.HomeScreen
import com.travelin_example.diplincs.LoginScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Login){
        composable<Login>{
            LoginScreen {
                navController.navigate(Home)
            }
        }
        composable<Home>(deepLinks = listOf(navDeepLink { uriPattern = "https://app.joaquinossandon.cl/" })){
            HomeScreen {name -> navController.navigate(Detail(name = name))}
        }

        composable<Detail>(deepLinks = listOf(navDeepLink { uriPattern = "https://app.joaquinossandon.cl/details/{name}" })) {
            val name = it.arguments?.getString("name").orEmpty()
            DetailScreen(name)
        }
    }
}