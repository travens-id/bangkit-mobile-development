package com.bangkit.travens.presentation.ui.model

import com.bangkit.travens.R

data class OnboardCardModel(
    val onboardImage: Int,
    val onboardTitle: String
)

val OnboardCardModelList = listOf(
    OnboardCardModel(
        R.drawable.banner_1,
        "Temukan Rencana Perjalanan Impianmu!"
    ),
    OnboardCardModel(
        R.drawable.banner_2,
        "Wisata di Perkotaan yang Seru Buat Kamu!"
    ),
    OnboardCardModel(
        R.drawable.banner_3,
        "Rasakan Pengalaman Terbaik!"
    )
)
