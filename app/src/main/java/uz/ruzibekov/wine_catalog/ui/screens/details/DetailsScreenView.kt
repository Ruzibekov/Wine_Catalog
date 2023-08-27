package uz.ruzibekov.wine_catalog.ui.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ruzibekov.wine_catalog.R
import uz.ruzibekov.wine_catalog.getImageFromDrawableResources
import uz.ruzibekov.wine_catalog.state.MainState
import uz.ruzibekov.wine_catalog.ui.listeners.MainListeners
import uz.ruzibekov.wine_catalog.ui.screens.details._components.DetailsTopBarView
import uz.ruzibekov.wine_catalog.ui.theme.AppColor

object DetailsScreenView {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Default(state: MainState, listeners: MainListeners) {

        state.selectedWine.value?.let { data ->

            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomEnd
            ) {

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        DetailsTopBarView.Default {
                            listeners.onBackStack()
                        }
                    }
                ) { paddingValues ->

                    Column(
                        modifier = Modifier
                            .padding(paddingValues)
                            .padding(start = 38.dp, end = 150.dp)
                            .fillMaxWidth()
                            .verticalScroll(rememberScrollState())
                    ) {

                        Text(
                            text = data.name,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.width(100.dp),
                            fontSize = 18.sp,
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = data.variety,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.width(100.dp),
                            fontSize = 18.sp,
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = stringResource(R.string.country),
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.width(100.dp),
                            fontSize = 18.sp,
                            color = AppColor.Brown
                        )

                        Text(
                            text = data.country,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.width(100.dp),
                            fontSize = 16.sp,
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = stringResource(id = R.string.region),
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.width(100.dp),
                            fontSize = 18.sp,
                        )

                        Text(
                            text = data.region,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.width(100.dp),
                            fontSize = 18.sp,
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = stringResource(id = R.string.main_grape),
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.width(100.dp),
                            fontSize = 18.sp,
                        )

                        Text(
                            text = data.main_grape,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.width(100.dp),
                            fontSize = 18.sp,
                        )

                    }
                }
                val image = data.image.getImageFromDrawableResources(LocalContext.current)

                Image(
                    painter = painterResource(id = image),
                    contentDescription = "wine image",
                    modifier = Modifier
                        .fillMaxHeight()
                        .offset(y = 20.dp, x = 100.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}