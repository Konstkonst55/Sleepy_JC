package com.example.sleepy_jc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.res.ResourcesCompat
import com.example.sleepy_jc.modules.module_navigation.MainScreen
import com.example.sleepy_jc.ui.theme.Bar
import com.example.sleepy_jc.ui.theme.Black
import com.example.sleepy_jc.ui.theme.Sleepy_JCTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sleepy_JCTheme {
                MainContent()
            }
        }
    }

    @Composable
    fun MainContent() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(
                        "Sleepy",
                        color = Color.White,
                        style = MaterialTheme.typography.subtitle1
                    )},
                    backgroundColor = Bar
                )
            },
            content = { MainScreen() }
        )
    }
}