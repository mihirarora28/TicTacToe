package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnnnn = findViewById<Button>(R.id.btnnn);
        btnnnn.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent);
        }
    }
}