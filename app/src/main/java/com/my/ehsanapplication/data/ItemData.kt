package com.my.ehsanapplication.data

import android.graphics.drawable.Drawable

data class ItemData(
    val image : Drawable,
    val title : String,
    var isSelected: Boolean = false
)
