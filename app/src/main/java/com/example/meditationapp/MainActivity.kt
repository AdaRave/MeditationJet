package com.example.meditationapp

import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.meditationapp.ui.theme.MeditationAppTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MeditationAppTheme {
               navController = rememberNavController()
               SetupNavGraph(navController = navController)


           }
        }
    }
}


