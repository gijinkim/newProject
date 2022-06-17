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
            val list:List<BoardDto> = boardDtoRepository.findByTitleContaining("asdf")
            val iterator = list.listIterator()
            while (iterator.hasNext()){
                println(iterator.next())
            }
        }
    }


