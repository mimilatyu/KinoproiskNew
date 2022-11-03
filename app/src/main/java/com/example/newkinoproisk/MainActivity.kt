package com.example.newkinoproisk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newkinoproisk.adapters.FilmListRecyclerAdapter
import com.example.newkinoproisk.adapters.TopSpacingItemDecoration
import com.example.newkinoproisk.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initNavigation()

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_placeholder, HomeFragment())
            .addToBackStack(null)
            .commit()
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

    fun launchDetailsFragment(film: Film) {
        val bundle = Bundle()
        bundle.putParcelable("film", film)
        val fragment = DetailsFragment()
        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_placeholder, fragment)
            .addToBackStack(null)
            .commit()


    }



}
