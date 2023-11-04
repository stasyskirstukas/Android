package com.example.wordcounter

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.wordcounter.ui.theme.WordCounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val txtInput = findViewById<EditText>(R.id.txtInput)
        val txtCount = findViewById<TextView>(R.id.txtCount)

        val spinCountOptions = findViewById<Spinner>(R.id.spinCountOptions)
        var adapter = ArrayAdapter.createFromResource(
            this,
            R.array.countingOptions,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinCountOptions.adapter = adapter

        var btnCount = findViewById<Button>(R.id.btnCount)
        btnCount.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                if (txtInput.text.length == 0) Toast.makeText(
                    this@MainActivity,
                    "Text field is empty",
                    Toast.LENGTH_LONG
                ).show()
                else {
                    val counter = Counting()

                    if(spinCountOptions.selectedItem.toString() == "Words")
                    {
                        val wordCount = counter.countWords(txtInput.text.toString())
                        txtCount.text = "Words: $wordCount"
                    }
                    else
                    {
                        val symbolCount = counter.countSymbols(txtInput.text.toString())
                        txtCount.text = "Symbols: $symbolCount"
                    }
                }

            }
        })

    }
}