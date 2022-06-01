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
import com.bangkit.travens.presentation.ui.model.RecommendedCardModelList

@Composable
fun RecommendedCarousel() {
    Row(
        modifier = Modifier
            .horizontalScroll(state = ScrollState(1))
            .padding(start = 16.dp, end = 16.dp, bottom = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (item in RecommendedCardModelList.indices) {
            val newCard = RecommendedCardModelList[item]
            RecommendedCard(painter = newCard.recommendedImage, title = newCard.recommendedTitle)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendedCarouselPreview() {
    RecommendedCarousel()
}