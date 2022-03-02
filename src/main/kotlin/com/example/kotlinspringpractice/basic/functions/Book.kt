package com.example.kotlinspringpractice.basic.functions

class Book(author: Person) {
    val author = author.also {
        requireNotNull(it.age)
        println(it.name)
    }
}