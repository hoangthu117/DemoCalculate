package com.example.democalculate

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var number1EditText: EditText
    private lateinit var number2EditText: EditText
    private lateinit var resultTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1EditText = findViewById(R.id.number1EditText)
        number2EditText = findViewById(R.id.number2EditText)
        resultTextView = findViewById(R.id.resultTextView)

        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)

        addButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDouble()
            val number2 = number2EditText.text.toString().toDouble()
            val result = number1 + number2
            resultTextView.text = result.toString()
        }

        subtractButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDouble()
            val number2 = number2EditText.text.toString().toDouble()
            val result = number1 - number2
            resultTextView.text = result.toString()
        }

        multiplyButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDouble()
            val number2 = number2EditText.text.toString().toDouble()
            val result = number1 * number2
            resultTextView.text = result.toString()
        }

        divideButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDouble()
            val number2 = number2EditText.text.toString().toDouble()
            if (number2 == 0.0) {
                resultTextView.text = "Cannot divide by zero"
            } else {
                val result = number1 / number2
                resultTextView.text = result.toString()
            }
        }
    }
}