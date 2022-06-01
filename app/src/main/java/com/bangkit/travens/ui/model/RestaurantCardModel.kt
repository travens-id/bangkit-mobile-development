package com.bangkit.travens.ui.model

import com.bangkit.travens.R

data class RestaurantCardModel(
    val restaurantImage: Int,
    val restaurantTitle: String
)

val RestaurantCardModelList = listOf(
    RestaurantCardModel(
        R.drawable.restaurant_1,
        "Mie Gacoan"
    ),
    RestaurantCardModel(
        R.drawable.restaurant_2,
        "Onni House"
    ),
    RestaurantCardModel(
        R.drawable.restaurant_3,
        "Ayam Geprek Orlen"
    ),
    RestaurantCardModel(
        R.drawable.restaurant_4,
        "Ropang Plus Plus"
    )
)