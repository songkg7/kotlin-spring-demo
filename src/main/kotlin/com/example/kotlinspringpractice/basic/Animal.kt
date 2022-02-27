package com.example.kotlinspringpractice.basic

abstract class Animal {

    // 추상 메서드는 반드시 override 해야 함
    abstract fun bark()

    // override 허용
    open fun running() {
        println("animal running!")
    }
}