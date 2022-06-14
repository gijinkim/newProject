package com.example.newproject.dao

import com.example.newproject.domain.UserDto

interface UserDao {

    @Throws(Exception::class)
    fun selectUser(id:String):UserDto

    @Throws(Exception::class)
    fun deleteUer(id:String):Int

    @Throws(Exception::class)
    fun inserUer(user:UserDto):Int

    @Throws(Exception::class)
    fun updateUser(user: UserDto):Int

    @Throws(Exception::class)
    fun count():Int

    @Throws(Exception::class)
    fun deleteAll():Int
}