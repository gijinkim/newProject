package com.example.newproject.controller

import com.example.newproject.domain.BoardDto
import com.example.newproject.service.BoardService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpSession
import kotlin.math.min


@Controller
@RequestMapping("/board")
class BoardController {


    @Autowired
    lateinit var boardService: BoardService


    //게시글 삭제하기
    @PostMapping("/remove")
    fun remove(bno: Int, m:Model, session: HttpSession):String{
        val writer:String = session.getAttribute("id") as String
        boardService.remove(bno, writer)

        return "redirect:/board/list"
    }

    //게시글 수정하기
    @PostMapping("/modify")
    fun modify(boardDto: BoardDto,m: Model,session: HttpSession):String{
        boardDto.writer = session.getAttribute("id") as String

        boardService.modify(boardDto)

        return "redirect:/board/list"
    }

    //게시글 쓰기화면 보여주기
    @GetMapping("/write")
    fun write(boardDto: BoardDto, m: Model): String {
        m.addAttribute("mode", "new")
        m.addAttribute("boardDto", boardDto)

        println(boardDto)

        return "board"
    }


    //게시글 쓰기
    @PostMapping("/write")
    fun write(boardDto: BoardDto, m: Model, session: HttpSession): String {
        boardDto.writer = session.getAttribute("id") as String
        boardService.write(boardDto)

        return "redirect:/board/list"
    }

    //게시글 읽기
    @GetMapping("/read")
    fun read(bno: Int?, m: Model?): String {

        var Boardbno = 0

        if (bno != null) {
            Boardbno = bno
        }

        val boardDto: BoardDto = boardService.read(Boardbno)
        m?.addAttribute(boardDto)

        return "board"
    }

//    class Demo(
//        val TitleKeyword: String,
//        val ContentKeyword: String,
//        val WriterKeyword: String,
//    ) {
//
//        constructor(keyword: String) : this(
//            TitleKeyword = keyword,
//            ContentKeyword = keyword,
//            WriterKeyword = keyword
//        )
//
//        companion object {
//            fun a(keyword: String): Demo {
//                return Demo(
//                    TitleKeyword = keyword,
//                    ContentKeyword = keyword,
//                    WriterKeyword = keyword
//                )
//            }
//        }
//    }


    //게시물 가져오기
    @GetMapping("/list")
    fun list(
        option: String?,
        keyword: String?,
        m: Model?,
        @RequestParam(required = false, defaultValue = "0", value = "page") page: Int,
        session: HttpSession
    ): String {

        if (!loginCheck(session)){
            return "redirect:/login/login"
        }

        //검색어 기능
        var TitleKeyword = ""
        var ContentKeyword = ""
        var WriterKeyword = ""

        if (keyword != null) {
            TitleKeyword = keyword
            ContentKeyword = keyword
            WriterKeyword = keyword
        }

        val listPage = when (option) {
            //제목과 내용으로 게시물검색id
            "A" -> {
                boardService.searchListByTitleAndContent(TitleKeyword, ContentKeyword, page)
            }
            //제목으로 게시물 검색
            "T" -> {
                boardService.searchListByTitle(TitleKeyword, page)
            }
            //작성자로 게시물검색
            "W" -> {
                boardService.searchListByWriter(WriterKeyword, page)
            }
            //전체 게시물 가져오기
            else -> {
                boardService.boardList(page)
            }
        }

        //게시물 페이징 처리
        val totalCnt: Int = 30
        val beginPage: Int = (listPage.number - 1) / 10 * 10 + 1
        val endPage: Int = min(beginPage + 9, listPage.totalPages)
        val showPrev: Boolean = beginPage != 1
        val showNext: Boolean = endPage != listPage.totalPages

        m?.addAttribute("list", listPage?.toList())
        m?.addAttribute("totalCnt", totalCnt)
        m?.addAttribute("beginPage", beginPage)
        m?.addAttribute("endPage", endPage)
        m?.addAttribute("showPrev", showPrev)
        m?.addAttribute("showNext", showNext)


        return "boardList"
    }
}

fun loginCheck(session: HttpSession):Boolean{

    if (session.getAttribute("id") != null)
        return true

    return false
}