package com.example.sleepy_jc.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.sleepy_jc.R


private val appFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.exo_regular,
            weight = FontWeight.Normal
        ),
        Font(
            resId = R.font.exo_bold,
            weight = FontWeight.Bold
        ),
        Font(
            resId = R.font.exo_thin,
            weight = FontWeight.Thin
        )
    )
)


val Typography = Typography(
    h1 = TextStyle(
        fontFamily = appFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = appFontFamily,
        fontWeight = FontWeight.Normal
    )
)