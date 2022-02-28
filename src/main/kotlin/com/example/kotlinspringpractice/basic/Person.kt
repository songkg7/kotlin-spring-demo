package com.example.kotlinspringpractice.basic

class Person(var name: String, val age: Int) {

    // init 은 생성자 실행시 같이 실행된다. init 은 여러개 둘 수 있다.
    init {
        println("${this.name}, ${this.age}")
    }

    // 보조 생성자, constructor
    constructor(name: String): this(name, 27)

    fun introduce() {
        println("name is $name, birthDay is $age")
    }

}