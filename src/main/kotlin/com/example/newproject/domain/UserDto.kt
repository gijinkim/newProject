package com.example.newproject.domain

import org.springframework.boot.autoconfigure.domain.EntityScan
import java.util.Date
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user_info")
data class UserDto(
    @Id
    var id: String? = null,
    var pwd: String? = null,
    var name: String? = null,
    var email: String? = null,
    var birth: String? = null,
    var sns: String? = null,
    var reg_date: String? = null
)