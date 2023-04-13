package com.fraporitmos.jetpackcomponents.Textfield

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedTextField() {

    var text by remember { mutableStateOf("") }
    val context = LocalContext.current
    val outlineColor = TextFieldDefaults.outlinedTextFieldColors(
        focusedBorderColor = MaterialTheme.colors.primary,
        unfocusedBorderColor = Color.LightGray,
        cursorColor = MaterialTheme.colors.primary,
        textColor = MaterialTheme.colors.onSurface,
        leadingIconColor = MaterialTheme.colors.onSurface,
        placeholderColor = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
    )
    Row(modifier = Modifier.padding(16.dp)) {

        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = "Icono de correo electrónico",
            tint = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
        )

        OutlinedTextField(
            value = text,
            onValueChange = { newText -> text = newText },
            modifier = Modifier.padding(start = 8.dp),
            label = { Text(text = "Correo electrónico") },
            placeholder = { Text(text = "Introduce tu correo electrónico") },
            textStyle = MaterialTheme.typography.body1,
            colors = outlineColor,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
            leadingIcon = {
                IconButton(
                    onClick = {
                        text = ""
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Icono de correo electrónico",
                        tint = MaterialTheme.colors.primary
                    )
                }
            }
        )
    }
}