package com.fraporitmos.jetpackcomponents

import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun SwitchM2(
    modifier: Modifier,
    state: Boolean,
    onStateChange: (Boolean) -> Unit

) {
    Switch(
        checked = state,
        onCheckedChange = onStateChange,
        colors = SwitchDefaults.colors(
            checkedThumbColor = JCColors().getPrimaryColorValue(),
            checkedTrackColor = JCColors().getSecondaryColorValue(),
        )
    )
}
