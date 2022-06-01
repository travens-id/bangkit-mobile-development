package com.bangkit.travens.presentation.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bangkit.travens.R


@Composable
fun OnboardCard(
    painter: Int,
    title: String
) {
    Surface(
        modifier = Modifier.height(170.dp),
    ) {
        Image(
            painter = painterResource(id = painter),
            contentDescription = "banner image"
        )
        Column(
            modifier = Modifier
                .padding(32.dp)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(0.5f),
                color = Color.White,
                fontSize = 16.sp,
                text = title
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardCardPreview() {
    OnboardCard(
        painter = R.drawable.banner_1,
        title = "Temukan Rencana Perjalanan Impianmu!"
    )
}