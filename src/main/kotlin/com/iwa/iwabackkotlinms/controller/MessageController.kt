package com.iwa.iwabackkotlinms.controller

import com.iwa.iwabackkotlinms.model.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/messages")
class MessageController {
    // Create the message object then return it
    @GetMapping
    fun index(): Message {
        var messageBody: String = "Bienvenue sur notre application de recrutement"
        return Message("1", messageBody)
    }
}