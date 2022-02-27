package com.example.kotlinspringpractice.basic

// open 클래스는 상속이 가능하다
class Benz : Car() {

    override fun hasSunRoof(): Boolean {
        return true
    }

}