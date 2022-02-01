package com.example.focusstart.ui.currency

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.exapmle.focusstart.environment.extentions.observe
import com.example.focusstart.R
import com.example.focusstart.model.room.dto.CurrencyInfo
import com.example.focusstart.ui.mNavController
import com.exapmle.focusstart.ui.currency.CurrencyViewModel
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
        setupToolbar()
        setupRv()
        setupObservers()
        setupClickListeners()
    }

    private fun setupToolbar() {
        toolbar.apply {
            inflateMenu(R.menu.currency_menu)
            setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.calcul -> {
                        mNavController.navigate(R.id.action_currencyFragment_to_calculateFragment)
                        true
                    }
                    else -> false
                }
            }
        }
    }

    private fun setupRv() {
        mAdapter = CurrencyAdapter()
        mRecyclerView = recycler_view
        mRecyclerView.adapter = mAdapter
    }

    private fun setupClickListeners(){
        swipeRefreshLayout.setOnRefreshListener{
            viewModel.getCurrency()
        }
    }

    private fun setupObservers() {
        observe(viewModel.currencyList, ::handleCurrency)
    }

    private fun handleCurrency(item: List<CurrencyInfo>?) {
        mAdapter.setList(item)
        swipeRefreshLayout.isRefreshing = false
    }

}