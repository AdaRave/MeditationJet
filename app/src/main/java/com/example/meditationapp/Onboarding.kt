package com.example.meditationapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun OnboardingActivity(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background),
            contentDescription = null
        )
        Column(modifier = Modifier.fillMaxSize().padding(bottom = 90.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom) {
            Image(
                modifier = Modifier
                    .width(202.dp)
                    .height(231.dp),
                painter = painterResource(id = R.drawable.logo_big),
                contentDescription = null
            )
            Text(text = "ПРИВЕТ")
            Text(
                modifier = Modifier
                    .width(232.dp),
                text = "Наслождайся отборочными.", textAlign = TextAlign.Center
            )
            Text(modifier = Modifier.width(232.dp), text = "Будь внимателен", textAlign = TextAlign.Center)
            Text(modifier = Modifier.width(232.dp), text = "Делай хорошо.", textAlign = TextAlign.Center)

            Button(modifier = Modifier.padding(vertical = 60.dp)
                .width(321.dp)
                .height(61.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                navController.navigate(Screen.Login.route){
                    popUpTo(Screen.Login.route){
                        inclusive = true
                    }
                }
            }, colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary)) {
                  Text(text = "Войти в аккаунт")
            }
            Text(text = "Еще нет аккаунта? Зарегистрируйтесь", textAlign = TextAlign.Center)

        }
    }
}

@Preview
@Composable
fun PreviewOnboardingActivity() {

}