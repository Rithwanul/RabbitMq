package com.example.rabbitmq.rabbitmq.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class PersonController {

    @GetMapping("/person")
    fun getPerson() : String {
        return "Dico";
    }

}