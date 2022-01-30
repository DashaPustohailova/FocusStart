package com.example.focusstart.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.focusstart.R

class MainActivity : AppCompatActivity() {
    lateinit var mNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNavigationGraph()
    }

    private fun initNavigationGraph() {
        mNavController = Navigation.findNavController(this, R.id.nav_host_fragment)
    }
}