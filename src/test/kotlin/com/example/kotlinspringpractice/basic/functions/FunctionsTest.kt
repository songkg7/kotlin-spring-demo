package com.example.kotlinspringpractice.basic.functions

import com.example.kotlinspringpractice.basic.functions.Person.Companion.getPerson
import org.junit.jupiter.api.Test

internal class FunctionsTest {

    @Test
    internal fun with() {
        val person: Person = getPerson()
        println(person.name)
        println(person.age)

        // 위와 동일하다.
        with(person) {
            println(name)
            println(age)
        }
    }

    @Test
    internal fun with_vs_also() {
        // also 는 코드 블록 내에 전달된 수신 객체를 그대로 다시 반환한다.
        val person: Person = getPerson().also {
            println(it.name)
            println(it.age)
        }
    }

    @Test
    internal fun apply() {
        // code convention : apply 블록에서는 오직 프로퍼티만 사용한다.
        val peter = Person().apply {
            name = "peter"
            age = 18
        }
    }

    @Test
    internal fun no_apply() {
        val clark = Person()
        clark.name = "Clark"
        clark.age = 18
    }
}