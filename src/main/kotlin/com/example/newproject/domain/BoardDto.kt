package com.example.newproject.domain

import java.util.*
import javax.persistence.*


@Entity
@Table(name = "board_list")
data class BoardDto(
    var title: String? = null,
    var content: String? = null,
    var writer: String? = null,
    var view_cnt: Int? = null,
    var comment_cnt: Int? = null,
    var reg_date: Int? = null
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var bno: Int = 0
}

