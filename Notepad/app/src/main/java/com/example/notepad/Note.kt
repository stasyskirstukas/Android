package com.example.notepad
import kotlinx.serialization.Serializable

@Serializable
class Note(name: String, content: String) {
    var name = name
    var content = content
//    companion object NewNote{
//        var name: String = name
//        var content = content.uppercase()
//    }
}