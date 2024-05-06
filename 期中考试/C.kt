package com.example.middleeexam


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.navigation.NavHostController

@Composable
fun Cpage(navController:NavHostController){
    Column {
        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text="Home")
        }
    }
}