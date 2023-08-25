package uz.ruzibekov.wine_catalog

import androidx.lifecycle.ViewModel
import uz.ruzibekov.wine_catalog.data.model.CatalogData
import uz.ruzibekov.wine_catalog.state.MainState

class MainViewModel : ViewModel() {

    val state = MainState()

    fun fetch(catalogs: List<CatalogData>) {
        state.catalogs.clear()
        state.catalogs.addAll(catalogs)
    }
}