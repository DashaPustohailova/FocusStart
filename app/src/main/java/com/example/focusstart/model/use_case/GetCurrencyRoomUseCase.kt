package com.example.focusstart.model.use_case

import com.example.focusstart.model.room.AppRoomRepository
import com.example.focusstart.model.room.dto.CurrencyInfo

class GetCurrencyRoomUseCase(
    private val repository: AppRoomRepository
) {
    suspend fun updateCurrencyList() : List<CurrencyInfo> {
        return repository.allCurrency()
    }
}