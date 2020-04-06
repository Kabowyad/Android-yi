package com.example.myapplication

class Bucket (
    val products: List<Product> = emptyList<Product>()
) {
    fun calcDiscountPrice(): Double = products.map { product -> product.calcDiscountPrice() }.sum()
}