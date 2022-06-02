package com.bangkit.travens.presentation.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bangkit.travens.R
import com.bangkit.travens.presentation.ui.theme.Link

@Composable
fun BlogCard(
    blogImg: Int,
    blogAvtr: Int,
    blogName: String,
    blogDesc: String,
    blogDate: String,
    blogView: String,
    blogLike: String
) {
    Row(
        modifier = Modifier
            .background(Color.White)
            .padding(start = 16.dp, top = 4.dp, end = 16.dp, bottom = 8.dp)
            .wrapContentHeight()
    ) {
        Image(
            modifier = Modifier
                .width(150.dp)
                .clip(RoundedCornerShape(16.dp)),
            painter = painterResource(id = blogImg),
            contentDescription = "Blog Image"
        )
        Column(
            modifier = Modifier
                .height(100.dp)
                .padding(horizontal = 8.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier.padding(end = 8.dp),
                    painter = painterResource(id = blogAvtr),
                    contentDescription = "Blogger Avatar",
                )
                Text(text = blogName)
            }
            Text(text = blogDesc, fontWeight = FontWeight.Bold)
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_date), contentDescription = "Date Icon", tint = Link )
                    Text(text = blogDate, color = Link, fontSize = 12.sp)
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_eye), contentDescription = "View Icon", tint = Link )
                    Text(text = blogView, color = Link, fontSize = 12.sp)
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_like), contentDescription = "Like Icon", tint = Link )
                    Text(text = blogLike, color = Link, fontSize = 12.sp)
                }
            }
        }
    }
    
}

@Preview
@Composable
fun BlogCardPreview() {
    BlogCard(
        blogImg = R.drawable.blog_1,
        blogAvtr = R.drawable.author_1,
        blogName = "Jane Cassie",
        blogDesc = "Lombok dengan sejuta pesonanya",
        blogDate = "25 Juni",
        blogView = "20rb",
        blogLike = "2rb"
    )
}