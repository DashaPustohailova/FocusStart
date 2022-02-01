package com.example.focusstart.model.room

import androidx.room.*
import com.example.focusstart.model.room.dto.CurrencyInfo

@Dao
interface AppRoomDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(listCurrency: List<CurrencyInfo>)

    @Query("SELECT * FROM currency_tables")
    suspend fun getAllNotes(): List<CurrencyInfo>
}