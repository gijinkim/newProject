package com.example.newproject.domain

import org.springframework.data.domain.Page
import org.springframework.data.jpa.repository.JpaRepository

interface BoardDtoRepository : JpaRepository<BoardDto, Int>



