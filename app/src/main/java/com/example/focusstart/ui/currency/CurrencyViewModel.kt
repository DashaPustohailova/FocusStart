package com.exapmle.focusstart.ui.currency

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.exapmle.focusstart.model.retrofit.ApiMoney
import com.exapmle.focusstart.model.retrofit.CommonRetrofit
import com.exapmle.focusstart.model.server_model.CurrencyResponse
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class CurrencyViewModel(private val api: ApiMoney) : ViewModel(), KoinComponent {

//    private var api: ApiMoney = CommonRetrofit.apiMoney

//    private val _currencyList = MutableLiveData<CurrencyResponse>()
//    val currencyList: LiveData<CurrencyResponse> = _currencyList
    private val _currencyList = MutableLiveData<List<CurrencyResponse.CurrencyInfo?>>()
    val currencyList: LiveData<List<CurrencyResponse.CurrencyInfo?>> = _currencyList

    fun getCurrency() {
        viewModelScope.launch{
            //получили CurrencyResponse
            val CurrencyResponse = api.getCurrency()
            val listValute = listOf<CurrencyResponse.CurrencyInfo>(
                CurrencyResponse.valute?.component1()!!,
                CurrencyResponse.valute?.component2()!!,
                CurrencyResponse.valute?.component3()!!,
                CurrencyResponse.valute?.component4()!!,
                CurrencyResponse.valute?.component5()!!,
                CurrencyResponse.valute?.component6()!!

            )
            _currencyList.postValue(listValute)

//            _currencyList.postValue(api.getCurrency())
        }
    }
}
