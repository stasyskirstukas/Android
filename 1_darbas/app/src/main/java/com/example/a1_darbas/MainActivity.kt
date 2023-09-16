package com.example.a1_darbas

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import android.view.View
import android.widget.TextView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val button = findViewById<Button>(R.id.btn);
        button.setOnClickListener(object: View.OnClickListener
        {
            override fun onClick(v: View?) {
                val txtView = findViewById<TextView>(R.id.txtView);
                txtView.setText("Text Set")
            }
        })
    }
}