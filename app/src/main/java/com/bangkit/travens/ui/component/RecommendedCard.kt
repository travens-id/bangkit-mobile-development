package com.bangkit.travens.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bangkit.travens.R

@Composable
fun RecommendedCard(
    painter: Int,
    title: String
) {
    Surface(
        modifier = Modifier.height(200.dp),
    ) {
        Image(
            painter = painterResource(id = painter),
            contentDescription = "banner image"
        )
        Column(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 32.dp)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(0.7f),
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 14.sp,
                text = title
            )
        }
    }
}

@Preview
@Composable
fun RecommendedCardPreview() {
    RecommendedCard(painter = R.drawable.wisata_lombok, title = "Lombok")
}