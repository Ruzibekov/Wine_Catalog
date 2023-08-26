package uz.ruzibekov.wine_catalog.ui.navigation

sealed class ScreensRoute(val route: String){

    object Main : ScreensRoute("main-screen")

    object Catalog : ScreensRoute("catalog-screen")

    object Details : ScreensRoute("details-screen")
}
