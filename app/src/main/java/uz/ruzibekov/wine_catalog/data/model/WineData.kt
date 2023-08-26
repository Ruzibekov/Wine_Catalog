package uz.ruzibekov.wine_catalog.data.model

data class WineData(
    val id: Int,
    val country: String,
    val image: String,
    val main_grape: String,
    val name: String,
    val region: String,
    val variety: String,
    val volume: String
)