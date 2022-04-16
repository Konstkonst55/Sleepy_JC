package com.example.sleepy_jc.modules.module_sleep_time.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.sleepy_jc.ui.theme.Bar
import com.example.sleepy_jc.ui.theme.White

@Composable
fun SleepCardItem(title: String, remaining: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp)),
        backgroundColor = Bar,
        contentColor = White,
        elevation = 5.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h1
            )
            Text(
                text = remaining,
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.Normal
            )
        }
    }
}