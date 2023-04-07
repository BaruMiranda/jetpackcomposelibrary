package com.fraporitmos.jetpackcomponents

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun SwitchEndM3(
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
        Text(
            text = text,
            style = MaterialTheme.typography.body1.copy(
                fontWeight = fontWeight
            ),
            modifier = Modifier
                .padding(end = 16.dp)
                .weight(1f)
        )
        Switch(
            modifier = modifier.semantics { contentDescription = "Demo with icon" },
            checked = state,
            onCheckedChange = onStateChange,
            colors = SwitchDefaults.colors(
                checkedThumbColor = JCColors().getWhiteColorValue(),
                checkedTrackColor = JCColors().getPrimaryColorValue()
            )
        )
    }
}