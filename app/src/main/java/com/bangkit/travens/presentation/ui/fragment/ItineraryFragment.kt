package com.bangkit.travens.presentation.ui.fragment

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.travens.presentation.ui.carousel.OnboardCarousel
import com.bangkit.travens.presentation.ui.carousel.PackageCarousel
import com.bangkit.travens.presentation.ui.carousel.RecommendedCarousel
import com.bangkit.travens.presentation.ui.carousel.RestaurantCarousel
import com.bangkit.travens.presentation.ui.component.FeaturedCard
import com.bangkit.travens.presentation.ui.component.TitleText
import com.bangkit.travens.presentation.ui.component.WhereCard

@Composable
fun ItineraryFragment() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(bottom = 8.dp)
            .verticalScroll(state = ScrollState(1))
    ) {
        TitleText(title = "Promo Untuk Kamu")
        OnboardCarousel()
        TitleText(title = "Mau Kemana?")
        WhereCard()
        TitleText(title = "Rekomendasi Tujuan Wisata")
        RecommendedCarousel()
        TitleText(title = "Rekomendasi Restoran")
        RestaurantCarousel()
        TitleText(title = "Premium Itinerary")
        FeaturedCard()
        TitleText(title = "Paket Liburan")
        PackageCarousel(from = 0, to = 1)
        PackageCarousel(from = 2, to = 3)
        Spacer(modifier = Modifier.padding(vertical = 28.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ItineraryFragmentPreview() {
    ItineraryFragment()
}