package uz.ruzibekov.wine_catalog.data.model

data class CatalogData(
    val id: Int,
    val name: String,
    val wines: List<WineData>
)