package uz.ruzibekov.wine_catalog.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


object AppColor {
    val Primary = Color(0xFF7A2A65)
    val Secondary = Color(0xFF421124)
    val White = Color(0xFFFFFFFF)
}

object Brushes {

    val PrimaryBrush = Brush.linearGradient(colors = listOf(AppColor.Primary, AppColor.Secondary))
}