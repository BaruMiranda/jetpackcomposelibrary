package com.fraporitmos.jetpackcomponents.Textfield

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun TextFielIcon() {

    val textState = remember { mutableStateOf("") }

    TextField(
        value = textState.value,
        onValueChange = { textState.value = it },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        label = { Text(text = "Nombre") },
        leadingIcon = { Icon(Icons.Filled.Person, contentDescription = null) },
        trailingIcon = {
            if (textState.value.isNotBlank()) {
                IconButton(onClick = { textState.value = "" }) {
                    Icon(Icons.Filled.Clear, contentDescription = null)
                }
            }
        },
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = MaterialTheme.colors.surface,
            textColor = MaterialTheme.colors.onSurface,
            cursorColor = MaterialTheme.colors.onSurface,
            focusedIndicatorColor = MaterialTheme.colors.primary,
            unfocusedIndicatorColor = MaterialTheme.colors.onSurface
        ),
    )

}
