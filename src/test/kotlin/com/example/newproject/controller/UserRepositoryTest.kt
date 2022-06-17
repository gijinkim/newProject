package com.example.newproject.controller

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
class UserRepositoryTest(
) {
    @Autowired
    lateinit var userRepository: UserRepository


    @Test
    fun save() {
        userRepository.deleteAll()
        val userDto = UserDto()
        userDto.id = "kim"
        userDto.pwd = "1234"
        userRepository.save(userDto)
        println(userRepository.findById("kim").get())
    }
}

