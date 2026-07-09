package com.example.simplecalendar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.simplecalendar.ui.AppNavigation
import com.example.simplecalendar.ui.theme.SimpleCalendarTheme
import com.example.simplecalendar.ui.theme.AppThemeStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var currentTheme by remember { mutableStateOf(AppThemeStyle.IOS_LIGHT) }
            SimpleCalendarTheme(themeStyle = currentTheme) {
                AppNavigation(
                    currentTheme = currentTheme,
                    onThemeChange = { currentTheme = it }
                )
            }
        }
    }
}
