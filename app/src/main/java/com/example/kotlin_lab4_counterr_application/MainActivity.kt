package com.example.kotlin_lab4_counterr_application

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        incrementDecrementCounter()
    }
    fun incrementDecrementCounter(){
        val counterView = findViewById<TextView>(R.id.CounterView);
//            counterView.toInt();

        var counter = 0;

        val btn_up = findViewById<Button>(R.id.Btn_up)
        val btn_down = findViewById<Button>(R.id.Btn_down)

        btn_up.setOnClickListener(){
            counter++
            counterView.text = counter.toString()
        }

        btn_down.setOnClickListener(){
            counter--
            counterView.text = counter.toString()
        }
    }
}