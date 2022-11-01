package com.example.newkinoproisk.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.newkinoproisk.Film
import com.example.newkinoproisk.R

class FilmListRecyclerAdapter(private val clickListener: OnItemClickListener):
        RecyclerView.Adapter<RecyclerView.ViewHolder>(){
            private val items = mutableListOf<Film>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return FilmViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.film_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when(holder) {
            is FilmViewHolder -> {
                holder.bind(items[position])
                holder.itemView.setOnClickListener{
                    clickListener.click(items[position])
                }
            }
        }
    }

    override fun getItemCount()= items.size

    @SuppressLint("NotifyDataSetChanged")
    fun addItems(list: List<Film>){
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    interface OnItemClickListener{
        fun click(film: Film)
    }
}