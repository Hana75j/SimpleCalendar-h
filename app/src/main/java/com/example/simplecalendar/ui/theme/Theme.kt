package com.example.simplecalendar.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

enum class AppThemeStyle {
    IOS_LIGHT, IOS_DARK, COLORFUL, MINIMAL
}

private val IosLightColors = lightColorScheme(
    primary = Color(0xFF007AFF),
    secondary = Color(0xFF34C759),
    tertiary = Color(0xFFFF9500),
    background = Color(0xFFF2F2F7),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color.White,
    onBackground = Color(0xFF000000),
    onSurface = Color(0xFF1C1C1E)
)

private val IosDarkColors = darkColorScheme(
    primary = Color(0xFF0A84FF),
    secondary = Color(0xFF30D158),
    tertiary = Color(0xFFFF9F0A),
    background = Color(0xFF000000),
    surface = Color(0xFF1C1C1E),
    onPrimary = Color.White,
    onBackground = Color(0xFFFFFFFF),
    onSurface = Color(0xFFE5E5EA)
)

private val ColorfulColors = lightColorScheme(
    primary = Color(0xFFAF52DE),
    secondary = Color(0xFFFF2D55),
    tertiary = Color(0xFFFFCC00),
    background = Color(0xFFFFF0F5),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color.White,
    onBackground = Color(0xFF3A0CA3),
    onSurface = Color(0xFF3A0CA3)
)

private val MinimalColors = lightColorScheme(
    primary = Color(0xFF444444),
    secondary = Color(0xFF888888),
    tertiary = Color(0xFFAAAAAA),
    background = Color(0xFFFFFFFF),
    surface = Color(0xFFF8F8F8),
    onPrimary = Color.White,
    onBackground = Color(0xFF111111),
    onSurface = Color(0xFF222222)
)

@Composable
fun SimpleCalendarTheme(
    themeStyle: AppThemeStyle = AppThemeStyle.IOS_LIGHT,
    content: @Composable () -> Unit
) {
    val colorScheme = when (themeStyle) {
        AppThemeStyle.IOS_LIGHT -> IosLightColors
        AppThemeStyle.IOS_DARK -> IosDarkColors
        AppThemeStyle.COLORFUL -> ColorfulColors
        AppThemeStyle.MINIMAL -> MinimalColors
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
