package mypackage.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService{

    public String sayGreeting() {
        return "Hello, world from getter";
    }

}