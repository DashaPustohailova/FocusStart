package com.exapmle.focusstart.di

import com.exapmle.focusstart.model.retrofit.ApiMoney
import com.exapmle.focusstart.model.retrofit.CommonRetrofit
import com.exapmle.focusstart.model.retrofit.RetrofitClient
import com.exapmle.focusstart.model.server_model.CurrencyResponse
import org.koin.dsl.module

val retrofitModule = module {
    single<ApiMoney> {
        CommonRetrofit.apiMoney
    }
}