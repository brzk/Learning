package com.brzk.sfgdi.controllers;

import com.brzk.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController constructorInjectionController;

    @BeforeEach
    void setUp() {
        constructorInjectionController = new ConstructorInjectionController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting(){
        System.out.println(constructorInjectionController.getGreeting());
    }
}