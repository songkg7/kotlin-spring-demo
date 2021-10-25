package com.example.kotlinspringpractice.repository

import com.example.kotlinspringpractice.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
interface UserRepository: JpaRepository<User, Long>