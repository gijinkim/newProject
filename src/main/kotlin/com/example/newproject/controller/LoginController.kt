package com.example.newproject.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import java.io.UnsupportedEncodingException
import java.net.URLEncoder
import javax.servlet.http.Cookie
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpSession

//로그인 구현

@Controller
@RequestMapping("/login")
class LoginController{

    //로그아웃 및 세션 종료
    @GetMapping("/logout")
    fun logout(session:HttpSession):String{

        session.invalidate()

        return "redirect:/"
    }

    //로그인 화면 보여주기
    @GetMapping("/login")
    fun loginForm():String{
        return "loginForm"
    }

    //로그인 정보 확인 및 세션 생성과 아이디 기억 쿠키 생성
    @PostMapping("/login")
    fun login(id:String, pwd: String, remenberId: Boolean,
                request : HttpServletRequest , response : HttpServletResponse):String{

        //로그인 정보 확인
        if (!loginCheck(id,pwd)){
            var msg  = ""

            try {
                msg = URLEncoder.encode("id와 pwd가 일치하지 않습니다.", "utf-8")
            }catch (e:UnsupportedEncodingException){}
            return "redirect:/login/login?msg=$msg"
        }

        //세션 생성
        val session = request.session
        session.setAttribute("id", id)

        //아이디 기억 쿠키 생성
        if (remenberId){
            val cookie : Cookie = Cookie("id", id)
            response.addCookie(cookie)
        }else{
            val cookie = Cookie("id", id)
            cookie.maxAge = 0
            response.addCookie(cookie)
        }

        return "redirect:/"
    }

}

//로그인 회원정보 확인
fun loginCheck(id:String, pwd:String):Boolean{
    return true
}