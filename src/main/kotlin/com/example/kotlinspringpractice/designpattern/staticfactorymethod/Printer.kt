package com.example.kotlinspringpractice.designpattern.staticfactorymethod

abstract class Printer {

    abstract fun getName(): String

    fun print() {
        val name = getName()
        println(name)
    }
}