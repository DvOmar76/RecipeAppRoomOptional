package com.example.recipeapproomoptional.DBRoom
import androidx.room.*
@Dao
interface BookDao {
    @Query("select * from book order by id Asc")
    fun getAll():List<Book>
    @Insert
    fun addBook(book: Book)
    @Update
    fun update(book: Book)
    @Delete
    fun delete(book: Book)
}