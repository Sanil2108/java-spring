package mypackage.services;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
// @Profile("default")
public class PrimaryGreetingService implements GreetingService{

    public String sayGreeting() {
        return "Hello, world, From primary GS";
    }

    @PostConstruct
    public void postConstructing() {
        System.out.println("Post constructing something");
    }

}