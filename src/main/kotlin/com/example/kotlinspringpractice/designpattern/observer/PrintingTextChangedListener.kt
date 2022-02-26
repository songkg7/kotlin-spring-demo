package com.example.kotlinspringpractice.designpattern.observer

class PrintingTextChangedListener : TextChangedListener {

    private var text = ""

    override fun onTextChanged(oldText: String, nextText: String) {
        text = "Text is changed: $oldText -> $nextText"
    }

}