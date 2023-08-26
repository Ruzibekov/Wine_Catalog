package uz.ruzibekov.wine_catalog.ui.listeners

import uz.ruzibekov.wine_catalog.data.model.CatalogData

interface MainListeners {

    fun openCatalogScreen(data: CatalogData)

    fun openWineDetailsScreen()
}