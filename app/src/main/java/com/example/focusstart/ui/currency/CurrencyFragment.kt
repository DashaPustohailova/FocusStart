package com.exapmle.focusstart.ui.currency

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.exapmle.focusstart.environment.extentions.observe
import com.example.focusstart.R
import com.example.focusstart.ui.currency.CurrencyAdapter
import com.exapmle.focusstart.model.server_model.CurrencyResponse
import kotlinx.android.synthetic.main.fragment_currency.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CurrencyFragment : Fragment(R.layout.fragment_currency) {

    private val viewModel by viewModel<CurrencyViewModel>()
    private lateinit var mAdapter: CurrencyAdapter
    private lateinit var mRecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getCurrency()
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRv()
        setupObservers()

    }

    private fun setupRv() {
        mAdapter = CurrencyAdapter()
        mRecyclerView = recycler_view
        mRecyclerView.adapter = mAdapter
    }

    private fun setupObservers() {
        observe(viewModel.currencyList, ::handleCurrency)
    }

    private fun handleCurrency(item: List<CurrencyResponse.CurrencyInfo?>?) {
        mAdapter.setList(item)
    }
}