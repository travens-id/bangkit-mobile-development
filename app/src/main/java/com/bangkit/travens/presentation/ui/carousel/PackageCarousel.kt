package com.bangkit.travens.presentation.ui.carousel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.travens.presentation.ui.component.PackageCard
import com.bangkit.travens.presentation.ui.model.PackageCardModelList

@Composable
fun PackageCarousel(
    from: Int,
    to: Int
) {
    val list = PackageCardModelList
    Row(
        modifier = Modifier.padding(start = 16.dp, top = 0.dp, end = 16.dp, bottom = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (item in from..to) {
            val newCard = list[item]
            PackageCard(
                painter = newCard.packageImg,
                place = newCard.packagePlace,
                duration = newCard.packageDuration,
                price = newCard.packagePrice
            )
        }
    }



}

@Preview(showBackground = true)
@Composable
fun PackageCarouselPreview() {
    PackageCarousel(0,1)
}