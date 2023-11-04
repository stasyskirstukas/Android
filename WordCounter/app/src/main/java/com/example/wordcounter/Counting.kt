package com.example.wordcounter

import android.widget.Toast

class Counting {

    fun countWords(text: String): Int {
        val words = text.split("[ .,\n]+".toRegex())
        if (words.last() == "") return words.size - 1
        return words.size
    }

    fun countSymbols(text: String): String {
        var txt = text.filterNot { it.isWhitespace() }
        return txt.length.toString()
    }

}