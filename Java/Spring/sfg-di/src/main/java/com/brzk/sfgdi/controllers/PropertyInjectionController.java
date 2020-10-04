package com.brzk.sfgdi.controllers;

import com.brzk.sfgdi.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
