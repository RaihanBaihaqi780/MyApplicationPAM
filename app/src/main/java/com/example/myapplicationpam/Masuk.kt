package com.example.myapplicationpam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationpam.databinding.ActivityDaftarBinding
import com.example.myapplicationpam.databinding.ActivityMasukBinding

class Masuk : AppCompatActivity() {
    private lateinit var binding: ActivityMasukBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
        binding = ActivityMasukBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButtonMasuk.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}