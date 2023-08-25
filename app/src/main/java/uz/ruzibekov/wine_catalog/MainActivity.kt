package uz.ruzibekov.wine_catalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import uz.ruzibekov.wine_catalog.ui.navigation.MainNavGraph
import uz.ruzibekov.wine_catalog.ui.theme.AppColor
import uz.ruzibekov.wine_catalog.ui.theme.WineCatalogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WineCatalogTheme {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(AppColor.Background)
                ) {

                    val navController = rememberNavController()

                    MainNavGraph.Default(navController = navController)
                }
            }
        }
    }
}