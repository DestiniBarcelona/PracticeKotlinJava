package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class ChoiceController(val repository: ChoicesRepository) {

    @GetMapping("/")
    fun returnChoices(): List<Choices> = repository.findAll()

    @PostMapping("/api/add-choice")
    fun addNewChoice(@Valid @RequestBody choice: Choices): Choices =
            repository.save(choice)
}
