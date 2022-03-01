package com.example.kotlinspringpractice.designpattern.command

class OrderAddCommand(val id: Long) : OrderCommand {

    override fun execute() = println("Adding order with id: $id")

}