package me.dio.todolist_desafiodio.datasource

import me.dio.todolist_desafiodio.model.Task

object TaskDataSource {
    private val list = arrayListOf<Task>()

    fun getList() = list

    fun insertTask(task: Task) {
        list.add(task.copy(id = list.size + 1))
    }
}