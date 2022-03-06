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

    @Test
    internal fun stream_map() {
        val strings = listOf("madden", "progress", "hat", "rank", "marry")

        val strings1 = strings.filter { it.startsWith("m") }
            .map { it.uppercase() }

        assertThat(strings1).hasSize(2)
        assertThat(strings1).element(0).isEqualTo("MADDEN")
        assertThat(strings1).element(1).isEqualTo("MARRY")
    }

    @Test
    internal fun stream_set() {
        val ints = listOf(1, 1, 2, 3, 4, 5)
        val intSet = ints.toSet()

        println("intSet = $intSet")
        assertThat(intSet).hasSize(5)
    }
}