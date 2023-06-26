package com.chondosha.JavaRestServer;

import org.springframework.web.bind.annotation.*;

@RestController
public class MessageRestController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
