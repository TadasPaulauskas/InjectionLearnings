package com.quizzionaire.sampleprojectinjection.controllers;

import com.quizzionaire.sampleprojectinjection.services.GreetingService;
import com.quizzionaire.sampleprojectinjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I am the controller");
        return greetingService.sayGreeting();
    }
}
