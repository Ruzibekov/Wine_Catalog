package uz.ruzibekov.wine_catalog.ui.screens.details._components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import uz.ruzibekov.wine_catalog.R

object DetailsTopBarView {

    @Composable
    fun Default(onClick: () -> Unit) {

        IconButton(
            onClick = onClick,
            modifier = Modifier
                .padding(38.dp)
                .size(24.dp)
        ) {

            Icon(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = "back arrow icon",
            )
        }
    }
}