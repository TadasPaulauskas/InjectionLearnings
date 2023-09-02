package com.quizzionaire.sampleprojectinjection.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingsService")
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "3'd property injection";
    }
}
