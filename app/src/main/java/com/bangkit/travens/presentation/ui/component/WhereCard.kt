package com.bangkit.travens.presentation.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bangkit.travens.R

@Composable
fun WhereCard() {
    Surface(
        modifier = Modifier
            .background(color = Color.White)
            .padding(start = 16.dp, top = 0.dp, end = 16.dp, bottom = 16.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.background(color = Color.White)
        ) {
            Surface(
                modifier = Modifier.background(color = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.featured_destination_1),
                    contentDescription = "banner image",
                    contentScale = ContentScale.FillBounds
                )
                Column(
                    modifier = Modifier
                        .padding(32.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        text = "JAKARTA"
                    )
                }
            }
            Surface(
                modifier = Modifier.background(color = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.featured_destination_2),
                    contentDescription = "banner image",
                    contentScale = ContentScale.FillBounds
                )
                Column(
                    modifier = Modifier
                        .padding(32.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        text = "BALI"
                    )
                }
            }
            Surface(
                modifier = Modifier.background(color = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.featured_destination_3),
                    contentDescription = "banner image",
                    contentScale = ContentScale.FillBounds
                )
                Column(
                    modifier = Modifier
                        .padding(32.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        text = "YOGYAKARTA"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WhereCardPreview() {
    WhereCard()
}