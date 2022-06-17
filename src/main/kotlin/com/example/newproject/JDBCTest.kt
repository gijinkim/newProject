package com.example.newproject

import java.sql.*


object JDBCTest {

    val conn: Connection ?= null
    val st: Statement ?= null
    val rs: ResultSet ?= null

    @JvmStatic
    fun main(args: Array<String>){
        val url :String = "jdbc:postgresql://localhost:5432/postgres"
        val user:String = "postgres"
        val password:String = "12345678"

        try {
            val conn = DriverManager.getConnection(url,user,password)
            val st = conn.createStatement()
            val rs = st.executeQuery("SELECT VERSION()")

            if (rs.next())
                println(rs.getString(1))
        }catch (sqlEX:SQLException){
            println(sqlEX)
        }finally {
            try {
                rs?.close()
                st?.close()
                conn?.close()
            }catch (sqlEx:SQLException){
                println(sqlEx)
            }
        }
    }
}





