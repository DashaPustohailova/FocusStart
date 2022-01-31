package com.exapmle.focusstart.ui.currency

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.exapmle.focusstart.environment.extentions.observe
import com.example.focusstart.R
import com.exapmle.focusstart.model.server_model.CurrencyResponse
import kotlinx.android.synthetic.main.fragment_currency.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CurrencyFragment : Fragment(R.layout.fragment_currency) {

    private val viewModel by viewModel<CurrencyViewModel>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRv()
        setupObservers()

    }

    private fun setupRv() {

    }

    private fun setupObservers() {
        observe(viewModel.currencyList, ::handleCurrency)
    }

    private fun handleCurrency(item: CurrencyResponse?) {
        testTw.text = item?.date
        Log.d("CURRENCY", "Ooops")

//        adapter.setList(item.valute)
    }
}