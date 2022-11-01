package com.example.newkinoproisk.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.newkinoproisk.Film
import com.example.newkinoproisk.databinding.FilmItemBinding

class FilmViewHolder(private val itemView: View): RecyclerView.ViewHolder(itemView) {
    private val filmItemBinding = FilmItemBinding.bind(itemView)

    private val title = filmItemBinding.title
    private val poster = filmItemBinding.poster
    private val description = filmItemBinding.description

    fun bind(film: Film){
        title.text = film.title
        poster.setImageResource(film.poster)
        description.text = film.description
    }
}