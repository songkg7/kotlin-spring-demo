package com.example.kotlinspringpractice.basic

class Dog : Animal() {

    override fun bark() {
        println("멍멍")
    }

    override fun running() {
        println("dog's running!")
    }
}