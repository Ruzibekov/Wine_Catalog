package uz.ruzibekov.wine_catalog.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import uz.ruzibekov.wine_catalog.state.MainState
import uz.ruzibekov.wine_catalog.ui.listeners.MainListeners
import uz.ruzibekov.wine_catalog.ui.screens.catalog.CatalogScreenView
import uz.ruzibekov.wine_catalog.ui.screens.main.MainScreenView

object MainNavGraph {

    @Composable
    fun Default(navController: NavHostController, state: MainState, listeners: MainListeners) {

        NavHost(navController = navController, startDestination = ScreensRoute.Main.route) {

            composable(ScreensRoute.Main.route) {
                MainScreenView.Default(state = state, listeners = listeners)
            }

            composable(ScreensRoute.Catalog.route) {
                CatalogScreenView.Default(state = state, listeners = listeners)
            }
        }
    }
}