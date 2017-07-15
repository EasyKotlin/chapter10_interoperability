package com.easy.kotlin

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by jack on 2017/7/14.
 */
@RunWith(JUnit4::class)
class OkhttpUtilsTest {
    @Test fun testAsyncGet() {
        val result = OkhttpUtils.get("http://www.baidu.com")
        println(result)
        Assert.assertTrue(result!!.contains("<title>百度一下，你就知道</title>"))
    }
}
