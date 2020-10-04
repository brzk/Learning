package com.brzk.sfgdi.controllers;

import com.brzk.sfgdi.services.GreetingService;

public class ConstructorInjectionController {

    GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
