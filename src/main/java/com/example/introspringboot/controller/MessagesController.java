package com.example.introspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MessagesController {
    @GetMapping(path = "/v1/messages")
    public String getMessages() {
        log.info("[dev] /v1/messages method = GET is called");
        return "Hello World";
    }

    @PostMapping(path = "/v1/messages")
    public String postMessages() {
        log.info("[dev] /v1/messages method = POST is called");
        return "Hello World";
    }

    @DeleteMapping(path = "/v1/messages")
    public String deleteMessage() {
        log.info("[dev] /v1/messages method = DELETE is called");
        return "Hello World";
    }
}
