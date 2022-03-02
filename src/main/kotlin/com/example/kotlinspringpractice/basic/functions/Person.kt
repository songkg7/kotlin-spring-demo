package com.example.kotlinspringpractice.basic.functions


class Person() {

    var name: String? = null
    var age: Int? = null

    companion object {
        fun getPerson(): Person = Person().apply {
            name = "song"
            age = 27
        }
    }

}
