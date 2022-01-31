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

    private val _currencyList = MutableLiveData<List<CurrencyResponse.CurrencyInfo?>>()
    val currencyList: LiveData<List<CurrencyResponse.CurrencyInfo?>> = _currencyList

    private val _updateDate = MutableLiveData<String?>()
    val updateDate: LiveData<String?> = _updateDate


    fun getUpdateDate(){
        viewModelScope.launch {
            val currencyResponse = api.getCurrency()
            _updateDate.postValue(currencyResponse.timestamp)
        }
    }
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
                CurrencyResponse.valute?.component6()!!,
                CurrencyResponse.valute?.component7()!!,
                CurrencyResponse.valute?.component8()!!,
                CurrencyResponse.valute?.component9()!!,
                CurrencyResponse.valute?.component10()!!,
                CurrencyResponse.valute?.component11()!!,
                CurrencyResponse.valute?.component12()!!,
                CurrencyResponse.valute?.component13()!!,
                CurrencyResponse.valute?.component14()!!,
                CurrencyResponse.valute?.component15()!!,
                CurrencyResponse.valute?.component16()!!,
                CurrencyResponse.valute?.component17()!!,
                CurrencyResponse.valute?.component18()!!,
                CurrencyResponse.valute?.component19()!!,
                CurrencyResponse.valute?.component20()!!,
                CurrencyResponse.valute?.component21()!!,
                CurrencyResponse.valute?.component22()!!,
                CurrencyResponse.valute?.component23()!!,
                CurrencyResponse.valute?.component24()!!,
                CurrencyResponse.valute?.component25()!!,
                CurrencyResponse.valute?.component26()!!,
                CurrencyResponse.valute?.component27()!!,
                CurrencyResponse.valute?.component28()!!,
                CurrencyResponse.valute?.component29()!!,
                CurrencyResponse.valute?.component30()!!,
                CurrencyResponse.valute?.component31()!!,
                CurrencyResponse.valute?.component32()!!,
                CurrencyResponse.valute?.component33()!!,
                CurrencyResponse.valute?.component34()!!
            )
            _currencyList.postValue(listValute)
        }
    }
}
