package uz.ruzibekov.wine_catalog.ui.screens.catalog._components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ruzibekov.wine_catalog.R
import uz.ruzibekov.wine_catalog.ui.theme.AppColor
import uz.ruzibekov.wine_catalog.ui.theme.Brushes

object CatalogTopBarView {

    @Composable
    fun Default() {

        Card(
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 30.dp,
                bottomEnd = 30.dp
            )
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Brushes.PrimaryBrush)
                    .padding(top = 38.dp, start = 38.dp, end = 38.dp, bottom = 20.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.ic_back),
                        contentDescription = "details icon",
                        tint = AppColor.White
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.ic_details),
                        contentDescription = "details icon",
                        tint = AppColor.White
                    )
                }

                Spacer(modifier = Modifier.height(23.dp))

                Text(
                    text = "Vino nomi",
                    style = MaterialTheme.typography.titleLarge,
                    fontSize = 42.sp,
                    color = AppColor.White
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = stringResource(id = R.string.catalog_subtitle),
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 18.sp,
                    color = AppColor.White
                )
            }
        }
    }
}