package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtValue.text = "0"
    }

    fun buttonAction(view: View)
    {
        if(view is Button)
        {
            if(binding.txtValue.text == "0")
            {
                binding.txtValue.text = view.text
                println("aaaa")
            }
            else binding.txtValue.append(view.text)
        }
    }

    fun btnAllClear(view: View)
    {
        binding.txtValue.text = "0"
    }
    fun btnBackspace(view: View)
    {
        binding.txtValue.text = binding.txtValue.text.dropLast(1)
        if(binding.txtValue.text.length == 0) binding.txtValue.text = "0"
    }
    fun btnEqual(view: View) {}

    fun btnTest(view: View)
    {
        println(binding.txtValue.text)
    }

}