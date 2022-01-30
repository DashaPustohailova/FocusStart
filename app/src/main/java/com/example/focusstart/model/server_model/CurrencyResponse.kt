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
        val bgn: CurrencyInfo?
    ) {

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
}
