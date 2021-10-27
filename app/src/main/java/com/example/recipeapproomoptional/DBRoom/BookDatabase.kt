package com.example.recipeapproomoptional.DBRoom
import android.content.Context
import androidx.room.*
@Database(entities = [Book::class],version = 1,exportSchema = false)
abstract class BookDatabase :RoomDatabase(){
    companion object{
        var instance:BookDatabase?=null
        fun getInstance(context: Context):BookDatabase
        {
            if (instance!=null){
                return instance as BookDatabase
            }
            instance=Room.databaseBuilder(context,BookDatabase::class.java,"Books").run { allowMainThreadQueries()}.build()
            return instance as BookDatabase
        }
    }
    abstract fun bookDao():BookDao
}