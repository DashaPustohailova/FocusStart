package com.exapmle.focusstart.ui.currency

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.exapmle.focusstart.model.retrofit.ApiMoney
import com.exapmle.focusstart.model.retrofit.CommonRetrofit
import com.exapmle.focusstart.model.server_model.CurrencyResponse
import kotlinx.coroutines.launch

class CurrencyViewModel : ViewModel() {

    private var api: ApiMoney = CommonRetrofit.apiMoney

    private val _currencyList = MutableLiveData<CurrencyResponse>()
    val currencyList: LiveData<CurrencyResponse> = _currencyList

    fun getCurrency() {
        viewModelScope.launch {
            _currencyList.postValue(api.getCurrency())
        }
    }
}
