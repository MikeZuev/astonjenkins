package ru.mike.astonjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerHello {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World and People";
    }

    @GetMapping("/helloall")
    public String helloAll() {
        return "Hello everyone!!! ";
    }
}

