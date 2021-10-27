package com.example.recipeapproomoptional

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapproomoptional.DBRoom.Book
import com.example.recipeapproomoptional.DBRoom.BookDatabase
import kotlinx.android.synthetic.main.activity_book_details.*

class BookDetails : AppCompatActivity() {
    lateinit var progressDialog: ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        btnSave.setOnClickListener {

            var title=edTitle.text.toString()
            var author=edAuthor.text.toString()
            var ingredients=edIngredients.text.toString()
            var instructions=edInstructions.text.toString()
            if (title.isNotEmpty()&&author.isNotEmpty()&&ingredients.isNotEmpty()&&instructions.isNotEmpty())
            {
                val book= Book(0,author,ingredients,instructions,title)
                BookDatabase.getInstance(applicationContext).bookDao().addBook(book)
                Toast.makeText(applicationContext, "book is added ", Toast.LENGTH_SHORT).show()
                edTitle.text.clear()
                edAuthor.text.clear()
                edIngredients.text.clear()
                edInstructions.text.clear()
            }
            else
            {
                Toast.makeText(applicationContext, "please complete the fields", Toast.LENGTH_SHORT).show()
            }

        }
    }


    fun goBack(view: android.view.View) {

        startActivity(Intent(applicationContext,MainActivity::class.java))

    }
}