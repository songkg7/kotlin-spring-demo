package com.example.kotlinspringpractice.basic

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CarTest {

    @Test
    internal fun basicCar() {
        val car = Car()
        val expect = car.hasSunRoof()
        val numberOfTires = car.getNumberOfTires()

        assertThat(expect).isFalse
        assertThat(numberOfTires).isEqualTo(4)
    }

    @Test
    internal fun benzCar() {
        val benz = Benz()
        val expect = benz.hasSunRoof()
        val numberOfTires = benz.getNumberOfTires()

        assertThat(expect).isTrue
        assertThat(numberOfTires).isEqualTo(4)
    }
}