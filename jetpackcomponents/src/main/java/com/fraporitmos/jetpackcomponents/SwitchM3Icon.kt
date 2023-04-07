package com.fraporitmos.jetpackcomponents

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics


@Composable
fun SwitchM3Icon (
    modifier: Modifier,
    state:Boolean,
    onStateChange: (Boolean) -> Unit
){
    val icon: @Composable (() -> Unit) = if (state) {
        {
            Icon(
                imageVector = Icons.Filled.DarkMode,
                contentDescription = null,
                modifier = Modifier.size(SwitchDefaults.IconSize),
            )
        }
    } else {
        {
            Icon(
                imageVector = Icons.Filled.LightMode,
                contentDescription = null,
                modifier = Modifier.size(SwitchDefaults.IconSize),
            )
        }
    }
    Switch(
        modifier = Modifier.semantics { contentDescription = "Demo with icon" },
        checked = state,
        onCheckedChange = onStateChange,
        thumbContent = icon,
        colors = SwitchDefaults.colors(
            checkedThumbColor = JCColors().getWhiteColorValue(),
            checkedTrackColor = JCColors().getPrimaryColorValue()
        ),
    )

}