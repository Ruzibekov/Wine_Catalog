package uz.ruzibekov.wine_catalog.data.model

data class WineData(
    val country: String,
    val id: Int,
    val main_grape: String,
    val name: String,
    val region: String,
    val variety: String,
    val volume: String
)