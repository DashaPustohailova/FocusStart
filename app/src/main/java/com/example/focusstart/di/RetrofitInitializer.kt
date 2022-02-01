package com.exapmle.focusstart.di

import com.example.focusstart.model.data_source.ApiCurrencyDataSource
import com.example.focusstart.model.data_source.CurrencyDataSource
import com.exapmle.focusstart.model.retrofit.ApiMoney
import com.example.focusstart.model.retrofit.CommonRetrofit
import org.koin.dsl.module

val retrofitModule = module {
    single<ApiMoney> {
        CommonRetrofit.apiMoney
    }

    factory<CurrencyDataSource> {
        ApiCurrencyDataSource(get())
    }
}