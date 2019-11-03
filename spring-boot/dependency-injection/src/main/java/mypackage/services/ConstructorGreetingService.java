package mypackage.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{

    public String sayGreeting() {
        return "Hello, world from constructor";
    }

}