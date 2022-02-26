package com.example.kotlinspringpractice.mvc.repository

import com.example.kotlinspringpractice.mvc.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
interface UserRepository: JpaRepository<User, Long>