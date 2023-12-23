package com.example.brainbit2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val sessionsList: ArrayList<Item>):
    RecyclerView.Adapter<ListAdapter.SessionsViewHolder>() {
    class SessionsViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val data: TextView = itemView.findViewById(R.id.tvDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SessionsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return SessionsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return sessionsList.size
    }

    override fun onBindViewHolder(holder: SessionsViewHolder, position: Int) {
        val item = sessionsList[position]
        holder.data.text = item.data

    }
}