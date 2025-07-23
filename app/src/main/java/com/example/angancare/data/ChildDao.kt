package com.example.angancare.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ChildDao {
    @Insert fun insertChild(child: ChildEntity)
    @Query("SELECT * FROM children") fun getAllChildren(): List<ChildEntity>
}