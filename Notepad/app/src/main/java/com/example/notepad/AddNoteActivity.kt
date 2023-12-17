package com.example.notepad

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.notepad.databinding.ActivityAddNoteBinding

class AddNoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun btnSaveNote(view: View)
    {
        var newNote = Note(binding.txtNoteName.toString(), binding.txtNoteContent.toString())
        val resultCode = RESULT_OK
        var resultIntent = Intent()
        resultIntent.putExtra("noteName", binding.txtNoteName.text.toString())
        resultIntent.putExtra("noteContent", binding.txtNoteContent.text.toString())
        setResult(resultCode, resultIntent)
        finish()
    }

}