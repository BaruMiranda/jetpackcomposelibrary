package com.fraporitmos.jc.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.fraporitmos.jc.ui.theme.Black
import com.fraporitmos.jc.ui.theme.white
import com.fraporitmos.jetpackcomponents.*


@Preview
@Composable
fun ScreenSwitch() {

    val (state1, onStateChange1) = rememberSaveable { mutableStateOf(true) }
    val (state2, onStateChange2) = rememberSaveable { mutableStateOf(false) }
    val (state3, onStateChange3) = rememberSaveable { mutableStateOf(true) }
    val (state4, onStateChange4) = rememberSaveable { mutableStateOf(false) }
    val (state5, onStateChange5) = rememberSaveable { mutableStateOf(true) }
    val (state6, onStateChange6) = rememberSaveable { mutableStateOf(false) }
    val (state7, onStateChange7) = rememberSaveable { mutableStateOf(true) }
    val (state8, onStateChange8) = rememberSaveable { mutableStateOf(false) }
    val (state9, onStateChange9) = rememberSaveable { mutableStateOf(true) }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(white)) {
        val (title, switchM2, switchM3,
            switchM3Icon,switchStartContainer, switchEndContainer) = createRefs()
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
                .constrainAs(title) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }){
            Text(
                text = "Switch Component",
                color = Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(top = 20.dp, bottom = 20.dp)
            )
            Divider()
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
                .constrainAs(switchM2) {
                    top.linkTo(title.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            Text(
                text = "Switch M2",
                color = Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(top = 20.dp)
            )
            SwitchM2(
                modifier = Modifier.padding(top = 2.dp),
                state = state1,
                onStateChange = { onStateChange1(it) }
            )
            Divider()
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
                .constrainAs(switchM3) {
                    top.linkTo(switchM2.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }) {
            Text(
                text = "Switch M3",
                color = Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(top = 20.dp)
            )
            SwitchM3(
                modifier = Modifier.padding(top = 2.dp),
                state = state2,
                onStateChange = { onStateChange2(it) }
            )
            Divider()

        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
                .constrainAs(switchM3Icon) {
                    top.linkTo(switchM3.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }) {
            Text(
                text = "Switch M3 with Icon",
                color = Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(top = 20.dp)
            )
            SwitchM3Icon(
                modifier = Modifier.padding(top = 2.dp),
                state = state3,
                onStateChange = { onStateChange3(it) }
            )
            Divider()
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
                .constrainAs(switchStartContainer) {
                    top.linkTo(switchM3Icon.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }) {
            Text(
                text = "Switch Start Container ",
                color = Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(top = 20.dp, bottom = 20.dp)
            )


            SwitchStartM2(
                Modifier,
                text = "Switch Start M2 ",
                state = state4,
                onStateChange = { onStateChange4(it) }
            )
            SwitchStartM3(
                Modifier,
                text = "Switch Start M3 ",
                state = state5,
                onStateChange = { onStateChange5(it) }
            )

            SwitchStartM3Icon(
                Modifier,
                text = "Switch Start M3 Icon ",
                state = state6,
                onStateChange = { onStateChange6(it) }
            )
            Divider()
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
                .constrainAs(switchEndContainer) {
                    top.linkTo(switchStartContainer.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }) {
            Text(
                text = "Switch End Container ",
                color = Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(top = 20.dp, bottom = 20.dp)
            )
            SwitchEndM2(
                Modifier,
                text = "Switch End M2 ",
                state = state7,
                onStateChange = { onStateChange7(it) }
            )
            SwitchEndM3(
                Modifier,
                text = "Switch End M3 ",
                state = state8,
                onStateChange = { onStateChange8(it) }
            )
            SwitchEndM3Icon(
                Modifier,
                text = "Switch End M3 Icon ",
                state = state9,
                onStateChange = { onStateChange9(it) }
            )
        }
    }
}