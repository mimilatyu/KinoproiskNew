package com.example.newkinoproisk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.example.newkinoproisk.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initNavigation()
        setAnimToButtons()





    }
    private fun initNavigation(){
        binding.topAppBar.setOnMenuItemClickListener{
            when(it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, "SETTINGS", Toast.LENGTH_SHORT ).show()
                    true
                } else -> false
            }
        }

        binding.bottomNavigation.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.favorites -> {
                    Toast.makeText(this, "FAVORITES", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.watch_later -> {
                    Toast.makeText(this, "WATCH LATER", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.collections -> {
                    Toast.makeText(this, "COLLECTIONS", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }

    private fun initAnimation(view: View, animation: Int ){
        val myAnimation = AnimationUtils.loadAnimation(this, animation)
        view.startAnimation(myAnimation)
    }

    private fun setAnimToButtons(){
        binding.anibutton1.setOnClickListener {
            initAnimation(binding.anibutton1, R.anim.anibutton1_animation)
        }
        binding.anibutton2.setOnClickListener {
            initAnimation(binding.anibutton2, R.anim.anibutton2_animation)
        }
        binding.anibutton3.setOnClickListener {
            initAnimation(binding.anibutton3, R.anim.anibutton3_animation)
        }
        binding.anibutton4.setOnClickListener {
            initAnimation(binding.anibutton4, R.anim.anibutton4_animation)
        }
    }




}