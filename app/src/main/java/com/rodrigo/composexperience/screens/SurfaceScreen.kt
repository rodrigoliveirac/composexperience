package com.rodrigo.composexperience.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.rodrigo.composexperience.R
import com.rodrigo.composexperience.router.BackButtonHandler
import com.rodrigo.composexperience.router.ComposExperienceRouter
import com.rodrigo.composexperience.router.Screen

@Composable
fun SurfaceScreen(modifier: Modifier = Modifier) {

    Box(modifier = modifier.fillMaxSize()) {
        MySurface(modifier = modifier.align(Alignment.Center))
    }

    BackButtonHandler {
        ComposExperienceRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MySurface(modifier: Modifier) {
    Surface(
        modifier = modifier.size(100.dp), // 1
        color = Color.LightGray, // 2
        contentColor = colorResource(id = R.color.colorPrimary), // 2
        elevation = 1.dp, // 3
        border = BorderStroke(1.dp, Color.Black) // 4
    ) {
        MyColumn() // 5
    }
}