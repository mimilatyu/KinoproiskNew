package com.example.newkinoproisk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.newkinoproisk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonMenu.setOnClickListener {
            Toast.makeText(this, "MENU", Toast.LENGTH_SHORT).show()
        }

        binding.buttonFav.setOnClickListener {
            Toast.makeText(this, "FAVORITES", Toast.LENGTH_SHORT).show()
        }

        binding.buttonLater.setOnClickListener {
            Toast.makeText(this, "LATER", Toast.LENGTH_SHORT).show()
        }

        binding.buttonCollect.setOnClickListener {
            Toast.makeText(this, "COLLECTIONS", Toast.LENGTH_SHORT).show()
        }

        binding.buttonSet.setOnClickListener {
            Toast.makeText(this, "SETTINGS", Toast.LENGTH_SHORT).show()
        }
    }
}