package uz.ruzibekov.wine_catalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import uz.ruzibekov.wine_catalog.ui.navigation.MainNavGraph
import uz.ruzibekov.wine_catalog.ui.theme.WineCatalogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WineCatalogTheme {

                val navController = rememberNavController()

                MainNavGraph.Default(navController = navController)
            }
        }
    }
}