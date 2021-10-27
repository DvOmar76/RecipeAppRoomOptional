package com.example.recipeapproomoptional.DBRoom
import androidx.room.*
@Entity(tableName = "book")
data class Book(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Int= 0,
    @ColumnInfo(name = "author") val author: String,
    @ColumnInfo(name = "ingredients") val ingredients: String,
    @ColumnInfo(name = "instructions") val instructions: String,
    @ColumnInfo(name = "title") val title: String

)
