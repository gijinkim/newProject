package com.example.newproject.domain

import java.util.Date

data class UserDto(var id:String?=null,var pwd:String ?= null, var name:String ?=null, var email:String ?= null,
                    var birth:Date ?= null, var sns:String ?= null, var reg_date:Date ?= null){

//    private var id: String? = null
//    private var pwd: String? = null
//    private var name: String? = null
//    private var email: String? = null
//    private var birth: Date? = null
//    private var sns: String? = null
//    private var reg_date: Date? = null
//
//
//    override fun hashCode(): Int {
//        return Objects.hash(birth, email, id, name, pwd, sns)
//    }
//
//    override fun equals(obj: Any?): Boolean {
//        if (this === obj) return true
//        if (obj == null) return false
//        if (javaClass != obj.javaClass) return false
//        val other = obj as UserDto
//        return Objects.equals(birth, other.birth) && Objects.equals(
//            email,
//            other.email
//        ) && id == other.id && Objects.equals(name, other.name) && Objects.equals(pwd, other.pwd) && Objects.equals(
//            sns,
//            other.sns
//        )
//    }
//
//    override fun toString(): String? {
//        return ("User [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", birth=" + birth + ", sns="
//                + sns + ", reg_date=" + reg_date + "]")
//    }
//
//    fun UserDto() {}
//    fun UserDto(id: String, pwd: String, name: String, email: String, birth: Date, sns: String, reg_date: Date) {
//        super()
//        this.id = id
//        this.pwd = pwd
//        this.name = name
//        this.email = email
//        this.birth = birth
//        this.sns = sns
//        this.reg_date = reg_date
//    }
//
//    fun getId(): String? {
//        return id
//    }
//
//    fun setId(id: String) {
//        this.id = id
//    }
//
//    fun getPwd(): String? {
//        return pwd
//    }
//
//    fun setPwd(pwd: String) {
//        this.pwd = pwd
//    }
//
//    fun getName(): String? {
//        return name
//    }
//
//    fun setName(name: String) {
//        this.name = name
//    }
//
//    fun getEmail(): String? {
//        return email
//    }
//
//    fun setEmail(email: String) {
//        this.email = email
//    }
//
//    fun getBirth(): Date? {
//        return birth
//    }
//
//    fun setBirth(birth: Date) {
//        this.birth = birth
//    }
//
//    fun getSns(): String? {
//        return sns
//    }
//
//    fun setSns(sns: String) {
//        this.sns = sns
//    }
//
//    fun getReg_date(): Date? {
//        return reg_date
//    }
//
//    fun setReg_date(reg_date: Date) {
//        this.reg_date = reg_date
//    }
}