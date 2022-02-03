package com.example.focusstart.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.focusstart.R

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    lateinit var mNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initNavigationGraph()
    }

    private fun initNavigationGraph() {
        val navHostFragment =
        supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        val navController = navHostFragment.navController
        mNavController = navHostFragment.navController

    }
}