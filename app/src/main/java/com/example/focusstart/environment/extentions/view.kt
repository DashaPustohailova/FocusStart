package com.example.focusstart.environment.extentions

import android.view.View

fun View.gone() = run { visibility = View.GONE }
fun View.visible() { visibility = View.VISIBLE }