package com.easy.kotlin

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by jack on 2017/7/14.
 */
@RunWith(JUnit4::class)
class KotlinUsingJavaTest {
    @Test fun testArrayList() {
        val source = listOf<Int>(1, 2, 3, 4, 5)
        // 使用Java的ArrayList
        val list = ArrayList<Int>()
        for (item in source) {
            list.add(item) // ArrayList.add()
        }
        for (i in 0..source.size - 1) {
            list[i] = source[i] // 调用 get 和 set
        }
    }
}