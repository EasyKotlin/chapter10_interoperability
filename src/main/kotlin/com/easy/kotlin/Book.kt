package com.easy.kotlin

/**
 * Created by jack on 2017/7/15.
 */

class ProgrammingBook {
    private var isbn: String = "978-7-111-44250-9"
    protected var author: String = "Cay"
    public var name: String = "Core Java"
    internal var pages: Int = 300

    private fun findISBN(): String = "978-7-111-44250-9"
    protected fun findAuthor(): String = "Cay"
    public fun findName(): String = "Core Java"
    internal fun findPages(): Int = 300
}