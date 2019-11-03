package mypackage.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishSpeakingGreetingService implements GreetingService{

    public String sayGreeting() {
        return "Hello, world, From primary Spanish speaking service .Hola!";
    }

}