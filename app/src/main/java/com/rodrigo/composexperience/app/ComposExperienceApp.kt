package com.rodrigo.composexperience.app

import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.rodrigo.composexperience.router.ComposExperienceRouter
import com.rodrigo.composexperience.router.Screen
import com.rodrigo.composexperience.screens.*

@Composable
fun ComposExperienceApp() {
    Surface(color = MaterialTheme.colors.background) {
        Crossfade(targetState = ComposExperienceRouter.currentScreen) { screenState ->
            when (screenState.value) {
                is Screen.Navigation -> NavigationScreen()
                is Screen.Text -> TextScreen()
                is Screen.TextField -> TextFieldScreen()
                is Screen.Buttons -> ExploreButtonsScreen()
                is Screen.ProgressIndicator -> ProgressIndicatorScreen()
                is Screen.AlertDialog -> AlertDialogScreen()
                is Screen.Row -> RowScreen()
                is Screen.Column -> ColumnScreen()
                is Screen.Box -> BoxScreen()
                is Screen.Surface -> SurfaceScreen()
                is Screen.Scaffold -> ScaffoldScreen()
            }
        }
    }
}