package com.example.greeting.controllers;

import com.example.greeting.models.Greeting;
import com.example.greeting.models.Reply;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/greetings")
public class GreetingController {

    @GetMapping(value = "/greetings")
        public String greeting(@RequestParam(value = "name") String name){
            return "Good afternoon " + name;
        }

}




