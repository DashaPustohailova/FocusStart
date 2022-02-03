package com.example.focusstart.model.use_case

import com.example.focusstart.model.data_source.CurrencyDataSource
import com.example.focusstart.model.room.AppRoomRepository
import com.example.focusstart.model.room.dto.CurrencyInfo
import java.lang.Exception

class GetCurrencyUseCase(
    private val dataSource: CurrencyDataSource,
    private val repository: AppRoomRepository
) {

    suspend fun updateCurrencyList() : List<CurrencyInfo> {
        var currencyList: List<CurrencyInfo>
        try{
            currencyList = dataSource.getCurrencyList()
            repository.insert(currencyList)
        }
        catch (e: Exception){
            currencyList = repository.allCurrency()
        }
        return currencyList
    }

}