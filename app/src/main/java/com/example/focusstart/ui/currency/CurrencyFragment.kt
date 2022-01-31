package com.exapmle.focusstart.ui.currency

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.exapmle.focusstart.environment.extentions.observe
import com.example.focusstart.R
import com.example.focusstart.environment.extentions.gone
import com.example.focusstart.ui.currency.CurrencyAdapter
import com.example.focusstart.ui.mNavController
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
        viewModel.getUpdateDate()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
        setupRv()
        setupObservers()
//        timestampObservers()
    }

    private fun setupToolbar() {
        toolbar.apply {
            inflateMenu(R.menu.currency_menu)
            setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.sync -> {
                        // Navigate to settings screen
                        viewModel.getCurrency()
                        viewModel.getUpdateDate()
                        Toast.makeText(requireContext(), "Test", Toast.LENGTH_LONG).show()
                        true
                    }
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

    private fun setupObservers() {
        observe(viewModel.currencyList, ::handleCurrency)
    }
//
//    private fun timestampObservers() {
//        observe(viewModel.updateDate, ::handleTimestamp)
//    }
    private fun handleCurrency(item: List<CurrencyResponse.CurrencyInfo?>?) {
        mAdapter.setList(item)
    }
//    private fun handleTimestamp(date: String?){
//        mAdapter.setTimestamp(date)
//    }

}