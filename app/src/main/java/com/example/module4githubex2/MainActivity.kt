package com.example.module4githubex2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    private fun initView() {
        var openSecondAc = findViewById<Button>(R.id.open_second_activity)
        openSecondAc.setOnClickListener {
            openSecondActivity()
        }
    }
    private fun openSecondActivity() {
        var intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}