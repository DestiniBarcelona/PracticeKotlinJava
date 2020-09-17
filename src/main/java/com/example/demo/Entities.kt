package com.example.demo

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

//most significant change using Kotlin, much less boilerplate.
//No need to generate getters and setters

@Entity
data class Choices(
        @Id @GeneratedValue var id: Long? = null,
        var user: String = "",
        var character: String = "",
        var selectedAt: LocalDateTime = LocalDateTime.now()
)
