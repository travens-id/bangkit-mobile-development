package com.bangkit.travens.presentation.ui.model

import com.bangkit.travens.R

data class BlogCardModel(
    val blogImg: Int,
    val blogAvtr: Int,
    val blogName: String,
    val blogDesc: String,
    val blogDate: String,
    val blogView: String,
    val blogLike: String
)

val BlogCardModelList = listOf(
    BlogCardModel(
        blogImg = R.drawable.blog_1,
        blogAvtr = R.drawable.author_1,
        blogName = "Jane Cassie",
        blogDesc = "Lombok dengan sejuta pesonanya",
        blogDate = "25 Juni",
        blogView = "20rb",
        blogLike = "2rb"
    ),
    BlogCardModel(
        blogImg = R.drawable.blog_2,
        blogAvtr = R.drawable.author_2,
        blogName = "Mark",
        blogDesc = "Apa yang saya pelajari di Bali selama 2 minggu",
        blogDate = "2 Juni",
        blogView = "17rb",
        blogLike = "1rb"
    ),
    BlogCardModel(
        blogImg = R.drawable.blog_3,
        blogAvtr = R.drawable.author_3,
        blogName = "Marissa",
        blogDesc = "Pesona dan Sejarah Candi Borobudur",
        blogDate = "2 Juni",
        blogView = "19rb",
        blogLike = "3rb"
    ),
    BlogCardModel(
        blogImg = R.drawable.blog_4,
        blogAvtr = R.drawable.author_4,
        blogName = "Setya Adi",
        blogDesc = "Tips Liburan di Kala Pandemi",
        blogDate = "22 Juli",
        blogView = "15rb",
        blogLike = "1rb"
    )
)