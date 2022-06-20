package com.example.newproject.controller

import com.example.newproject.domain.BoardDto
import com.example.newproject.domain.BoardDtoRepository
import com.example.newproject.domain.UserDto
import com.example.newproject.domain.UserRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.Page
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.TestPropertySource
import javax.transaction.Transactional

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


    //제목과 내용으로 찾기 테스트
//    @Test
//    fun findByTitleAndContent(){
//        val list:Page<BoardDto> = boardDtoRepository.findByTitleContainingOrContentContaining("asdf", "asdf",1)
//        val iterator = list.iterator()
//        while (iterator.hasNext()){
//            println(iterator.next())
//        }
//    }

    //제목으로 게시물 찾기 테스트
//    @Test
//    fun findByTitle() {
//            val list:Page<BoardDto> = boardDtoRepository.findByTitleContaining("asdf")
//            val iterator = list.iterator()
//            while (iterator.hasNext()){
//                println(iterator.next())
//            }
//    }

    //작성자로 게시물 찾기 테스트
//    @Test
//    fun findByWriter(){
//        val list: Page<BoardDto> = boardDtoRepository.findByWriterContaining("bbbbb")
//        val iterator = list.iterator()
//        while (iterator.hasNext()){
//            println(iterator.next())
//        }
//    }

    //게시물 가져오기 테스트
    @Test
    fun read(){
        val boardDto:BoardDto = boardDtoRepository.getBoardDtoByBno(1)
        println(boardDto)
    }

    @Test
    fun write(){
        val boardDto = BoardDto()
        boardDto.bno = 1
        boardDto.title = "war"
        boardDto.writer = "kimgijin"
        boardDto.content = "war is not good"
        boardDtoRepository.save(boardDto)
    }

    @Test
    @Transactional
    fun remove(){
        boardDtoRepository.deleteByBnoAndWriter(2, "jin")
    }

    @Test
    fun re(){
    }
}







