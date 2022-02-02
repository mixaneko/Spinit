package com.example.spinit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.spinit.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var sum: TextView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val editText1: EditText = findViewById(R.id.chislo1)
        val editText2: EditText = findViewById(R.id.chislo2)
        sum = findViewById(R.id.summa)

        binding.button.setOnClickListener {
            val a = editText1.text.toString().toIntOrNull() ?: 0
            val b = editText2.text.toString().toIntOrNull() ?: 0
            val summa = a + b
            sum.text = summa.toString()
        }


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("Sum", sum.text.toString())

    }

// На тебе работающий код. Жду обьяснительную почему в твоей версии это не работало
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val sum = savedInstanceState.getString("Sum")
        binding.summa.text = sum
    }
}


