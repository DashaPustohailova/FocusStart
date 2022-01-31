package com.example.focusstart.ui.currency

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.valute_item.view.*

class CurrencyHolder(view: View): RecyclerView.ViewHolder(view) {
    val itemNameValute: TextView = view.item_name_valute
    val itemValue: TextView = view.item_value
    val itemCode: TextView = view.item_code
}