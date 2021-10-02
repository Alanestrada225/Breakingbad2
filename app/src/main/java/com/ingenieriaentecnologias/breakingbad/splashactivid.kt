package com.ingenieriaentecnologias.breakingbad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class splashactivid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        startActivity(Intent(this,MainActivity::class.java))
    }
}