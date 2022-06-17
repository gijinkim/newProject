package com.example.newproject.controller

import com.example.newproject.domain.BoardDto
import com.example.newproject.service.BoardService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import kotlin.math.min


@Controller
@RequestMapping("/board")
class BoardController {


    @Autowired
    lateinit var boardService: BoardService

    @GetMapping("/list")
    fun list(m:Model?, @RequestParam(required = false, defaultValue = "0", value = "page") page:Int):String{

        val listPage:Page<BoardDto> = boardService.pageList(page)

        val totalCnt:Int = 30
        val beginPage:Int = (listPage.number - 1)/10*10 +1
        val endPage:Int = min(beginPage + 9, listPage.totalPages)
        val showPrev:Boolean = beginPage != 1
        val showNext:Boolean = endPage != listPage.totalPages

        m?.addAttribute("list", listPage.toList())
        m?.addAttribute("totalCnt", totalCnt)
        m?.addAttribute("beginPage", beginPage)
        m?.addAttribute("endPage", endPage)
        m?.addAttribute("showPrev", showPrev)
        m?.addAttribute("showNext", showNext)



        return "boardList"
    }
}