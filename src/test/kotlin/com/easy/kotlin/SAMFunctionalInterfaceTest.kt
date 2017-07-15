package com.easy.kotlin

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by jack on 2017/7/15.
 */
@RunWith(JUnit4::class)
class SAMFunctionalInterfaceTest {
    @Test fun testSAMFunctionalInterface() {
        val runnable = Runnable { println("执行测试") } // 调用Java的SAM接口方法
        val thread = Thread(runnable)
        thread.start()
    }
}