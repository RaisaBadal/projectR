package com.example.projectr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val printr=intent.getStringExtra("monacemi")
        findViewById<TextView>(R.id.gamotanisadgili).apply { text=printr.toString() }
        val buttonback=findViewById(R.id.backbutton) as Button
        buttonback.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }


}