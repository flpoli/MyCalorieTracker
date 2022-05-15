package com.poli.tracker_data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Product(
    @Json(name = "image_front_thumb_url")
    val imageFrontThumbUrl: String?,
    @Json(name = "nutriments")
    val nutriments: Nutriments,
    @Json(name = "product_name")
    val productName: String?
)