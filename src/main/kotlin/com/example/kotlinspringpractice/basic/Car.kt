package com.example.kotlinspringpractice.basic

open class Car {

    // kotlin 의 기본 메서드는 하위 클래스에서 override 가 불가능하다.
    fun getNumberOfTires(): Int {
        return 4
    }

    // open 해야 override 가능
    open fun hasSunRoof(): Boolean {
        return false
    }

}