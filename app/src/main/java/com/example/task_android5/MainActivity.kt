package com.example.task_android5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class
MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first_num = findViewById<EditText>(R.id.et_first_num)
        val second_num = findViewById<EditText>(R.id.et_second_num)
        val plus = findViewById<Button>(R.id.btn_plus)
        val minus = findViewById<Button>(R.id.btn_minus)
        val division = findViewById<Button>(R.id.btn_division)
        val multiply = findViewById<Button>(R.id.btn_multiply)
        val tv_result = findViewById<TextView>(R.id.tv_result)

        val num1 = first_num.editableText.toString()
        val num2 = second_num.editableText.toString()


        plus.setOnClickListener {

            val result = num1.toInt() + num2.toInt()
            tv_result.text = result.toString()
        }
        minus.setOnClickListener {

            val result = num1.toInt() - num2.toInt()
            tv_result.text = result.toString()
        }
        division.setOnClickListener{
            val result = num1.toInt() / num2.toInt()
            tv_result.text = result.toString()
        }
        multiply.setOnClickListener{
            val result = num1.toInt() * num2.toInt()
            tv_result.text = result.toString()
        }





    }
}