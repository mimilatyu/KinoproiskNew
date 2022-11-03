package com.example.newkinoproisk

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newkinoproisk.adapters.FilmListRecyclerAdapter
import com.example.newkinoproisk.adapters.TopSpacingItemDecoration
import com.example.newkinoproisk.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
   private lateinit var binding: FragmentHomeBinding
    private lateinit var filmsAdapter: FilmListRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
    }
    private fun initRecycler(){
        binding.recyclerView.apply {
            filmsAdapter = FilmListRecyclerAdapter(object : FilmListRecyclerAdapter.OnItemClickListener{
                override fun click(film: Film) {
                    (requireActivity() as MainActivity).launchDetailsFragment(film)
                }
            })

            adapter = filmsAdapter
            layoutManager = LinearLayoutManager(requireContext())
            val decorator = TopSpacingItemDecoration(8)
            addItemDecoration(decorator)
        }
        filmsAdapter.addItems(filmsDataBase)
    }

    val filmsDataBase = listOf(
        Film("ZALUPA", R.drawable.poster_1, "Просмотр фильмов является частью современной культуры. Герои популярных фильмов и актёры, их играющие, зачастую становятся знаменитыми, а их образы узнаваемыми. Специально для массового просмотра фильмов строят кинотеатры. Обычно продолжительность фильма составляет 90—120 минут (полтора—два часа). В домашних условиях для просмотра фильмов традиционно используется телевизор с подключённым к нему видеопроигрывателем, в последнее время всё чаще для этих целей служат переносные носители информации: USB-флэш-накопитель, флэш-память, персональный компьютер, смартфон и другие электронные устройства воспроизведения видео."),
        Film("ZALUPA2", R.drawable.poster_2, "Просмотр фильмов является частью современной культуры. Герои популярных фильмов и актёры, их играющие, зачастую становятся знаменитыми, а их образы узнаваемыми. Специально для массового просмотра фильмов строят кинотеатры. Обычно продолжительность фильма составляет 90—120 минут (полтора—два часа). В домашних условиях для просмотра фильмов традиционно используется телевизор с подключённым к нему видеопроигрывателем, в последнее время всё чаще для этих целей служат переносные носители информации: USB-флэш-накопитель, флэш-память, персональный компьютер, смартфон и другие электронные устройства воспроизведения видео."),
        Film("ZALUPA3", R.drawable.poster_3, "Просмотр фильмов является частью современной культуры. Герои популярных фильмов и актёры, их играющие, зачастую становятся знаменитыми, а их образы узнаваемыми. Специально для массового просмотра фильмов строят кинотеатры. Обычно продолжительность фильма составляет 90—120 минут (полтора—два часа). В домашних условиях для просмотра фильмов традиционно используется телевизор с подключённым к нему видеопроигрывателем, в последнее время всё чаще для этих целей служат переносные носители информации: USB-флэш-накопитель, флэш-память, персональный компьютер, смартфон и другие электронные устройства воспроизведения видео."),
        Film("ZALUPA4", R.drawable.poster_5, "Просмотр фильмов является частью современной культуры. Герои популярных фильмов и актёры, их играющие, зачастую становятся знаменитыми, а их образы узнаваемыми. Специально для массового просмотра фильмов строят кинотеатры. Обычно продолжительность фильма составляет 90—120 минут (полтора—два часа). В домашних условиях для просмотра фильмов традиционно используется телевизор с подключённым к нему видеопроигрывателем, в последнее время всё чаще для этих целей служат переносные носители информации: USB-флэш-накопитель, флэш-память, персональный компьютер, смартфон и другие электронные устройства воспроизведения видео."),
        Film("ZALUPA5", R.drawable.poster_6, "Просмотр фильмов является частью современной культуры. Герои популярных фильмов и актёры, их играющие, зачастую становятся знаменитыми, а их образы узнаваемыми. Специально для массового просмотра фильмов строят кинотеатры. Обычно продолжительность фильма составляет 90—120 минут (полтора—два часа). В домашних условиях для просмотра фильмов традиционно используется телевизор с подключённым к нему видеопроигрывателем, в последнее время всё чаще для этих целей служат переносные носители информации: USB-флэш-накопитель, флэш-память, персональный компьютер, смартфон и другие электронные устройства воспроизведения видео."),
        Film("ZALUPA6", R.drawable.poster_7, "Просмотр фильмов является частью современной культуры. Герои популярных фильмов и актёры, их играющие, зачастую становятся знаменитыми, а их образы узнаваемыми. Специально для массового просмотра фильмов строят кинотеатры. Обычно продолжительность фильма составляет 90—120 минут (полтора—два часа). В домашних условиях для просмотра фильмов традиционно используется телевизор с подключённым к нему видеопроигрывателем, в последнее время всё чаще для этих целей служат переносные носители информации: USB-флэш-накопитель, флэш-память, персональный компьютер, смартфон и другие электронные устройства воспроизведения видео."),
        Film("ZALUPA7", R.drawable.poster_8, "Просмотр фильмов является частью современной культуры. Герои популярных фильмов и актёры, их играющие, зачастую становятся знаменитыми, а их образы узнаваемыми. Специально для массового просмотра фильмов строят кинотеатры. Обычно продолжительность фильма составляет 90—120 минут (полтора—два часа). В домашних условиях для просмотра фильмов традиционно используется телевизор с подключённым к нему видеопроигрывателем, в последнее время всё чаще для этих целей служат переносные носители информации: USB-флэш-накопитель, флэш-память, персональный компьютер, смартфон и другие электронные устройства воспроизведения видео."),
        Film("ZALUPA8", R.drawable.poster_9, "Просмотр фильмов является частью современной культуры. Герои популярных фильмов и актёры, их играющие, зачастую становятся знаменитыми, а их образы узнаваемыми. Специально для массового просмотра фильмов строят кинотеатры. Обычно продолжительность фильма составляет 90—120 минут (полтора—два часа). В домашних условиях для просмотра фильмов традиционно используется телевизор с подключённым к нему видеопроигрывателем, в последнее время всё чаще для этих целей служат переносные носители информации: USB-флэш-накопитель, флэш-память, персональный компьютер, смартфон и другие электронные устройства воспроизведения видео."),

        )
}