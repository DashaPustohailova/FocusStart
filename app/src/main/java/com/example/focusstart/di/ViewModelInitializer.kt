package com.exapmle.focusstart.di

import com.example.focusstart.ui.calculate.CalculateViewModel
import com.exapmle.focusstart.ui.currency.CurrencyViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel<CurrencyViewModel> { CurrencyViewModel(get()) }
    viewModel<CalculateViewModel> { CalculateViewModel(get()) }
}