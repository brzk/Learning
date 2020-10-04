package com.brzk.sfgdi.controllers;

import com.brzk.sfgdi.services.GreetingService;

public class SetterInjectionController {

    GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
