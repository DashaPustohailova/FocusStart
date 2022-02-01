package com.example.focusstart.model.data_source

import com.example.focusstart.model.room.dto.CurrencyInfo

interface CurrencyDataSource {
    suspend fun getCurrencyList(): List<CurrencyInfo>
}