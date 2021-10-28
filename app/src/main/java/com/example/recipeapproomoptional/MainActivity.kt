package com.example.recipeapproomoptional

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapproomoptional.DBRoom.BookDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val books=BookDatabase.getInstance(applicationContext).bookDao().getAll()
        var text=""
        for (book in books){
            text+="title: ${book.title}\nauthor: ${book.author}\ningredients: ${book.ingredients}\ninstructions:${book.instructions}\n\n"
        }
        textView.text=text

    }




    fun toSecondPage(view: android.view.View) {
        startActivity(Intent(applicationContext,BookDetails::class.java))
    }

}
