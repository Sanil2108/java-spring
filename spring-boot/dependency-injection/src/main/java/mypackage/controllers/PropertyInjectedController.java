package mypackage.controllers;

import mypackage.services.*;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}