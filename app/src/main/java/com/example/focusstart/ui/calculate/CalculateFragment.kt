package com.example.focusstart.ui.calculate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.focusstart.R
import com.exapmle.focusstart.ui.currency.CurrencyViewModel
import kotlinx.android.synthetic.main.fragment_currency.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CalculateFragment: Fragment(R.layout.fragment_calculate) {

    private val viewModel by viewModel<CurrencyViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
    }

    private fun setupToolbar() {
        toolbar.apply {
            inflateMenu(R.menu.calculate_menu)
        }
    }
}