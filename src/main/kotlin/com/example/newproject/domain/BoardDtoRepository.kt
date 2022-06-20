package com.example.newproject.domain


import com.fasterxml.jackson.databind.ObjectWriter
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

interface BoardDtoRepository : JpaRepository<BoardDto, Int> {


    //제목과 내용으로 게시물 찾기
    fun findByTitleContainingOrContentContaining(TitleKeyword: String, ContentKeyword: String, pageable: Pageable): Page<BoardDto>

    //제목으로 게시물 찾기
    fun findByTitleContaining(TitleKeyword: String, pageable: Pageable): Page<BoardDto>

    //작성자로 게시물 찾기
    fun findByWriterContaining(WriterKeyword: String, pageable: Pageable): Page<BoardDto>

    //게시글 읽기
    fun getBoardDtoByBno(bno:Int):BoardDto

    //게시물 쓰기 그리고 수정하기
    fun save(boardDto: BoardDto)

    //게시물 삭제
    fun deleteByBnoAndWriter(bno: Int, writer: String)
}


