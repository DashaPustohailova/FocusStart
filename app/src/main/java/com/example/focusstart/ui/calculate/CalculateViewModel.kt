package com.example.focusstart.ui.calculate

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.focusstart.model.room.AppRoomRepository
import com.example.focusstart.model.room.dto.CurrencyInfo
import com.example.focusstart.model.use_case.GetCurrencyUseCase
import com.exapmle.focusstart.model.retrofit.ApiMoney
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class CalculateViewModel(
    private val repository: AppRoomRepository
) : ViewModel(), KoinComponent  {

    private val _currencyList = MutableLiveData<List<CurrencyInfo>>()

    var currencyList: LiveData<List<CurrencyInfo>> = _currencyList

    fun getCurrency() {
        viewModelScope.launch  {
            _currencyList.postValue(repository.allCurrency())
        }
    }

}