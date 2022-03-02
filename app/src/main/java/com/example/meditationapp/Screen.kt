package com.example.meditationapp

sealed class Screen (val route: String) {
    object Splash: Screen(route = "splash_screen")
    object Onboarding: Screen(route = "onboarding_screen")
    object Login: Screen(route = "login_activity")

}