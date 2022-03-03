package com.example.kotlinspringpractice.enums

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GarbageTypeTest {

    @Test
    internal fun main() {
        println(GarbageType.IRON.name)
        println(GarbageType.PLASTIC.ordinal)
        println(GarbageType.IRON.ordinal)

        // iterable
        val array = enumValues<GarbageType>()
        array
            .filter { it.koName == "플라스틱" }
            .map { it.koName }

        val type = enumValueOf<GarbageType>("PLASTIC")
    }

    @Test
    internal fun main2() {
        val pair = 20 to GarbageType.PLASTIC

        val totalPrice = sell(pair)

        println("총 가격은 $totalPrice 입니다.")
    }

    private fun sell(pair: Pair<Int, GarbageType>): Int {
        val (weight, type) = pair

        val price = type.calculate(weight)

        return weight * price
    }
}