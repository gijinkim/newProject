package com.example.newproject.dao

import com.example.newproject.domain.BoardDto

class BoardDaoImpl : BoardDao{

    override fun count(): Int {
        TODO("Not yet implemented")
    }

    override fun deletAll(): Int {
        TODO("Not yet implemented")
    }

    override fun delete(bno: Int, writer: String): Int {
        TODO("Not yet implemented")
    }

    override fun insert(dto: BoardDto): Int {
        TODO("Not yet implemented")
    }

    override fun selectAll(): List<BoardDto> {
        TODO("Not yet implemented")
    }

    override fun select(bno: Int): BoardDto {
        TODO("Not yet implemented")
    }

    override fun selectPage(map: Map<*, *>): List<BoardDto> {
        TODO("Not yet implemented")
    }

    override fun update(dto: BoardDto): Int {
        TODO("Not yet implemented")
    }

    override fun increaseViewCnt(bno: Int): Int {
        TODO("Not yet implemented")
    }

    override fun searchSelectPage(sc: SearchCondition): List<BoardDto> {
        TODO("Not yet implemented")
    }

    override fun searchResultCnt(sc: SearchCondition): Int {
        TODO("Not yet implemented")
    }

    override fun updateCommentCnt(bno: Int, cnt: Int): Int {
        TODO("Not yet implemented")
    }

}