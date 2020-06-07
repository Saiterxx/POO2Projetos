package com.example.poo2projeto1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HelloController
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "helloView";
    }

        @GetMapping("/error")
    public String hello() {
        return "error";
    }

}
