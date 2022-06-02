package com.bangkit.travens.ui

var itenararyList = mutableListOf<Itenarary>()

val ITENARARY_ID_EXTRA = "itenararyExtra"

class Itenarary (
	var cover : Int,
	var title :String,
	var rating : Int,
	var days : String,
	var budget : String,
	val id :Int? = itenararyList.size
)