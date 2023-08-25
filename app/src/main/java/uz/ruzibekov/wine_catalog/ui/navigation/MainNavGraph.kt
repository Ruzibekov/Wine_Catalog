package uz.ruzibekov.wine_catalog.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import uz.ruzibekov.wine_catalog.ui.screens.splash.MainScreenView

object MainNavGraph {

    @Composable
    fun Default(navController: NavHostController) {

        NavHost(navController = navController, startDestination = ScreensRoute.Main.route) {

            composable(ScreensRoute.Main.route){ MainScreenView.Default() }


        }
    }
}