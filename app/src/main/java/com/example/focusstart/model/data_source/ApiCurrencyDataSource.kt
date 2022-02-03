package com.example.focusstart.model.data_source

import android.util.Log
import com.example.focusstart.environment.extentions.to_domain.toDomain
import com.example.focusstart.model.room.dto.CurrencyInfo
import com.exapmle.focusstart.model.retrofit.ApiMoney
import retrofit2.Call
import com.example.focusstart.model.server_model.CurrencyResponse
import retrofit2.Callback
import retrofit2.Response

class ApiCurrencyDataSource(private val api: ApiMoney): CurrencyDataSource {
    override suspend fun getCurrencyList() : List<CurrencyInfo>{
        var list: List<CurrencyInfo>  = api.getCurrency().toDomain()
        return list
    }
}