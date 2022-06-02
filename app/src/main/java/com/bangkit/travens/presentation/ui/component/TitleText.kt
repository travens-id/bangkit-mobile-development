package com.bangkit.travens.presentation.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleText(title: String) {
    Column(
        Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(text = title, fontWeight = FontWeight.Bold, fontSize = 16.sp)
    }
}