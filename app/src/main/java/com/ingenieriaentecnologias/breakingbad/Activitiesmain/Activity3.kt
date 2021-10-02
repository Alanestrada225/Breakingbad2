package com.ingenieriaentecnologias.breakingbad.Activitiesmain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ingenieriaentecnologias.breakingbad.*

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val goButton = findViewById<Button>(R.id.walter_white)
        goButton.setOnClickListener() {

            val intent = Intent(this, Activity4::class.java)
            startActivity(intent)

            val goButton = findViewById<Button>(R.id.jasse_pink)
            goButton.setOnClickListener() {

                val intent = Intent(this, ActivityJasse::class.java)
                startActivity(intent)

                val goButton = findViewById<Button>(R.id.skiler_wit)
                goButton.setOnClickListener() {

                    val intent = Intent(this, skilerwhile::class.java)
                    startActivity(intent)

                    val goButton = findViewById<Button>(R.id.walter_wite_jr)
                    goButton.setOnClickListener() {

                        val intent = Intent(this, Walterwhitejr::class.java)
                        startActivity(intent)

                        val goButton = findViewById<Button>(R.id.henry_schrader)
                        goButton.setOnClickListener() {

                            val intent = Intent(this, Henryschrader::class.java)
                            startActivity(intent)

                            val goButton = findViewById<Button>(R.id.marie_schrader)
                            goButton.setOnClickListener() {

                                val intent = Intent(this, marieSchrader::class.java)
                                startActivity(intent)

                                val goButton = findViewById<Button>(R.id.mike_ehrmantraut)
                                goButton.setOnClickListener() {

                                    val intent = Intent(this, mikeehrmantraut::class.java)
                                    startActivity(intent)
                            }  }
                        }
                    }
                }
            }
        }
    }
}