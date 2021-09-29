package com.example.asmaa1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var EditText:EditText
    lateinit var EditText2:EditText
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EditText=findViewById(R.id.editText)
        EditText2=findViewById(R.id.editText2)
        button=findViewById(R.id.button)

        val namef=EditText.text
        val namel=EditText2.text

        button.setOnClickListener{
            Toast.makeText(applicationContext,"$namef $namel",Toast.LENGTH_LONG).show()
        }


    }
}