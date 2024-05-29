package com.example.conversoeurodolar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.conversoeurodolar.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener{
            val euros = binding.editEuro.text.toString().toDouble()
            //val dolares = String.format("%.2f" ,euros * .8).toDouble()
            val dolares = (euros * 0.8 * 100).roundToInt().toDouble()

            binding.textDolares.text = "${dolares} $"
        }
    }
}