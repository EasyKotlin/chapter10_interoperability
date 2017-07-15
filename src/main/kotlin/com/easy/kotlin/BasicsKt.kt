package com.easy.kotlin

/**
 * Created by jack on 2017/7/15.
 */


fun main(args: Array<String>) {
    print("Kotlin")
    println("Kotlin")

    val listOfNumber = listOf(1, 2, 3, 4)
    val map = mapOf(1 to "Jack", 2 to "Ali", 3 to "Mindorks")

}


fun getGrade(score: Int): String {
    var grade = when (score) {
        9, 10 -> "A"
        in 6..8 -> "B"
        4, 5 -> "C"
        in 1..3 -> "D"
        else -> "E"
    }
    return grade
}

data class Developer(val name: String, val age: Int)