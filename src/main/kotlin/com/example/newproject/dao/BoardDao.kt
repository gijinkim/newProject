package com.example.newproject.dao

import com.example.newproject.domain.BoardDto


interface BoardDao {

    @Throws(Exception::class)
    fun count():Int

    @Throws(Exception::class)
    fun deletAll():Int

    @Throws(Exception::class)
    fun delete(bno: Int, writer:String):Int

    @Throws(Exception::class)
    fun insert(dto: BoardDto):Int

    @Throws(Exception::class)
    fun selectAll():List<BoardDto>

    @Throws(Exception::class)
    fun select(bno: Int):BoardDto

    @Throws(Exception::class)
    fun selectPage(map:Map<*,*>):List<BoardDto>

    @Throws(Exception::class)
    fun update(dto: BoardDto):Int

    @Throws(Exception::class)
    fun increaseViewCnt(bno: Int):Int

    @Throws(Exception::class)
    fun searchSelectPage(sc:SearchCondition):List<BoardDto>

    @Throws(Exception::class)
    fun searchResultCnt(sc:SearchCondition):Int


    fun updateCommentCnt(bno: Int, cnt: Int): Int
}

