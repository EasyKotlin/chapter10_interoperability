package com.easy.kotlin

/**
 * Created by jack on 2017/7/14.
 */
class UserServiceImpl : UserService {
    override fun findByName(name: String): User {
        return User("admin", "admin")
    }
}