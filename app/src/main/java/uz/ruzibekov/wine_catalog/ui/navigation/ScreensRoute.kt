package uz.ruzibekov.wine_catalog.ui.navigation

sealed class ScreensRoute(val route: String){

    object Main : ScreensRoute("slider-screen")

}
