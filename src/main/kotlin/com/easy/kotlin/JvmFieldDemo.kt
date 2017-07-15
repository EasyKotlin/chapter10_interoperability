package com.easy.kotlin

/**
 * Created by jack on 2017/7/15.
 */

fun testJvmField() {
    println(Book.name)
    println(Book.author)
    println(Book.pages)
}



object Book {
    val name = ""
    @JvmField
    val pages: Int = 0
    val author: String = "Jack"

    @JvmStatic
    fun getBook() {

    }
}

fun main(args: Array<String>) {
    testJvmField()
}