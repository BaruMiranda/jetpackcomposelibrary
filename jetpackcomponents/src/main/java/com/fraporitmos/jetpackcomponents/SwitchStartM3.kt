package com.fraporitmos.jetpackcomponents

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun SwitchStartM3(
    modifier: Modifier,
    text: String,
    state: Boolean,
    onStateChange: (Boolean) -> Unit,
    fontWeight: FontWeight? = MaterialTheme.typography.body1.fontWeight,

    ) {
    Row(
        Modifier
            .fillMaxWidth()
            .height(48.dp)
            .selectable(
                selected = state,
                onClick = { onStateChange(!state) },
                role = Role.Switch
            )
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {


     Switch(
         modifier = modifier.semantics { contentDescription = "Demo with icon" },
         checked = state,
            onCheckedChange = onStateChange,
            colors = SwitchDefaults.colors(
                checkedThumbColor = JCColors().getWhiteColorValue(),
                checkedTrackColor = JCColors().getPrimaryColorValue()
            )
        )
        Text(
            text = text,
            modifier = Modifier.padding(start = 16.dp),
            style = MaterialTheme.typography.body1.copy(
                fontWeight =  MaterialTheme.typography.body1.fontWeight
            ),

        )
    }
}