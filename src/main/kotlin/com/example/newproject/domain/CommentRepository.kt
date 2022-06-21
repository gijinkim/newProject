package com.example.newproject.domain

import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository : JpaRepository<CommentDto, Int>{
    //게시글 댓글 가져오기
    fun findByBno(bno:Int, pageable: PageRequest): Page<CommentDto>
}