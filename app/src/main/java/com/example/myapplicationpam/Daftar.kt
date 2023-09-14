package com.example.myapplicationpam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationpam.databinding.ActivityDaftarBinding

class Daftar : AppCompatActivity() {
    private lateinit var binding: ActivityDaftarBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        binding = ActivityDaftarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButtonDaftar.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}