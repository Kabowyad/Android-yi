package com.example.myapplication

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun test_Product() {
        val iphoneCase = Product(price = 123.5, salePercent = 30)
        val pricePrinter: PricePrinter = ConsolePrinter()
        val discountIphoneCasePrice = iphoneCase.calcDiscountPrice()
        pricePrinter.print(discountIphoneCasePrice)
    }

    @Test
    fun test_Bucket() {
        val iphoneCase = Product(price = 123.5, salePercent = 30)
        val iphoneCase2 = Product(price = 85.5, salePercent = 20)
        val iphoneCase3 = Product(price = 50.5, salePercent = 10)
        val productList: List<Product> = listOf(iphoneCase, iphoneCase2, iphoneCase3)
        val bucket = Bucket(productList)
        val pricePrinter: PricePrinter = ConsolePrinter()
        pricePrinter.print(bucket)
    }
}