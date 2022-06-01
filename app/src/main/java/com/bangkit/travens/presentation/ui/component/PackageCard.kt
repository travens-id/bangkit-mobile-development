package com.bangkit.travens.presentation.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.travens.R

@Composable
fun PackageCard(
    painter: Int,
    place: String,
    duration: String,
    price: String
){
    Surface(
        modifier = Modifier
            .background(color = Color.Transparent)
            .width(180.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 8.dp
    ) {
        Column {
            Image(
                painter = painterResource(id = painter),
                contentDescription = "Kota Tua",
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            ) {
                Text(
                    text = place,
                    fontWeight = FontWeight.Bold
                )
                Row {
                    for (i in 1..5) {
                        Icon(
                            modifier = Modifier.size(12.dp),
                            painter = painterResource(id = R.drawable.ic_star),
                            contentDescription = "Star Icon",
                            tint = Color.Yellow
                        )
                    }
                }
                Text(text = duration)
                Text(text = price, fontWeight = FontWeight.Bold)
            }
        }
    }

}

@Preview
@Composable
fun PackageCardPreview() {
    PackageCard(
        painter = R.drawable.travel_package_1,
        place = "Lombok",
        duration = "3 Hari 2 Malam",
        price = "Rp2.450k/orang"
    )
}