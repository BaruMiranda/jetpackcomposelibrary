package com.fraporitmos.jetpackcomponents

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import coil.compose.rememberImagePainter

@Composable
fun CardElevatedShape() {
    val painter =
        rememberImagePainter(data = "https://images.unsplash.com/photo-1628373383885-4be0bc0172fa?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1301&q=80")

    val start = rememberImagePainter(data = "https://res.cloudinary.com/frapoteam/image/upload/v1680748903/icons8-estrella-relleno-80_npun1o.png")
    Surface(
            shape = RoundedCornerShape(16.dp),
            color = Color(0xFFDAE1E7),
            modifier = Modifier
                .height(210.dp)
                .padding(10.dp),
            shadowElevation = 10.dp
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(2f),
                    verticalArrangement = Arrangement.Center
                ) {
                    Surface(
                        shape = RoundedCornerShape(24.dp),
                        modifier = Modifier.wrapContentSize(),
                        color = Color(0xFFD1D5E1)
                    ) {
                        Text(
                            text = "New release",
                            fontSize =  12.sp,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = "Gift Plant",
                        fontSize =  24.sp,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.SemiBold
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Price : 300$")

                    Spacer(modifier = Modifier.height(2.dp))

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "4.0",
                            fontSize =  14.sp,
                            fontWeight = FontWeight.SemiBold,
                            style = MaterialTheme.typography.titleLarge
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(
                            painter = start,
                            tint = Color(0xFFFFAA4A),
                            //size

                            contentDescription = null
                        )

                        Icon(
                            painter = start,
                            tint = Color(0xFFF6B266),
                            contentDescription = null
                        )

                        Icon(
                            painter = start,
                            tint = Color(0xFFF6B266),
                            contentDescription = null
                        )
                        Icon(
                            painter = start,
                            tint = Color(0xFFF6B266),
                            contentDescription = null
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    OutlinedButton(
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color.Black,
                            containerColor = Color.White
                        ),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(
                            text = "Read More",
                            fontSize =  11.sp,
                            fontWeight = FontWeight.SemiBold,
                            style = MaterialTheme.typography.titleLarge
                        )
                    }
                }

                Surface(
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.size(width = 100.dp, height = 140.dp)
                ) {
                    Image(
                        painter = painter,
                        contentScale = ContentScale.Crop,
                        contentDescription = null
                    )
                }
            }
        }

}