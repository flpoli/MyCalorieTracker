package com.poli.tracker_data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class SearchDto(
    val products: List<Product>
)