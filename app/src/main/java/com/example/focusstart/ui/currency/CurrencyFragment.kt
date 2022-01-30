package com.exapmle.focusstart.ui.currency

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.exapmle.focusstart.environment.extentions.observe
import com.example.focusstart.R
import com.exapmle.focusstart.model.server_model.CurrencyResponse
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
//        adapter.setList(item.valute)
    }
}