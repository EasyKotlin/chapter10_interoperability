package com.easy.kotlin

/**
 * Created by jack on 2017/7/15.
 */
class OverridesFunWithDefaultParams {
    fun f1(a: Int = 0, b: String = "B") {

    }

    @JvmOverloads fun f2(a: Int = 0, b: String = "B") {

    }
}