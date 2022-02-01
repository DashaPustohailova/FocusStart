package com.exapmle.focusstart.ui.currency

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.focusstart.model.data_source.CurrencyDataSource
import com.example.focusstart.model.room.AppRoomDao
import com.example.focusstart.model.room.AppRoomRepository
import com.example.focusstart.model.room.dto.CurrencyInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class CurrencyViewModel(
    private val dataSource: CurrencyDataSource,
    private val repository: AppRoomRepository
) : ViewModel(), KoinComponent {

    private val _currencyList = MutableLiveData<List<CurrencyInfo>>()
    var currencyList: LiveData<List<CurrencyInfo>> = _currencyList

    fun getCurrency() {
        viewModelScope.launch  {
                val currencyList = dataSource.getCurrencyList()
                repository.insert(currencyList)
                _currencyList.postValue(repository.allCurrency())
        }
    }

}
