package com.exapmle.focusstart.di

import com.exapmle.focusstart.ui.currency.CurrencyViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel<CurrencyViewModel> { CurrencyViewModel() }
}