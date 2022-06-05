package com.bangkit.travens.presentation.ui

var favList = mutableListOf<Favourite>()

const val FAV_ID_EXTRA = "favouriteExtra"

class Favourite (
	var img : Int,
	var jobdesc : String,
	var nama : String,
	var rating : Int,
	var icon : Int,
	var desc : String,
	var price : String,
	val id : Int? = favList.size
)