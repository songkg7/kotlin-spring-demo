package com.example.kotlinspringpractice.designpattern.strategy

import java.util.*

class Printer(private val stringFormatterStrategy: (String) -> String) {

    fun printString(string: String) {
        println(stringFormatterStrategy(string))
    }

}

val lowerCaseFormatter: (String) -> String = { it.lowercase(Locale.getDefault()) }
val upperCaseFormatter = { it: String -> it.uppercase(Locale.getDefault()) }
