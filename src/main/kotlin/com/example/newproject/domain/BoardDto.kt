package com.example.newproject.domain

import java.util.*

data class BoardDto(var bno : Int ?= null, var title:String ?= null, var content: String?= null,var writer: String?=null,
                    var view_cnt:Int ?= null, var comment_cnt:Int ?= null, var reg_date:Date ?= null) {
//    var bno: Int? = null
//    var title: String? = null
//    var content: String? = null
//    var writer: String? = null
//    var view_cnt:Int? = null
//    var comment_cnt:Int ?= null
//    var reg_date: Date? = null

//    constructor() {}
//    constructor(title: String?, content: String?, writer: String?){
//        this.title = title
//        this.content = content
//        this.writer = writer
//    }

//    override fun hashCode(): Int {
//        return Objects.hash(bno, content, title, writer)
//    }

//    override fun equals(obj: Any?): Boolean {
//        if (this === obj) return true
//        if (obj == null) return false
//        if (javaClass != obj.javaClass) return false
//        val other = obj as BoardDto
//        return Objects.equals(bno, other.Bno) && comment_cnt == other.comment_cnt && Objects.equals(
//            content,
//            other.content
//        ) && Objects.equals(title, other.title) && view_cnt == other.view_cnt && Objects.equals(writer, other.writer)
//    }

//    override fun toString(): String {
//        return ("BoardDto [Bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer
//                + ", view_cnt=" + view_cnt + ", comment_cnt=" + comment_cnt + ", reg_date=" + reg_date + "]")
//    }
}
