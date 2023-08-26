package uz.ruzibekov.wine_catalog.ui.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import uz.ruzibekov.wine_catalog.R
import uz.ruzibekov.wine_catalog.state.MainState
import uz.ruzibekov.wine_catalog.ui.listeners.MainListeners
import uz.ruzibekov.wine_catalog.ui.screens.details._components.DetailsTopBarView

object DetailsScreenView {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Default(state: MainState, listeners: MainListeners) {

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomEnd
        ) {

            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = {
                    DetailsTopBarView.Default()
                }
            ) { paddingValues ->

                Column(
                    modifier = Modifier
                        .padding(paddingValues)
                        .padding(start = 38.dp, end = 200.dp)
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                ) {

                    Text(text = "Paua Bay")

                    Text(text = "Red, Dry")

                    Text(
                        text = "Everything seems to be fine, wonderful, balanced after a family weekend. And one day your lovely half suddenly says:\n" +
                                "“You know, dear! You’re beautiful and perfect, but I’m nasty and not worthy of you. That’s why I’m breaking up with you.”"
                    )

                    Text(
                        text = "Familiar? So this Pinot for you! Garnet red in colour. A vibrant wine with purity of fruit and great intensity. Packed with lively flavors and distinct herbaceous aromas.\n" +
                                "Is it not enough to forget your ex?\n" +
                                "Hold my glass! By tasting this wine you will feel a fragrant dark cherry with delicate violet notes and an elegant seductive texture. Raspberry, cherry and plum with subtle oak on the nose. Earthy character, long finish, dry with soft fruit tannins, a wine with serious structure and length."
                    )

                }
            }

            Image(
                painter = painterResource(id = R.drawable.wine_bodegas_beronia),
                contentDescription = "wine image",
                modifier = Modifier.fillMaxHeight().offset(y = 20.dp, x = 100.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}