package com.fraporitmos.jetpackcomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter


@Composable
fun CardSimpleElevated() {
    val painter =
        rememberImagePainter(data = "https://res.cloudinary.com/frapoteam/image/upload/v1680751808/wengang-zhai-4gVV7PyP7v8-unsplash_patknu.jpg")

    Card(
        //shape = MaterialTheme.shapes.medium,
        shape = RoundedCornerShape(8.dp),
        // modifier = modifier.size(280.dp, 240.dp)
        modifier = Modifier.padding(10.dp,5.dp,10.dp,10.dp),
        //set card elevation of the card
        elevation = CardDefaults.cardElevation(
            defaultElevation =  10.dp,
        ),
        colors = CardDefaults.cardColors(
            containerColor =  JCColors().getWhiteColorValue(),
        ),
    ) {
        Column(modifier = Modifier.clickable(onClick = {  })) {

            Image(
                painter = painter,
                contentDescription = null, // decorative
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
            )

            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Get your app ready for M3",
                    style = TextStyle(

                        fontSize =  20.sp,
                        fontWeight = FontWeight.Bold,
                    ),

                    fontWeight = FontWeight.Bold,

                    maxLines = 2,


                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "New guidelines and documentation to help you integrate the latest features and components into your existing product.",
                    //maxLines = 1,
                    //overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.titleSmall,
                )
            }
        }
    }
}