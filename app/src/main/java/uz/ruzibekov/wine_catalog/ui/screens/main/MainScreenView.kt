package uz.ruzibekov.wine_catalog.ui.screens.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.ruzibekov.wine_catalog.state.MainState
import uz.ruzibekov.wine_catalog.ui.listeners.MainListeners
import uz.ruzibekov.wine_catalog.ui.screens.main._components.MainCatalogItemView
import uz.ruzibekov.wine_catalog.ui.screens.main._components.MainTopBarView

object MainScreenView {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Default(state: MainState, listeners: MainListeners) {

        Scaffold(

            topBar = {
                MainTopBarView.Default()
            }

        ) { paddingValues ->

            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(top = 16.dp),
                contentPadding = paddingValues
            ) {

                items(10) { catalog ->

                    MainCatalogItemView.Default(){

                        listeners.openCatalogScreen()
                    }
                }
            }
        }
    }
}