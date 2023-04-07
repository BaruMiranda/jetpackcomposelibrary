package com.fraporitmos.jc.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.fraporitmos.jc.ui.theme.white
import com.fraporitmos.jetpackcomponents.CardElevatedShape
import com.fraporitmos.jetpackcomponents.CardSimpleElevated

@Preview
@Composable
fun ScreenCard(){
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(white)
    ){
        val (cardSimpleElevated,cardElevatedShape) = createRefs()
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
                .constrainAs(cardSimpleElevated) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }) {

            CardSimpleElevated()

        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
                .constrainAs(cardElevatedShape) {
                    top.linkTo(cardSimpleElevated.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }) {

            CardElevatedShape()

        }

    }


}