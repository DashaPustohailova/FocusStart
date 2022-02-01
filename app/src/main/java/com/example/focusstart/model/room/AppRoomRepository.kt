package com.example.focusstart.model.room

import androidx.lifecycle.LiveData
import com.example.focusstart.model.room_model.CurrencyInfo

class AppRoomRepository (private val appRoomDao: AppRoomDao) {

    val allCurrency: LiveData<List<CurrencyInfo>>
        get() = appRoomDao.getAllNotes()

    suspend fun insert(note: List<CurrencyInfo>, onSuccess: () -> Unit) {
        appRoomDao.insert(note)
        onSuccess()
    }

}