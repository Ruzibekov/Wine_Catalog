package uz.ruzibekov.wine_catalog.state

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import uz.ruzibekov.wine_catalog.data.model.CatalogData
import uz.ruzibekov.wine_catalog.data.model.WineData

data class MainState (
    val catalogs: SnapshotStateList<CatalogData> = mutableStateListOf(),
    val selectedCatalog: MutableState<CatalogData?> = mutableStateOf(null),
    val selectedWine: MutableState<WineData?> = mutableStateOf(null)
)