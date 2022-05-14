package com.poli.tracker_data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchDto(
    @Json(name = "count")
    val count: Int,
    @Json(name = "page")
    val page: Int,
    @Json(name = "page_count")
    val pageCount: Int,
    @Json(name = "page_size")
    val pageSize: Int?,
    @Json(name = "products")
    val products: List<Product>,
    @Json(name = "skip")
    val skip: Int
)