package com.bangkit.travens.ui.model

import com.bangkit.travens.R

data class PackageCardModel(
    val packageImg: Int,
    val packagePlace: String,
    val packageDuration: String,
    val packagePrice: String
)

val PackageCardModelList = listOf(
    PackageCardModel(
        R.drawable.travel_package_1,
        "Lombok",
        "3 Hari 2 Malam",
        "Rp2.450k/orang"
    ),
    PackageCardModel(
        R.drawable.travel_package_2,
        "Malang",
        "3 Hari 2 Malam",
        "Rp2.450k/orang"
    ),
    PackageCardModel(
        R.drawable.travel_package_3,
        "Raja Ampat",
        "5 Hari 4 Malam",
        "Rp6.500k/orang"
    ),
    PackageCardModel(
        R.drawable.travel_package_4,
        "Yogyakarta",
        "5 Hari 4 Malam",
        "Rp6.500k/orang"
    )
)
