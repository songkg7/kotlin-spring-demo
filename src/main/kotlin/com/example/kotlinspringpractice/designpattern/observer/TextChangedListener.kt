package com.example.kotlinspringpractice.designpattern.observer

interface TextChangedListener {

    fun onTextChanged(oldText: String, nextText: String)

}