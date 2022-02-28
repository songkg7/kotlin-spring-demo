package com.example.kotlinspringpractice.basic

import org.junit.jupiter.api.Test

internal class PersonTest {

    @Test
    internal fun basic() {
        val person = Person("Song", 29)
        person.introduce()

        println("${person.name} ${person.age}")
    }

    @Test
    internal fun constructor_test() {
        val person = Person("song")
        person.introduce()
    }
}