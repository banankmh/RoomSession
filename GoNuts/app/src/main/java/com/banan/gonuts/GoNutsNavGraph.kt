package com.banan.gonuts

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.banan.gonuts.screens.Screens


@Composable
fun GoNutsNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.OnBoardingScreen.route) {

    }
}