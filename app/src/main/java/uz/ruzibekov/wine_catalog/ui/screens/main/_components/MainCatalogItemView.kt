package uz.ruzibekov.wine_catalog.ui.screens.main._components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ruzibekov.wine_catalog.R
import uz.ruzibekov.wine_catalog.ui.theme.AppColor

object MainCatalogItemView {


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Default(onClick: () -> Unit) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 37.dp, end = 37.dp, bottom = 16.dp)
                .height(120.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(10.dp),
            onClick = {
                onClick()
            }
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 30.dp, vertical = 24.dp)
            ) {

                Text(
                    text = "Broken Heart",
                    style = MaterialTheme.typography.titleLarge,
                    fontSize = 28.sp
                )

                Spacer(modifier = Modifier.height(14.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "Broken Heart",
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 16.sp,
                        color = AppColor.Orange
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Icon(
                        painter = painterResource(id = R.drawable.ic_next_arrow),
                        contentDescription = "next arrow icon",
                        tint = AppColor.Orange
                    )
                }
            }
        }
    }
}