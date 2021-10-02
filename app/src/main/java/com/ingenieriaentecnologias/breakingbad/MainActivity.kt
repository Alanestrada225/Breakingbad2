package com.ingenieriaentecnologias.breakingbad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.ingenieriaentecnologias.breakingbad.databinding.Activity3Binding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val goButton =findViewById<Button>(R.id.go_buttoniniciarseccion)
        goButton.setOnClickListener(){
            val intent =Intent (this, activity2::class.java)
            startActivity(intent)
        }


    }

    }





