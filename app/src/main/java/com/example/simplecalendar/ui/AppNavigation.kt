package com.example.simplecalendar.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.simplecalendar.ui.calendar.CalendarScreen
import com.example.simplecalendar.ui.settings.SettingsScreen
import com.example.simplecalendar.ui.theme.AppThemeStyle

object Routes {
    const val CALENDAR = "calendar"
    const val SETTINGS = "settings"
}

@Composable
fun AppNavigation(
    currentTheme: AppThemeStyle,
    onThemeChange: (AppThemeStyle) -> Unit
) {
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.CALENDAR) {
        composable(Routes.CALENDAR) {
            CalendarScreen(
                onSettingsClick = { navController.navigate(Routes.SETTINGS) }
            )
        }
        composable(Routes.SETTINGS) {
            SettingsScreen(
                currentTheme = currentTheme,
                onThemeChange = onThemeChange,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
