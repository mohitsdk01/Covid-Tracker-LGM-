package com.example.covid19tracker

data class Model(
    val cityName: String,
    val activeCase: Int,
    val totalCase: Int,
    val deathCase: Int,
    val recCase: Int
)