package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {

    public String requestMethodName(@RequestParam String param) {
        return new String();
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}
