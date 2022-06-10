package com.bangkit.travens.presentation.ui.carousel

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.travens.presentation.ui.component.BlogCard
import com.bangkit.travens.presentation.ui.model.BlogCardModelList

@Composable
fun BlogCarousel() {
    Column(
        modifier = Modifier.padding(bottom = 56.dp)
    ) {
        for (item in BlogCardModelList.indices) {
            val newCard = BlogCardModelList[item]
            BlogCard(
                blogImg = newCard.blogImg,
                blogAvtr = newCard.blogAvtr,
                blogName = newCard.blogName,
                blogDesc = newCard.blogDesc,
                blogDate = newCard.blogDate,
                blogView = newCard.blogView,
                blogLike = newCard.blogLike
            )
        }
    }
}

@Preview
@Composable
fun BlogCarouselPreview() {
    BlogCarousel()
}