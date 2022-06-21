package com.example.newproject.controller

import com.example.newproject.domain.CommentDto
import com.example.newproject.service.CommentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class CommentController {

    @Autowired
    lateinit var commentService:CommentService


    @GetMapping("/comments")
    @ResponseBody
    fun commentList(bno:Int, @RequestParam(required = false, defaultValue = "0", value = "page") page: Int):ResponseEntity<Page<CommentDto>>{
        val list = commentService.commentList(bno,page)
        val cmt = ResponseEntity(list,HttpStatus.OK)
//        println("comment=" + list.toList().get(0))
        return cmt
    }
}