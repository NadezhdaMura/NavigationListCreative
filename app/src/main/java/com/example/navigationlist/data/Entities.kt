package com.example.navigationlist.data

import com.google.gson.annotations.SerializedName

data class Cat(
    val catData: CatData
)
data class CatData(
    @SerializedName("url")val url:String
)