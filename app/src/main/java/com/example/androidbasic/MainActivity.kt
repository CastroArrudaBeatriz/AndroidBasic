package com.example.androidbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*add_event_button*/
        add_button.setOnClickListener {
            result_value.text = add(
                checkNumberisNull(number_1.text.toString()),
                checkNumberisNull(number_2.text.toString())
            ).toString()
        }

        /*subtract_event_button*/
        subtract_button.setOnClickListener{
            result_value.text = subtract(
                checkNumberisNull(number_1.text.toString()),
                checkNumberisNull(number_2.text.toString())
            ).toString()
        }

        /*multiply_event_button*/
        multiply_button.setOnClickListener {
            result_value.text = multiply(
                checkNumberisNull(number_1.text.toString()),
                checkNumberisNull(number_2.text.toString())
            ).toString()
        }

        /*divide_event_button*/
        divide_button.setOnClickListener {
            result_value.text = divide(
                checkNumberisNull(number_1.text.toString()),
                checkNumberisNull(number_2.text.toString())
            ).toString()
        }

        /*clear_event_button*/
        clear_button.setOnClickListener{
            result_value.text = ""
            number_1.text.clear()
            number_2.text.clear()
            Toast.makeText(this, "Resultado Limpo!", Toast.LENGTH_LONG).show()
        }

    }

    private fun add(val1: Double, val2: Double) = val1.plus(val2)

    private fun subtract(val1: Double, val2: Double) = val1.minus(val2)

    private fun multiply(val1: Double, val2: Double) = val1.times(val2)

    private fun divide(val1: Double, val2: Double) = val1.div(val2)

    private fun checkNumberisNull(numberValue: String): Double {
        return if (numberValue.isNullOrEmpty()) 0.0 else numberValue.toDouble()
    }
}