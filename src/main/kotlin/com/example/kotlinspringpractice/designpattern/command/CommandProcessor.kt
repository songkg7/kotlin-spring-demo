package com.example.kotlinspringpractice.designpattern.command

class CommandProcessor {

    private val queue = ArrayList<OrderCommand>()

    fun add(orderCommand: OrderCommand): CommandProcessor = apply {
        queue.add(orderCommand)
    }

    fun processCommands(): CommandProcessor = apply {
        queue.forEach { it.execute() }
        queue.clear()
    }

}