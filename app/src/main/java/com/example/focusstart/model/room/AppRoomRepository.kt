package com.example.focusstart.model.room

import com.example.focusstart.model.room.dto.CurrencyInfo

class AppRoomRepository (private val appRoomDao: AppRoomDao) {

    suspend fun allCurrency(): List<CurrencyInfo> {
         return  appRoomDao.getAllNotes()
    }

    suspend fun insert(note: List<CurrencyInfo>) {
        appRoomDao.insert(note)
    }

}