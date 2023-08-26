package uz.ruzibekov.wine_catalog.ui.screens.catalog._components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ruzibekov.wine_catalog.R
import uz.ruzibekov.wine_catalog.ui.theme.AppColor

object WineItemView {

    @Composable
    fun Default() {

        Box(contentAlignment = Alignment.BottomEnd) {

            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 20.dp, start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(containerColor = AppColor.White),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 40.dp, bottom = 20.dp, start = 30.dp, end = 30.dp)
                ) {

                    Text(
                        text = "Bodegas Beronia",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(110.dp),
                        fontSize = 32.sp,
                        color = AppColor.Orange
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Bodegas Beronia",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 13.sp,
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Country:",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 13.sp,
                    )

                    Text(
                        text = "Spain",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 13.sp,
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Country:",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 13.sp,
                    )

                    Text(
                        text = "Spain",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 13.sp,
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Country:",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 13.sp,
                    )

                    Text(
                        text = "Spain",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 13.sp,
                    )

                    Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "Spain",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.width(100.dp),
                        fontSize = 13.sp,
                    )
                }
            }

            Image(
                painter = painterResource(id = R.drawable.img_wine),
                contentDescription = "wine image"
            )
        }
    }
}