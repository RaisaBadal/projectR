package com.example.projectr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var raisa:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        raisa=findViewById(R.id.teqstigadasacemi)
        val button=findViewById(R.id.buttonofsignin) as Button
        button.setOnClickListener{
            val next=Intent(this,MainActivity2::class.java).apply { putExtra("monacemi",raisa.text.toString()) }
            startActivity(next)
        }
    }
    fun badal(rb:View){
        val temp=Intent(this,MainActivity2::class.java).apply { putExtra("monacemi","" )}
        startActivity(temp)
    }


}