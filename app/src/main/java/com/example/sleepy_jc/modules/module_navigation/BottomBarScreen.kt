package com.example.sleepy_jc.modules.module_navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.sleepy_jc.R

sealed class BottomBarScreen (
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Sleep : BottomBarScreen(
        route = "sleep",
        title = "Уснуть",
        icon = Icons.Filled.Home
    )
    object Wake : BottomBarScreen(
        route = "wake",
        title = "Проснуться",
        icon = Icons.Default.Person
    )
    object Alarm : BottomBarScreen(
        route = "alarm",
        title = "Будильник",
        icon = Icons.Default.AccountCircle
    )
}
