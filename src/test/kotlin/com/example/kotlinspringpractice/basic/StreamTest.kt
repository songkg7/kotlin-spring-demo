package com.example.kotlinspringpractice.basic

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class StreamTest {

    @Test
    internal fun filter() {
        val list = listOf("sort", "pool", "firm", "correct", "cow")

        val filter = list.filter { it.startsWith("c") }

        println("filter = $filter")

        assertThat(filter).hasSize(2)
    }
}