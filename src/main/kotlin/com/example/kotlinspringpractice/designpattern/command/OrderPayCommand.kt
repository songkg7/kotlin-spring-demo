package com.example.kotlinspringpractice.designpattern.command

class OrderPayCommand(val id: Long) : OrderCommand {

    override fun execute() = println("Paying for order with id: $id")

}