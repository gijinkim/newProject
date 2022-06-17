package com.example.newproject

import org.junit.jupiter.api.Test
import kotlin.math.ceil

class TestExample {

    @Test
    fun testAdd(){
        var totalCnt = 10
        var pageSize = 10

        var totalPage = ceil(totalCnt/(pageSize.toDouble())).toInt()

    }
}