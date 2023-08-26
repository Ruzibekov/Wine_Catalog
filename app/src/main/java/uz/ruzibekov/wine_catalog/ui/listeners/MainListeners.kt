package uz.ruzibekov.wine_catalog.ui.listeners

import uz.ruzibekov.wine_catalog.data.model.CatalogData
import uz.ruzibekov.wine_catalog.data.model.WineData

interface MainListeners {

    fun openCatalogScreen(data: CatalogData)

    fun openWineDetailsScreen(data: WineData)

    fun onBackStack()
}