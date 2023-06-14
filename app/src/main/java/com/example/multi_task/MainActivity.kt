package com.example.multi_task

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textfield = findViewById<TextInputEditText>(R.id.textfield)
        val btnSubmit = findViewById<MaterialButton>(R.id.btnSubmit)
        val textview  = findViewById<TextView>(R.id.textViewAnser)
        val btnReset = findViewById<MaterialButton>(R.id.Btnreset)
        val btnpelindrome = findViewById<MaterialButton>(R.id.btnpellindrome)


        //button handler
        btnSubmit.setOnClickListener {
            val strRiverse = textfield.text.toString().reversed()
            textview.text = strRiverse

            Toast.makeText(this,strRiverse,Toast.LENGTH_SHORT).show()
        }
        //reset button handler
       btnReset.setOnClickListener {
           textfield.text?.clear()
           textview.text = ""
       }
        // palindorme button handle
        btnpelindrome.setOnClickListener {
            val strRiverse = textfield.text.toString().reversed()
//            textview.text = strRiverse
            if(strRiverse==textfield.text.toString()){
                textview.text = "Given string or number is pelindrome"
                Toast.makeText(this,strRiverse,Toast.LENGTH_SHORT).show()
            }else{
                textview.text = "Not pelindrome"
            }
        }
    }
}