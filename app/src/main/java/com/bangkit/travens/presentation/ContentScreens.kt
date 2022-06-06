package com.bangkit.travens.presentation

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.bangkit.travens.presentation.ui.fragment.HomeFragment
import com.bangkit.travens.presentation.ui.fragment.ItineraryFragment
import com.bangkit.travens.presentation.ui.fragment.PlaygroundFragment
import com.bangkit.travens.presentation.ui.profile.ProfileActivity
import com.bangkit.travens.presentation.ui.theme.Primary60

@Composable
fun HomeScreen() {
    HomeFragment()
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@Composable
fun PlaygroundScreen() {
    PlaygroundFragment()
}

@Preview(showBackground = true)
@Composable
fun PlaygroundScreenPreview() {
    PlaygroundScreen()
}

@Composable
fun ItineraryScreen() {
    ItineraryFragment()
}

@Preview(showBackground = true)
@Composable
fun ItineraryScreenPreview() {
    ItineraryScreen()
}


@Composable
fun MarketplaceScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Marketplace View",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MarketplaceScreenPreview() {
    MarketplaceScreen()
}

@Composable
fun ProfileScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .wrapContentSize(Alignment.Center)
    ) {
        Button(
            onClick = {
            context.startActivity(Intent(context, ProfileActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(Primary60)
        ) {
            Text(text = "Go To Profile Page", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}