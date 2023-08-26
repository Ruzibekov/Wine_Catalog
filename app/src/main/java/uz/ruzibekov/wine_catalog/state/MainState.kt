package uz.ruzibekov.wine_catalog.state

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import uz.ruzibekov.wine_catalog.data.model.CatalogData

data class MainState (
    val catalogs: SnapshotStateList<CatalogData> = mutableStateListOf(),
    val selectedCatalog: MutableState<CatalogData?> = mutableStateOf(null)
) {
}