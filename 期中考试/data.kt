package com.example.middleeexam


import androidx.compose.runtime.Composable


data class Teacher(
    val id:Int,
    val name:String,
    val major:String,
    val score:Int,
    val gender:String
)
data class Student(
    val id:Int,
    val name:String,
    val subject: String,
    val age:Int,
    val gender:String
)
val teachers = listOf(
    Teacher(1,"abc ","English",40,"女"),
    Teacher(2,"B","MATH",29,"男"),
    Teacher(1,"c ","English",44,"女"),
    Teacher(2,"d","MATH",28,"男")
)
val students = listOf(
    Student(4, "Alice ", "English", 18, "女"),
    Student(5, "ai ", "English", 17, "女"),
    Student(6, "cc ", "English", 19, "女"),
    Student(7, "ff ", "English", 18, "女")
)

@Composable
fun PageA(teachers: List<Teacher>) {

}

@Composable
fun PageB(students: List<Student>) {

}

@Composable
fun PageC() {

}
