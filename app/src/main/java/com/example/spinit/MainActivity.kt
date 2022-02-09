package com.example.spinit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.spinit.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var sum: TextView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.mapButton.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345"))
            startActivity(intent)
        }

        binding.callButton.setOnClickListener {

            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:" + "+79922062084")
            startActivity(intent)

        }
    }
}



