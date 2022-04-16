package com.example.sleepy_jc.modules.module_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sleepy_jc.modules.module_alarm.presentation.AlarmScreen
import com.example.sleepy_jc.WakeScreen
import com.example.sleepy_jc.modules.module_sleep_time.presentation.SleepScreen

@Composable
fun BottomNavGraph(NavController: NavHostController){
    NavHost(
        navController = NavController,
        startDestination = BottomBarScreen.Sleep.route
    ){
        composable(route = BottomBarScreen.Sleep.route){
            SleepScreen()
        }
        composable(route = BottomBarScreen.Wake.route){
            WakeScreen()
        }
        composable(route = BottomBarScreen.Alarm.route){
            AlarmScreen()
        }

    }
}