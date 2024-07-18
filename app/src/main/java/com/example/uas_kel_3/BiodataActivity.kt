package com.example.uas_kel_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uas_kel_3.databinding.ActivityBiodataBinding

class BiodataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBiodataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBiodataBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}