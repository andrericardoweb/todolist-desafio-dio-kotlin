package me.dio.todolist_desafiodio.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import me.dio.todolist_desafiodio.databinding.ItemTaskBinding
import me.dio.todolist_desafiodio.model.Task

class TaskListAdapter : ListAdapter<Task, TaskListAdapter.TaskViewHolder>() {

    class TaskViewHolder(
        private val binding: ItemTaskBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}