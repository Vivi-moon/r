package com.example.brainbit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListSessions : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var sessionsList: ArrayList<Item>
    private lateinit var listAdapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        recyclerView = findViewById(R.id.RecycleView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        sessionsList = ArrayList()

        sessionsList.add(Item("11:00 22.12.23"))
        sessionsList.add(Item("11:15 22.12.23"))
        sessionsList.add(Item("11:20 22.12.23"))

        listAdapter = ListAdapter(sessionsList)
        recyclerView.adapter = listAdapter
    }
}