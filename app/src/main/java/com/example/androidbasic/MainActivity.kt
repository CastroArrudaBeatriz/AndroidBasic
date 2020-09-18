package com.example.androidbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSoma.setOnClickListener {
            var val1  = if (number1.text.toString().isNullOrEmpty()) 0 else number1.text.toString().toDouble()
            var val2  = if (number2.text.toString().isNullOrEmpty()) 0 else number2.text.toString().toDouble()
            resultSoma.text = "A soma é "+ somar(val1 as Double, val2 as Double)
        }
    }

    private fun somar(val1: Double, val2: Double) = val1.plus(val2)
}