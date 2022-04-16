package com.example.kotlinspringpractice

import io.mockk.every
import io.mockk.mockkStatic
import io.mockk.unmockkStatic
import io.mockk.verify
import org.junit.jupiter.api.Test
import org.springframework.boot.SpringApplication

internal class MyApplicationTest {

    @Test
    fun mainShouldStartMyApplication() {
        mockkStatic(SpringApplication::class)

        every {
            SpringApplication.run(any())
        } returns null

        main(arrayOf())

        verify {
            SpringApplication.run(KotlinSpringPracticeApplication::class.java)
        }
        unmockkStatic(SpringApplication::class)
    }
}