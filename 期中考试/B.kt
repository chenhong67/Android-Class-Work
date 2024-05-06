package com.example.middleeexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.navigation.NavHostController

@Composable
fun Bpage(navController:NavHostController){
    Column {
        Text(text="学生信息")
        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text="Home")
        }
    }
}