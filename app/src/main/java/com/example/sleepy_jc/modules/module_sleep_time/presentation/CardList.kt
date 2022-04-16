package com.example.sleepy_jc.modules.module_sleep_time.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.util.*

@Composable
fun LazyCardList() {
    val mCalendar = Calendar.getInstance()
    val mHour = mCalendar[Calendar.HOUR_OF_DAY]
    val mMinute = mCalendar[Calendar.MINUTE]
    val mTime = remember { mutableStateOf("") }

    LazyColumn(
        Modifier
            .fillMaxSize()
    ){
        item{
            SleepContent(mTime, mHour, mMinute)
        }
        items(20) {
            Box(Modifier.padding(horizontal = 30.dp, vertical = 0.dp)) {
                SleepCardItem(title = mTime.value, remaining ="Осталось 2ч5м")
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}