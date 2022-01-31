package com.example.focusstart.ui.currency

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.focusstart.R
import com.exapmle.focusstart.model.server_model.CurrencyResponse

class CurrencyAdapter: RecyclerView.Adapter<CurrencyHolder>() {

    private var mListCurrency = emptyList<CurrencyResponse.CurrencyInfo?>()
    private var timestampt = ""

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.valute_item, parent, false)
        return CurrencyHolder(view)
    }

    override fun onBindViewHolder(holder: CurrencyHolder, position: Int) {
        holder.itemNameValute.text = mListCurrency[position]?.name
        holder.itemCode.text = "Код: " +  mListCurrency[position]?.charCode + " " + mListCurrency[position]?.numCode
        holder.itemValue.text = "Курс: " + mListCurrency[position]?.value  + " ₽"
//        holder.itemTimestamp.text = timestampt
    }

    override fun getItemCount(): Int = mListCurrency.size

    fun setList(list: List<CurrencyResponse.CurrencyInfo?>?) {
        mListCurrency = list?: emptyList()
        notifyDataSetChanged()
    }

    fun setTimestamp(time: String?){
        timestampt = time?:""
        notifyDataSetChanged()
    }

}