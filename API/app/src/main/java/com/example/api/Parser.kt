package com.example.api

import android.util.Log
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

class Parser {
    fun main() = runBlocking{
        launch(newSingleThreadContext("FetchAPI"))
        {
            val dataLoader = DataLoader()
            Log.d("DataLoader", dataLoader.getData().)
        }
    }
}