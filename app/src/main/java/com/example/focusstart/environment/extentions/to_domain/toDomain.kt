package com.example.focusstart.environment.extentions.to_domain

import com.example.focusstart.model.room.dto.CurrencyInfo
import com.example.focusstart.model.server_model.CurrencyResponse

fun CurrencyResponse.toDomain() : List<CurrencyInfo> {
    val listValute = listOf<CurrencyInfo>(
        valute?.component1()?.toDomain()!!,
        valute?.component2()?.toDomain()!!,
        valute?.component3()?.toDomain()!!,
        valute?.component4()?.toDomain()!!,
        valute?.component5()?.toDomain()!!,
        valute?.component6()?.toDomain()!!,
        valute?.component7()?.toDomain()!!,
        valute?.component8()?.toDomain()!!,
        valute?.component9()?.toDomain()!!,
        valute?.component10()?.toDomain()!!,
        valute?.component11()?.toDomain()!!,
        valute?.component14()?.toDomain()!!,
        valute?.component13()?.toDomain()!!,
        valute?.component12()?.toDomain()!!,
        valute?.component15()?.toDomain()!!,
        valute?.component16()?.toDomain()!!,
        valute?.component17()?.toDomain()!!,
        valute?.component18()?.toDomain()!!,
        valute?.component19()?.toDomain()!!,
        valute?.component20()?.toDomain()!!,
        valute?.component21()?.toDomain()!!,
        valute?.component22()?.toDomain()!!,
        valute?.component23()?.toDomain()!!,
        valute?.component24()?.toDomain()!!,
        valute?.component25()?.toDomain()!!,
        valute?.component26()?.toDomain()!!,
        valute?.component27()?.toDomain()!!,
        valute?.component28()?.toDomain()!!,
        valute?.component29()?.toDomain()!!,
        valute?.component30()?.toDomain()!!,
        valute?.component31()?.toDomain()!!,
        valute?.component32()?.toDomain()!!,
        valute?.component33()?.toDomain()!!,
        valute?.component34()?.toDomain()!!
    )
    return listValute
}

fun CurrencyResponse.CurrencyInfo.toDomain() =  CurrencyInfo(
    id = id?:"",
    numCode = numCode?:"",
    charCode = charCode?:"",
    nominal = nominal?:0,
    name = name?:"",
    value = value?:0.0f,
    previous = previous?:0.0f
)