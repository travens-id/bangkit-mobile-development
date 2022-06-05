package com.bangkit.travens.presentation.ui

var itenararyList = mutableListOf<Itenarary>()

const val ITENARARY_ID_EXTRA = "itenararyExtra"

class Itenarary (
	var cover : Int,
	var title :String,
	var rating : Int,
	var days : String,
	var budget : String,
	val id :Int? = itenararyList.size
)