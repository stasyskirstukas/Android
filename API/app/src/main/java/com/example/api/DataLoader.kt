package com.example.api

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.net.URL
import java.lang.Exception
import java.net.HttpURLConnection
import javax.net.ssl.HttpsURLConnection


class DataLoader {

    fun getData() = runBlocking {
        launch {
            val URL = URL("https://www.floatrates.com/daily/usd.json")
            val getData = async(start = CoroutineStart.LAZY) { pullAPI(URL) }
            val result = withContext(Dispatchers.IO) { getData.await() }
        }
    }

    private suspend fun pullAPI(url: URL): String {

        var data = "Something went wrong"
        val connection = url.openConnection() as HttpsURLConnection
        if (connection.responseCode == 200) {
            val inputSystem = connection.inputStream
            data = inputSystem.reader().readText()
        } else {
            println("Failed to fetch API")
        }
//        val data = URL(url).readText()
        println("Success")
        return data
    }

}