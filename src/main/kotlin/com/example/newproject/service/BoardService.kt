package com.example.newproject.service

import com.example.newproject.domain.BoardDto

interface BoardService {

    @Throws(Exception::class)
    fun getCount():Int

    @Throws(Exception::class)
    fun remove(bno:Int, writer:String):Int

    @Throws(Exception::class)
    fun write(boardDto: BoardDto):Int

    @Throws(Exception::class)
    fun getList():List<BoardDto>

    @Throws(Exception::class)
    fun read(bno: Int):Int

    @Throws(Exception::class)
    fun getPage(map: Map<*,*>):List<BoardDto>

    @Throws(Exception::class)
    fun modify(boardDto: BoardDto):Int

    @Throws(Exception::class)
    fun getSearchResultPage(sc:SearchCondition):List<BoardDto>

    @Throws(Exception::class)
    fun getSearchResultCnt(sc:SearchCondition):Int

}