package com.example.focusstart.model.data_source

import com.example.focusstart.environment.extentions.to_domain.toDomain
import com.exapmle.focusstart.model.retrofit.ApiMoney

class ApiCurrencyDataSource(private val api: ApiMoney): CurrencyDataSource {
    override suspend fun getCurrencyList() = api.getCurrency().toDomain()
}