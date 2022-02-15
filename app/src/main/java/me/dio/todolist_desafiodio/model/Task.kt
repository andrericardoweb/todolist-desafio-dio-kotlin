package me.dio.todolist_desafiodio.model

data class Task(
    val title: String,
    val description: String,
    val date: String,
    val hour: String,
    val id: Int = 0
)