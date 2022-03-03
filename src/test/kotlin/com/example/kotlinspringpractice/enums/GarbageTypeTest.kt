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
        // 분해 할당으로 weight 는 20, type GarbageType.PLASTIC 이 할당된다.
        val (weight, type) = pair

        val price = when (type) {
            GarbageType.PLASTIC -> {
                when (weight) {
                    in 0..10 -> 100
                    in 10..29 -> 150
                    in 30..Int.MAX_VALUE -> 200
                    else -> throw IllegalArgumentException()
                }
            }
            GarbageType.GLASS -> {
                when (weight) {
                    in 0..10 -> 150
                    in 10..29 -> 250
                    in 30..Int.MAX_VALUE -> 300
                    else -> throw IllegalArgumentException()
                }
            }
            GarbageType.IRON -> {
                when (weight) {
                    in 0..10 -> 100
                    in 10..29 -> 150
                    in 30..Int.MAX_VALUE -> 200
                    else -> throw IllegalArgumentException()
                }
            }
        }
        return weight * price
    }
}