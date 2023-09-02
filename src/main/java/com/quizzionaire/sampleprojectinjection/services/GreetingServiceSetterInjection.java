package com.quizzionaire.sampleprojectinjection.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Setter injunction testing for method or property";
    }
}
