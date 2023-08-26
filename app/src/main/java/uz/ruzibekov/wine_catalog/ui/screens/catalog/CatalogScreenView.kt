package uz.ruzibekov.wine_catalog.ui.screens.catalog

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.ruzibekov.wine_catalog.state.MainState
import uz.ruzibekov.wine_catalog.ui.listeners.MainListeners
import uz.ruzibekov.wine_catalog.ui.screens.catalog._components.CatalogTopBarView
import uz.ruzibekov.wine_catalog.ui.screens.catalog._components.CatalogWineItemView

object CatalogScreenView {

    @OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
    @Composable
    fun Default(state: MainState, listeners: MainListeners) {

        Scaffold(
            topBar = {
                CatalogTopBarView.Default()
            }
        ) { paddingValues ->

            state.selectedCatalog.value?.let { catalog ->

                HorizontalPager(
                    modifier = Modifier.padding(paddingValues),
                    pageCount = catalog.wines.size,
                    contentPadding = PaddingValues(
                        top = 40.dp,
                        start = 20.dp,
                        bottom = 48.dp,
                        end = 40.dp
                    ),
                    pageSpacing = 10.dp
                ) { page ->

                    CatalogWineItemView.Default(catalog.wines[page]) {

                        listeners.openWineDetailsScreen()
                    }
                }
            }
        }
    }
}