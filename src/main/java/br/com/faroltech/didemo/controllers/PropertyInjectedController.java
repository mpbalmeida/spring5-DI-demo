package br.com.faroltech.didemo.controllers;

import br.com.faroltech.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
