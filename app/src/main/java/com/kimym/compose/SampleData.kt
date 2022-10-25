package com.kimym.compose

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class RainbowEntity(@DrawableRes val drawable: Int, @StringRes val text: Int)

object SampleData {
    val rainbow = listOf(
        RainbowEntity(R.drawable.red, R.string.red),
        RainbowEntity(R.drawable.orange, R.string.orange),
        RainbowEntity(R.drawable.yellow, R.string.yellow),
        RainbowEntity(R.drawable.green, R.string.green),
        RainbowEntity(R.drawable.blue, R.string.blue),
        RainbowEntity(R.drawable.navy, R.string.navy),
        RainbowEntity(R.drawable.purple, R.string.purple)
    )
}
