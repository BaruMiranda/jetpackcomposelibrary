package com.fraporitmos.jetpackcomponents
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics

@Composable
fun SwitchM3 (
    modifier: Modifier,
    state:Boolean,
    onStateChange: (Boolean) -> Unit
    ){
    Switch(
        modifier = modifier.semantics { contentDescription = "Demo" },
        checked = state,
        colors = SwitchDefaults.colors(
           checkedThumbColor = JCColors().getWhiteColorValue(),
           checkedTrackColor =  JCColors().getPrimaryColorValue()
        ),
        onCheckedChange =  onStateChange
    )

}