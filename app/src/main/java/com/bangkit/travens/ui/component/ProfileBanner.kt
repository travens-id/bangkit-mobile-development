package com.bangkit.travens.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bangkit.travens.ui.theme.Primary60
import com.bangkit.travens.R
import com.bangkit.travens.ui.theme.ExtraLight


@Composable
fun ProfileBanner() {
    Box(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(color = Primary60)
        ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 32.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                text = "Hallo Akun Testing,\n" +
                    "Selamat datang di Travens"
            )
            Box(
                Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(color = ExtraLight)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_profile),
                    contentDescription = "Profile Image",
                    Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                )
            }

        }


    }
}

@Preview(showBackground = true)
@Composable
fun ProfileBannerPreview() {
    ProfileBanner()
}