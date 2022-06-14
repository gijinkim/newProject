package com.example.newproject.controller


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.propertyeditors.CustomDateEditor
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.WebDataBinder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.InitBinder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import java.text.SimpleDateFormat

//회원가입 구현
@Controller
@RequestMapping("/register")
class RegisterController {

    //회원가입 정보가 맞는 형태로 들어오는지 점검
    fun toDate(binder:WebDataBinder){
        val df  = SimpleDateFormat("yyyy-MM-dd")
    }

    //회원가입 페이지 보여주기
    @GetMapping("/add")
    fun register():String{
        return "registerForm"
    }

    //회원가입 진행 및 맞는 형태로 입력되는지 확인
    @PostMapping("/add")
    @Throws(Exception::class)
    fun save(result : BindingResult , m:Model):String{

        if (!result.hasErrors()){

            return "registerInfo"
        }

        return "registerForm"
    }
}
