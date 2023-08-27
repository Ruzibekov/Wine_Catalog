package uz.ruzibekov.wine_catalog.ui.screens.catalog._components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ruzibekov.wine_catalog.R
import uz.ruzibekov.wine_catalog.data.model.WineData
import uz.ruzibekov.wine_catalog.getImageFromDrawableResources
import uz.ruzibekov.wine_catalog.ui.theme.AppColor

object CatalogWineItemView {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Default(data: WineData, onClick: () -> Unit) {

        Box(contentAlignment = Alignment.BottomEnd) {

            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 20.dp, start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(containerColor = AppColor.White),
                elevation = CardDefaults.cardElevation(10.dp),
                onClick = {
                    onClick()
                }
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 40.dp, bottom = 20.dp, start = 30.dp, end = 30.dp)
                ) {

                    Row(verticalAlignment = Alignment.Bottom) {

                        Text(
                            text = data.name,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.width(120.dp),
                            fontSize = 32.sp,
                            color = AppColor.Orange
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Icon(
                            painter = painterResource(id = R.drawable.ic_next_arrow),
                            contentDescription = "next arrow icon",
                            modifier = Modifier.size(24.dp),
                            tint = AppColor.Orange
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = data.variety,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 14.sp,
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = stringResource(R.string.country),
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 14.sp,
                        color = AppColor.Brown
                    )

                    Text(
                        text = data.country,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 13.sp,
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = stringResource(id = R.string.region),
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 14.sp,
                    )

                    Text(
                        text = data.region,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 16.sp,
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = stringResource(id = R.string.main_grape),
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 14.sp,
                    )

                    Text(
                        text = data.main_grape,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 13.sp,
                    )

                    Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "750ML",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 13.sp,
                    )
                }
            }

            val context = LocalContext.current
            val resourceId = data.image.getImageFromDrawableResources(context)

            Image(
                painter = painterResource(id = resourceId),
                contentDescription = "wine image",
                modifier = Modifier.fillMaxHeight(),
                alignment = Alignment.BottomEnd,
            )
        }
    }
}