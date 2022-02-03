package com.example.focusstart.di

import com.example.focusstart.model.use_case.GetCurrencyRoomUseCase
import com.example.focusstart.model.use_case.GetCurrencyUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory<GetCurrencyUseCase> {
        GetCurrencyUseCase(get(), get())
    }

    factory<GetCurrencyRoomUseCase> {
        GetCurrencyRoomUseCase(get())
    }
}