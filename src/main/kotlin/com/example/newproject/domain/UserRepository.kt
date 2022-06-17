package com.example.newproject.domain

import org.springframework.data.jpa.repository.JpaRepository


interface UserRepository : JpaRepository<UserDto, String>