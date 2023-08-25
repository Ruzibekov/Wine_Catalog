package uz.ruzibekov.wine_catalog.ui.screens.splash

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import uz.ruzibekov.wine_catalog.ui.screens.splash._components.MainTopBarView
import uz.ruzibekov.wine_catalog.ui.theme.WineCatalogTheme

object MainScreenView {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Default() {

        Scaffold(

            topBar = {
                MainTopBarView.Default()
            }

        ) { paddingValues ->

            
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun Preview() {
    WineCatalogTheme {
        MainScreenView.Default()
    }
}