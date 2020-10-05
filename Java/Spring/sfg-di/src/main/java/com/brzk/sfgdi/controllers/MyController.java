package com.brzk.sfgdi.controllers;

import com.brzk.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String SayHello(){
        return greetingService.sayGreeting();
    }
}
