package com.example.newproject.controller

import com.example.newproject.domain.*
import com.example.newproject.service.CommentService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.Page
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.TestPropertySource
import javax.transaction.Transactional

@SpringBootTest
class CommentRepositoryTest(
) {
    @Autowired
    lateinit var commentRepository: CommentRepository

    @Autowired
    lateinit var commentService: CommentService


    @Test
    fun save(){
        val commentDto = CommentDto()
        commentDto.bno = 1
        commentDto.cno = 1
        commentDto.comment = "aaa"

        commentRepository.save(commentDto)
    }

    @Test
    fun read(){
        val page = commentService.commentList(1, 0)


        println( page.toList().get(0).comment)
    }
}







