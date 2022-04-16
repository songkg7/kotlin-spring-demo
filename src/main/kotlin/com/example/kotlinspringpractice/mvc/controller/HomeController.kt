package com.example.kotlinspringpractice.mvc.controller

import com.example.kotlinspringpractice.mvc.dto.Person
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping
    fun home(): String {
        return "home"
    }

    @GetMapping("/person")
    fun person(): ResponseEntity<Any> {
        val person = Person("haril", 28, "male")
        return ResponseEntity.ok().body(person)
    }

    @PostMapping("/person")
    fun createPerson(@RequestBody person: Person): ResponseEntity<Any> {
        person.age = 100
        return ResponseEntity.ok().body(person)
    }

    @GetMapping("/lambda")
    fun lambda(): String {
        return "Hello, lambda!"
    }

}