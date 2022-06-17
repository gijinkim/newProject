package com.example.newproject.service

import com.example.newproject.domain.BoardDto
import com.example.newproject.domain.BoardDtoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class BoardService{

    @Autowired
    lateinit var boardDtoRepository: BoardDtoRepository

    fun pageList(page:Int) : Page<BoardDto>{
        return boardDtoRepository.findAll(PageRequest.of(page, 10, Sort.by(Sort.Direction.ASC, "bno")))
    }

    fun searchList(keyword:String):List<BoardDto>{
        val boardDtoList:List<BoardDto> = boardDtoRepository.findByTitleContaining(keyword)
        return boardDtoList
    }
}