package com.example.newproject.service

import com.example.newproject.domain.BoardDto

class BoardServiceImpl : BoardService{
    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun remove(bno: Int, writer: String): Int {
        TODO("Not yet implemented")
    }

    override fun write(boardDto: BoardDto): Int {
        TODO("Not yet implemented")
    }

    override fun getList(): List<BoardDto> {
        TODO("Not yet implemented")
    }

    override fun read(bno: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getPage(map: Map<*, *>): List<BoardDto> {
        TODO("Not yet implemented")
    }

    override fun modify(boardDto: BoardDto): Int {
        TODO("Not yet implemented")
    }

    override fun getSearchResultPage(sc: SearchCondition): List<BoardDto> {
        TODO("Not yet implemented")
    }

    override fun getSearchResultCnt(sc: SearchCondition): Int {
        TODO("Not yet implemented")
    }

}