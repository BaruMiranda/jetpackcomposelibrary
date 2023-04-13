package com.fraporitmos.jetpackcomponents.Textfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldSimple() {
    Column(modifier = Modifier.fillMaxSize()) {

        val myText = remember { mutableStateOf("") }
        TextField(
            value = myText.value, onValueChange = { myText.value = it }, modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }

}