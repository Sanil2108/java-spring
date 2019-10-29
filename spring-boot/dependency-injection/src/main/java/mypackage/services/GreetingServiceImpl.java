package mypackage.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public String sayGreeting() {
        return "Hello, world";
    }

}