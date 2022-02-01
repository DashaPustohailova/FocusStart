package com.exapmle.focusstart.model.retrofit

import com.example.focusstart.model.server_model.CurrencyResponse
import retrofit2.http.GET

interface ApiMoney {
    @GET(GET_CURRENCY)
    suspend fun getCurrency(): CurrencyResponse

    companion object {
        private const val GET_CURRENCY = "daily_json.js"
    }
}