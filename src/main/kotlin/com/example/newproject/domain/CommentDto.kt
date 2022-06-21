package com.example.newproject.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "comment")
class CommentDto (
    @Id
    @GeneratedValue
    var cno:Int ?= null,
    var bno:Int ?= null,
    var pcno:Int ?= null,
    var comment:String ?= null,
    var commenter:String ?= null,
    var reg_date:Int ?= null,
    var up_date:Int ?= null
        )