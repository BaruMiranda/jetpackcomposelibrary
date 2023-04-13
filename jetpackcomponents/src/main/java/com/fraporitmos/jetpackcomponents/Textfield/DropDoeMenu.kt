package com.fraporitmos.jetpackcomponents.Textfield

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DropDoeMenu() {

    var selectText by remember {
        mutableStateOf("")
    }
    var expanded by remember {
        mutableStateOf(false)
    }
    val list = listOf("chocolate", "helado", "gelatina")
    Column(
        Modifier
            .padding(16.dp)
    ) {
        androidx.compose.material.OutlinedTextField(
            value = selectText,
            onValueChange = { selectText = it },
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { expanded = true }
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            list.forEach { list ->
                DropdownMenuItem(onClick = {
                    expanded = false
                    selectText = list
                }) {
                    Text(text = list)
                }
            }
        }
    }

}