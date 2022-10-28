package com.rodrigo.composexperience.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.rodrigo.composexperience.R
import com.rodrigo.composexperience.router.BackButtonHandler
import com.rodrigo.composexperience.router.ComposExperienceRouter
import com.rodrigo.composexperience.router.Screen

@Composable
fun TextScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyText()
    }

    BackButtonHandler {
        ComposExperienceRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyText() {

    Text(
        text = stringResource(id = R.string.jetpack_compose),
        fontStyle = FontStyle.Italic,
        color = colorResource(id = R.color.colorPrimary),
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold
    )
}



@Composable
@Preview
fun MyTextPreview() {
    MyText()
}