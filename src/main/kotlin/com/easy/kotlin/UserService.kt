package com.easy.kotlin

/**
 * Created by jack on 2017/7/14.
 */
interface UserService {
    fun findByName(name: String): User
}