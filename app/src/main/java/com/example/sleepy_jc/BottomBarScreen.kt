package com.example.sleepy_jc

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomBarScreen (
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Sleep : BottomBarScreen(
        route = "sleep",
        title = "Уснуть",
        icon = Icons.Default.Home
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