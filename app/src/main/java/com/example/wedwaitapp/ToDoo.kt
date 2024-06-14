package com.example.wedwaitapp

import TaskAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.widget.ImageButton

class ToDoo : AppCompatActivity() {

    private lateinit var taskAdapter: TaskAdapter
    private val tasks = mutableListOf<Task>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_doo)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val fab: FloatingActionButton = findViewById(R.id.fab)

        taskAdapter = TaskAdapter(tasks)
        recyclerView.adapter = taskAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        fab.setOnClickListener {
            tasks.add(Task("New Task"))
            taskAdapter.notifyItemInserted(tasks.size - 1)
            recyclerView.scrollToPosition(tasks.size - 1)
        }

        val searchButton: ImageButton = findViewById(R.id.searchbtn)
        val accountButton: ImageButton = findViewById(R.id.accountButton)
        val homeButton: ImageButton = findViewById(R.id.homeButton)

        searchButton.setOnClickListener {
            val intent = Intent(this, search::class.java)
            startActivity(intent)
            finish()
        }

        accountButton.setOnClickListener {
            val intent = Intent(this, account::class.java)
            startActivity(intent)
            finish()
        }

        homeButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }
    }
}

