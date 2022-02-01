package com.example.focusstart.model.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.focusstart.model.room_model.CurrencyInfo

@Dao
interface AppRoomDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(listCurrency: List<CurrencyInfo>)


    @Query("SELECT * FROM currency_tables")
    fun getAllNotes(): LiveData<List<CurrencyInfo>>
}