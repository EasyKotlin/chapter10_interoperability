package com.easy.kotlin

/**
 * Created by jack on 2017/7/15.
 */
class Department {
    var id: Long = -1L
    var name: String = "Dept"
    var isOpen: Boolean = true
    var isBig: String = "Y"

    @JvmField var NO = 0

    companion object {
        var innerID = "X001"
        @JvmField
        var innerName = "DEP"

        fun getObjectName() = "ONAME"
        @JvmStatic
        fun getObjectID() = "OID"
    }
}