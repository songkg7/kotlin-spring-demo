package com.example.kotlinspringpractice.designpattern.command

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CommandTest {

    @Test
    internal fun executeTest() {
        CommandProcessor()
            .add(OrderAddCommand(1L))
            .add(OrderAddCommand(2L))
            .add(OrderPayCommand(3L))
            .add(OrderPayCommand(4L))
            .processCommands()
    }
}