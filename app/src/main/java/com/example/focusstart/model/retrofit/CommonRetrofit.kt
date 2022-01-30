package com.exapmle.focusstart.model.retrofit

object CommonRetrofit {
    private val BASE_URL = "https://www.cbr-xml-daily.ru/"
    val apiMoney: ApiMoney
        get() = RetrofitClient.getClient(BASE_URL).create(ApiMoney::class.java)
}