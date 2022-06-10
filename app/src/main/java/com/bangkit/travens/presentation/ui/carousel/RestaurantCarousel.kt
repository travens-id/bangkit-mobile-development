package com.bangkit.travens.presentation.ui.carousel

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.travens.presentation.ui.component.RecommendedCard
import com.bangkit.travens.presentation.ui.model.RestaurantCardModelList

@Composable
fun RestaurantCarousel() {
    Row(
        modifier = Modifier
            .horizontalScroll(state = ScrollState(1))
            .padding(start = 16.dp, end = 16.dp, bottom = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (item in RestaurantCardModelList.indices) {
            val newCard = RestaurantCardModelList[item]
            RecommendedCard(
                painter = newCard.restaurantImage,
                title = newCard.restaurantTitle
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantCarouselPreview() {
    RestaurantCarousel()
}