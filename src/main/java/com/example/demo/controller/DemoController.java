package com.example.demo;

@RestController
public class DemoController {

    @GetMapping("/greeting")
    public String getGreeting(){
        return "Hello World!";
    }

}