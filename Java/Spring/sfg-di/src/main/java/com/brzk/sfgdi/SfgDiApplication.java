package com.brzk.sfgdi;

import com.brzk.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) applicationContext.getBean("myController");

        String greeting = myController.SayHello();

        System.out.println(greeting);
    }
}
