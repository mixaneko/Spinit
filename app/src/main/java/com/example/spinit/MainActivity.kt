package com.example.spinit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.spinit.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var  sum:TextView
    lateinit var zadanieclass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        zadanieclass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(zadanieclass.root)
        val editText1:EditText=findViewById(R.id.chislo1)
        val editText2:EditText=findViewById(R.id.chislo2)
        sum=findViewById(R.id.summa)

        zadanieclass.button.setOnClickListener{
            val a=editText1.text.toString().toIntOrNull()?:0
            val b= editText2.text.toString().toIntOrNull()?:0
            val summa=a+b
             sum.text=summa.toString()
            }


        }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("Sum", sum.toString())

    }






    }


