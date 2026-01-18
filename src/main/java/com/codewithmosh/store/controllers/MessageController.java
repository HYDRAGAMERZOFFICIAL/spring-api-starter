package com.codewithmosh.store.controllers;

import com.codewithmosh.store.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    // @RequestMapping("/hello")
    // public String sayHello() {
    // return "Hello World";
    // }

    @RequestMapping("/hello")
    public Message sayhello() {
        return new Message("Welcome ");
    }
}
