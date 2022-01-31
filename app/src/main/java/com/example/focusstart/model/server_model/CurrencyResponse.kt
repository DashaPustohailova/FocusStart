package com.exapmle.focusstart.model.server_model

import com.google.gson.annotations.SerializedName

data class CurrencyResponse(
    @SerializedName("Date")
    val date: String?,
    @SerializedName("PreviousDate")
    val previousDate: String?,
    @SerializedName("PreviousURL")
    val previousURL: String?,
    @SerializedName("Timestamp")
    val timestamp: String?,
    @SerializedName("Valute")
    val valute: Valute?
) {

    data class Valute(
        @SerializedName("AUD")
        val aud: CurrencyInfo?,
        @SerializedName("AZN")
        val azn: CurrencyInfo?,
        @SerializedName("GBP")
        val gbp: CurrencyInfo?,
        @SerializedName("AMD")
        val amd: CurrencyInfo?,
        @SerializedName("BYN")
        val byn: CurrencyInfo?,
        @SerializedName("BGN")
        val bgn: CurrencyInfo?,
        @SerializedName("BRL")
        val brl: CurrencyInfo?,
        @SerializedName("HUF")
        val huf: CurrencyInfo?,
        @SerializedName("HKD")
        val hkd: CurrencyInfo?,
        @SerializedName("DKK")
        val dkk: CurrencyInfo?,
        @SerializedName("USD")
        val usd: CurrencyInfo?,
        @SerializedName("EUR")
        val eur: CurrencyInfo?,
        @SerializedName("INR")
        val inr: CurrencyInfo?,
        @SerializedName("KZT")
        val kzt: CurrencyInfo?,
        @SerializedName("CAD")
        val cad: CurrencyInfo?,
        @SerializedName("KGS")
        val kgs: CurrencyInfo?,
        @SerializedName("CNY")
        val cny: CurrencyInfo?,
        @SerializedName("MDL")
        val mdl: CurrencyInfo?,
        @SerializedName("NOK")
        val nok: CurrencyInfo?,
        @SerializedName("PLN")
        val pln: CurrencyInfo?,
        @SerializedName("RON")
        val ron: CurrencyInfo?,
        @SerializedName("XDR")
        val xdr: CurrencyInfo?,
        @SerializedName("SGD")
        val sgd: CurrencyInfo?,
        @SerializedName("TJS")
        val tjs: CurrencyInfo?,
        @SerializedName("TRY")
        val tryValute: CurrencyInfo?,
        @SerializedName("TMT")
        val tmt: CurrencyInfo?,
        @SerializedName("UZS")
        val uzc: CurrencyInfo?,
        @SerializedName("UAH")
        val uah: CurrencyInfo?,
        @SerializedName("CZK")
        val szk: CurrencyInfo?,
        @SerializedName("SEK")
        val sek: CurrencyInfo?,
        @SerializedName("CHF")
        val chf: CurrencyInfo?,
        @SerializedName("ZAR")
        val zar: CurrencyInfo?,
        @SerializedName("KRW")
        val krw: CurrencyInfo?,
        @SerializedName("JPY")
        val jpy: CurrencyInfo?

    )
        data class CurrencyInfo(
            @SerializedName("ID")
            val id: String?,
            @SerializedName("NumCode")
            val numCode: String?,
            @SerializedName("CharCode")
            val charCode: String?,
            @SerializedName("Nominal")
            val nominal: Int?,
            @SerializedName("Name")
            val name: String?,
            @SerializedName("Value")
            val value: Float?,
            @SerializedName("Previous")
            val previous: Float?
        )

}
