package com.example.focusstart.ui.calculate

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.focusstart.R
import com.example.focusstart.model.room.dto.CurrencyInfo
import com.exapmle.focusstart.environment.extentions.observe
import kotlinx.android.synthetic.main.fragment_calculate.*
import kotlinx.android.synthetic.main.fragment_currency.toolbar
import org.koin.androidx.viewmodel.ext.android.viewModel

class CalculateFragment: Fragment(R.layout.fragment_calculate) {

    private val viewModel by viewModel<CalculateViewModel>()

    private var array = arrayListOf<String>()
    private var valueCurrency = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getCurrency()
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
        setupObservers()
        setupClickListener()
    }

    private fun setupClickListener() {
        convertButton.setOnClickListener {
            val result = etRub.text.toString().toFloat()/valueCurrency.toFloat()
            etResult.setText(result.toString())
        }
    }

    private fun setupObservers() {
        observe(viewModel.currencyList, ::handleCurrency)
    }

    private fun handleCurrency(item: List<CurrencyInfo>?) {
        setupSpinner(item)
    }

    private fun setupSpinner(item: List<CurrencyInfo>?) {
        item?.forEach {
            array.add(it.name)
        }
        var adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            array)

        spinnerCurrency.adapter = adapter
        spinnerCurrency.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                p0: AdapterView<*>?,
                p1: View?,
                position: Int,
                p3: Long
            ) {
                val currency = item?.filter { it.name.equals(adapter.getItem(position)) }
                currency?.forEach {
                    valueCurrency = it.value.toFloat()
                }
                Log.d("test", "rub = $valueCurrency")

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }


    private fun setupToolbar() {
        toolbar.apply {
            inflateMenu(R.menu.calculate_menu)
        }
    }
}