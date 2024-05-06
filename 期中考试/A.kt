package com.example.middleeexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController


@Composable
fun Apage(navController:NavHostController){
    Column {
        Text(text="教师信息")
        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text="Home")
        }
    }
}