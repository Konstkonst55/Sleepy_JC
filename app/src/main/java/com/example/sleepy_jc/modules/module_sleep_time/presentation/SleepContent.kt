package com.example.sleepy_jc.modules.module_sleep_time.presentation

import android.app.TimePickerDialog
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun SleepContent(time: MutableState<String>, hour: Int, minute: Int) {
    val context = LocalContext.current
    val tp = TimePickerDialog(context,
        {_, h : Int, m: Int ->
            time.value = "$h:$m"
        }, hour, minute, true)

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier
                .height(height = 80.dp)
                .fillMaxWidth()
            )

            Text(
                text = "Выберите время, в которое хотели бы проснуться...",
                style = MaterialTheme.typography.subtitle1,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 0.dp)
            )

            Spacer(modifier = Modifier
                .height(height = 20.dp)
                .fillMaxWidth()
            )

            Button(onClick = {
                tp.show()

            },
                modifier = Modifier
                    .shadow(10.dp, RoundedCornerShape(10.dp))
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(30.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Выбрать...",
                    style = MaterialTheme.typography.body1
                )
            }
        }
    }
}