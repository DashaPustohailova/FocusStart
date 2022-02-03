package com.exapmle.focusstart.ui.currency

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.focusstart.model.room.dto.CurrencyInfo
import com.example.focusstart.model.use_case.GetCurrencyUseCase
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class CurrencyViewModel(
    private val getCurrencyUseCase: GetCurrencyUseCase
) : ViewModel(), KoinComponent {

    private val _currencyList = MutableLiveData<List<CurrencyInfo>>()

    var currencyList: LiveData<List<CurrencyInfo>> = _currencyList

    fun getCurrency() {
        viewModelScope.launch  {
            _currencyList.postValue(getCurrencyUseCase.updateCurrencyList())
        }
    }

}
