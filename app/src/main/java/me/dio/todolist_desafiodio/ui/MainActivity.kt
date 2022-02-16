package me.dio.todolist_desafiodio.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.todolist_desafiodio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter by lazy { TaskListAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvTasks.adapter = adapter

        insertListeners()
    }

    private fun insertListeners() {
        binding.fabAddNewTask.setOnClickListener {
            startActivity(Intent(this, AddTaskActivity::class.java))
        }
    }
}