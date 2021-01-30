package com.example.declarateatucrush

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.icu.util.TimeUnit.values
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.time.chrono.JapaneseEra.values

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnComenzar)

        btn.setOnClickListener {
            val intent = Intent(this, DeclarateActivity::class.java)
            startActivity(intent)
        }
    }
}