package com.bangkit.travens.presentation.ui.carousel

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.travens.presentation.ui.component.OnboardCard
import com.bangkit.travens.presentation.ui.model.OnboardCardModelList
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardCarousel() {
    Column(
        Modifier
            .padding(start = 8.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)
    ) {
        HorizontalPager(count = OnboardCardModelList.size) { page ->
            val newCard = OnboardCardModelList[page]
            OnboardCard(painter = newCard.onboardImage, title = newCard.onboardTitle)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardCarouselPreview() {
    OnboardCarousel()
}