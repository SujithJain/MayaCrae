package com.example.angancare.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ChildEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun childDao(): ChildDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.applicationContext,
                    AppDatabase::class.java, "anganwadi-db").build()
            }
            return INSTANCE!!
        }
    }
}