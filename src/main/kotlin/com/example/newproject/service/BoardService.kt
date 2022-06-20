package com.example.newproject.service

import com.example.newproject.domain.BoardDto
import com.example.newproject.domain.BoardDtoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class BoardService{

    @Autowired
    lateinit var boardDtoRepository: BoardDtoRepository

    //전체 게시물 가져오기
    fun boardList(page:Int) : Page<BoardDto>{
        return boardDtoRepository.findAll(PageRequest.of(page, 10, Sort.by(Sort.Direction.DESC, "bno")))
    }

    //제목과 내용으로 게시물 찾기
    fun searchListByTitleAndContent(TitleKeyword: String, ContentKeyword:String,page: Int):Page<BoardDto>{
        val boardDtoList:Page<BoardDto> = boardDtoRepository.findByTitleContainingOrContentContaining(TitleKeyword, ContentKeyword,PageRequest.of(page, 10, Sort.by(Sort.Direction.DESC, "bno")))
        return boardDtoList
    }

    //제목으로 게시물 찾기
    fun searchListByTitle(TitleKeyword: String, page: Int):Page<BoardDto>{
        val boardDtoList:Page<BoardDto> = boardDtoRepository.findByTitleContaining(TitleKeyword,PageRequest.of(page, 10,Sort.by(Sort.Direction.DESC, "bno")))
        return boardDtoList
    }

    //작성자로 게시물 찾기
    fun searchListByWriter(Writerkeyword: String, page: Int):Page<BoardDto>{
        val boardDtoList:Page<BoardDto> = boardDtoRepository.findByWriterContaining(Writerkeyword, PageRequest.of(page, 10 , Sort.by(Sort.Direction.DESC, "bno")))
        return boardDtoList
    }

    //게시물 읽기
    fun read(bno:Int):BoardDto {
        val boardDto:BoardDto = boardDtoRepository.getBoardDtoByBno(bno)
        return boardDto
    }

    //게시물 쓰기
    @Transactional
    fun write(boardDto: BoardDto){
        boardDtoRepository.save(boardDto)
    }

    //게시물 수정하기
    fun modify(boardDto: BoardDto){
        boardDtoRepository.save(boardDto)
    }

    //게시물 삭제하기
    @Transactional
    fun remove(bno: Int, writer:String){
        boardDtoRepository.deleteByBnoAndWriter(bno,writer)
    }
}