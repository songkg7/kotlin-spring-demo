package com.example.kotlinspringpractice.designpattern.staticfactorymethod

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StaticFactoryMethodTest {

    @Test
    internal fun test_1() {

        val obj0 = InterestingObject.create() // method from companionFactory so from the companion object
        val obj1 = InterestingObject.Factory.create()
        val obj2 = InterestingObject.CompanionFactory.create() // unnecessary companion object name

        val secret = InterestingObject.create().getSecret() // get secret from the instance method
        val publicInfo = InterestingObject.publicInfo // this field accessible from companion object

        // calling abstract class methods
        val print1 = InterestingObject.print()
        val print2 = InterestingObject.Factory.print()
        val print3 = InterestingObject.CompanionFactory.print()

    }
}