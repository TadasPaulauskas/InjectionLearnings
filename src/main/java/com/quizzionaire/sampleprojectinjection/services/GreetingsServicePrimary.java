package com.quizzionaire.sampleprojectinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingsServicePrimary implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from the Primary Bean";
    }
}
