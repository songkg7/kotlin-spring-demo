package com.example.kotlinspringpractice.repository

import com.example.kotlinspringpractice.mvc.repository.UserRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class UserRepositoryTest(val userRepository: UserRepository) {
    @Test
    fun userTest() {
        val count = userRepository.count()
        assertThat(count).isEqualTo(0)
    }
}