package com.example.newproject.controller

import com.example.newproject.domain.BoardDto
import com.example.newproject.domain.BoardDtoRepository
import com.example.newproject.domain.UserDto
import com.example.newproject.domain.UserRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.TestPropertySource

@SpringBootTest
//@ActiveProfiles("test")
//@TestPropertySource(
//    properties = [
//        "DB_USER=postgres",
//        "DB_PASSWORD=12345678"
//    ]
//)
class BoardRepositoryTest(
) {
    @Autowired
    lateinit var boardDtoRepository: BoardDtoRepository



    @Test
    fun save() {
            for (i in 31..200){
                val boardDto = BoardDto()
                boardDto.bno = i
                boardDto.writer = "$i"
                boardDto.title = "$i"
                boardDto.content = "$i"
                boardDtoRepository.save(boardDto)
            }
        }
    }


