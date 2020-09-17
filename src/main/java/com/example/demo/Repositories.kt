package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


//no need for unneccessary braces and such here!
@Repository
interface ChoicesRepository: JpaRepository<Choices, Long>
