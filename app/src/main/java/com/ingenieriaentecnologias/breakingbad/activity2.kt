package com.ingenieriaentecnologias.breakingbad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.ingenieriaentecnologias.breakingbad.Activitiesmain.Activity3

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val descriptionInput =findViewById<EditText>(R.id.description)
        val phoneNumberInput =findViewById<TextView>(R.id.phoneNumber)
        val goButton =findViewById<Button>(R.id.go_buttoncargar)
        goButton.setOnClickListener(){

            val intent =Intent (this, Activity3::class.java)
            startActivity(intent)


            if(descriptionInput.text.isEmpty())
                Toast.makeText(this, "Please tye something", Toast.LENGTH_SHORT).show()
            return@setOnClickListener
            descriptionInput.text = descriptionInput.text
            phoneNumberInput.text = phoneNumberInput.text
        }

    }
}