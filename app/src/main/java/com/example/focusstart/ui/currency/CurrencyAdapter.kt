package com.example.focusstart.ui.currency

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.focusstart.R
import com.example.focusstart.model.room.dto.CurrencyInfo

class CurrencyAdapter: RecyclerView.Adapter<CurrencyHolder>() {

    private var mListCurrency = emptyList<CurrencyInfo>()
    private var timestampt = ""

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.valute_item, parent, false)
        return CurrencyHolder(view)
    }

    override fun onBindViewHolder(holder: CurrencyHolder, position: Int) {
        holder.itemNameValute.text = mListCurrency[position]?.name
        holder.itemCode.text= "Код: " +  mListCurrency[position]?.charCode + " " + mListCurrency[position]?.numCode
        holder.itemValue.text = "Курс: " + mListCurrency[position]?.value  + " ₽"
    }

    override fun getItemCount(): Int = mListCurrency.size

    fun setList(list: List<CurrencyInfo>?) {
        mListCurrency = list?: emptyList()
        notifyDataSetChanged()
    }

}