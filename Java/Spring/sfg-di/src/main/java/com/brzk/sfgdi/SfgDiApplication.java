package com.brzk.sfgdi;

import com.brzk.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

        I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
        System.out.println(i18nController.SayHello());
        
        System.out.println("----- Primary Bean");
        MyController myController = (MyController) applicationContext.getBean("myController");

        System.out.println(myController.SayHello());

        System.out.println("----- Property");
        PropertyInjectionController propertyInjectionController = (PropertyInjectionController)applicationContext.getBean("propertyInjectionController");

        System.out.println(propertyInjectionController.getGreeting());

        System.out.println("----- Setter");
        SetterInjectionController setterInjectionController = (SetterInjectionController)applicationContext.getBean("setterInjectionController");

        System.out.println(setterInjectionController.getGreeting());

        System.out.println("----- Constructor");
        ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController)applicationContext.getBean("constructorInjectionController");

        System.out.println(constructorInjectionController.getGreeting());
    }
}
