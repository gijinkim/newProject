package com.example.newproject.service

import com.example.newproject.domain.CommentDto
import com.example.newproject.domain.CommentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service


@Service
class CommentService {

    @Autowired
    lateinit var commentRepository: CommentRepository

    //전체 댓글 가져오기
    fun commentList(bno:Int,page:Int): Page<CommentDto> {
       return commentRepository.findByBno(bno, PageRequest.of(page,10,))
    }
}