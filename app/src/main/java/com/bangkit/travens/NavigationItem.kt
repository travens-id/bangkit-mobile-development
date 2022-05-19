package com.bangkit.travens

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Playground : NavigationItem("playground", R.drawable.ic_playground, "Playground")
    object Itinerary : NavigationItem("itinerary", R.drawable.ic_location, "Itinerary")
    object Marketplace : NavigationItem("marketplace", R.drawable.ic_cart, "Marketplace")
    object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
}
