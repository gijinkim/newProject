package com.example.newproject.domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "board_list")
data class BoardDto(
    @Id
    var bno : Int ?= null,
    var title:String ?= null,
    var content: String?= null,
    var writer: String?=null,
    var view_cnt:Int ?= null,
    var comment_cnt:Int ?= null,
    var reg_date:Date ?= null)

