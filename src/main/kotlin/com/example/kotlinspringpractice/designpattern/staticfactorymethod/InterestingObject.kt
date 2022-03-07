package com.example.kotlinspringpractice.designpattern.staticfactorymethod

class InterestingObject private constructor() {

    object Factory : Printer() {
        @JvmStatic
        fun create() = InterestingObject()

        override fun getName(): String {
            return "Interesting Object"
        }
    }

    companion object CompanionFactory : Printer() {
        private val secret = "No one can know this"
        val publicInfo = "**** ****"

        fun create() = InterestingObject()

        @JvmStatic
        override fun getName(): String {
            return "Interesting Object from Companion"
        }
    }

    fun getSecret() = secret
}
