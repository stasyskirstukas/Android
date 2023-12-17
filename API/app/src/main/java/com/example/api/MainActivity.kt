package com.example.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.api.databinding.ActivityMainBinding
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val parser = Parser()
        parser.main()

//        main()
    }

//    fun main() = runBlocking{
//        launch(newSingleThreadContext("FetchAPI"))
//        {
//            val dataLoader = DataLoader()
//            dataLoader.getData()
//        }
//    }

}