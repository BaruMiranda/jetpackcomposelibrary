package com.fraporitmos.jetpackcomponents

import androidx.compose.ui.graphics.Color

class JCColors(
    var primaryColor: Color = Color(0xFF386A20),
    var secondaryColor: Color = Color(0xFF55624C),
    var secondaryContainer: Color = Color(0xFFE7E9DF),


    var whiteColor : Color = Color(0xFFFFFFFF),
    var blackColor : Color = Color(0xFF000000),


) {
    fun setPrimaryColorValue(color: Color) {
        primaryColor = color
    }

    fun setSecondaryColorValue(color: Color) {
        secondaryColor = color
    }


    fun getPrimaryColorValue(): Color {
        return primaryColor
    }

    fun getSecondaryContainerValue(): Color {
        return secondaryContainer
    }
    fun getSecondaryColorValue(): Color {
        return secondaryColor
    }

    fun getWhiteColorValue(): Color {
        return whiteColor
    }



}