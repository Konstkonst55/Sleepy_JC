package com.example.sleepy_jc

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sleepy_jc.modules.module_wake_up_time.SleepScreen

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