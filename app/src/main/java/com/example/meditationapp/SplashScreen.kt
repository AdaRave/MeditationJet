package com.example.meditationapp

import android.os.CountDownTimer
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SplashScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), Alignment.Center) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background),
            contentDescription = null
        )
        Image(
            modifier = Modifier
                .width(202.dp)
                .height(231.dp),
            painter = painterResource(id = R.drawable.logo_big),
            contentDescription = null
        )
    }

    object : CountDownTimer(1000, 50) {
        override fun onTick(p0: Long) {
        }

        override fun onFinish() {
            navController.navigate(Screen.Onboarding.route) {
                popUpTo(Screen.Onboarding.route) {
                    inclusive = true
                }
            }
        }
    }.start()
}


