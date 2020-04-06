package com.example.myapplication

import java.text.DecimalFormat

class ConsolePrinter : PricePrinter  {
    override fun print(price: Double) {
        val test = "Цена со скидкой "
        val indexOfDecimal = price.toString().indexOf(".")
        if (indexOfDecimal == -1) println(test + price.toInt())
        else println(test + DecimalFormat("#.##").format(price))
    }

    override fun print(bucket: Bucket) {
        bucket.products.forEach {
            x -> this.print(x.calcDiscountPrice())
        }
    }
}