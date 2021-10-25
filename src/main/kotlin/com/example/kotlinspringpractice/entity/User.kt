package com.example.kotlinspringpractice.entity

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(username: String, birthDate: LocalDateTime) {

    @Id
    @GeneratedValue
    var id: Long? = null

    var username: String = username
        protected set

    @Column(updatable = false)
    val birthDate: LocalDateTime = birthDate

    fun changeUsername(username: String) {
        this.username = username
    }

}