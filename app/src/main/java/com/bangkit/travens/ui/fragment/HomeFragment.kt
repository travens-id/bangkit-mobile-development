package com.bangkit.travens.ui.fragment

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.travens.ui.carousel.BlogCarousel
import com.bangkit.travens.ui.carousel.OnboardCarousel
import com.bangkit.travens.ui.carousel.RecommendedCarousel
import com.bangkit.travens.ui.component.*

@Composable
fun HomeFragment() {
    Column(
        Modifier
            .background(Color.White)
            .padding(bottom = 8.dp)
            .verticalScroll(state = ScrollState(1))
    ) {
        ProfileBanner()
        SearchBox()
        OnboardCarousel()
        TitleText(title = "Rekomendasi Tujuan Wisata")
        RecommendedCarousel()
        TitleText(title = "Produk Unggulan")
        FeaturedCard()
        TitleText(title = "Blog")
        BlogCarousel()
    }
}

@Preview(showBackground = true)
@Composable
fun HomeFragmentPreview() {
    HomeFragment()
}