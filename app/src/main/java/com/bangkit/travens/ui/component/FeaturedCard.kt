package com.bangkit.travens.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.travens.R
import com.bangkit.travens.ui.theme.Link
import com.bangkit.travens.ui.theme.Primary60
import com.bangkit.travens.ui.theme.Secondary

@Composable
fun FeaturedCard() {
    Surface(
        modifier = Modifier
            .padding(start = 16.dp, top = 0.dp, end = 16.dp, bottom = 16.dp)
            .fillMaxWidth()
            .background(color = Color.White),
        shape = RoundedCornerShape(8.dp),
        elevation = 8.dp
    ) { Column {
        Image(
            painter = painterResource(id = R.drawable.premium_itinerary),
            contentDescription = "Kota Tua"
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically)
            ) {
                Text(text = "Premium Itinerary", color = Link)
                Text(text = "Kota Tua Jakarta", fontWeight = FontWeight.Bold)
                Row {
                    Icon(painter = painterResource(R.drawable.ic_place), contentDescription = "place icon", tint = Secondary)
                    Text(text = "1 Hari")
                }
                Row {
                    Icon(painter = painterResource(id = R.drawable.ic_price), contentDescription = "price icon", tint = Secondary)
                    Text(text = "Rp49.000")
                    
                }
            }
            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.CenterVertically)
            ) {
                Icon(painter = painterResource(id = R.drawable.ic_favorite), contentDescription = "color", tint = Color.Red)
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Primary60)
                ) {
                    Text(text = "Beli Itinerary", color = Color.White)
                }
            }
        }
    } }
}

@Preview
@Composable
fun FeaturedCardPreview() {
    FeaturedCard()
}