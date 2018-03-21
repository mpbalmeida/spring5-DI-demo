package br.com.faroltech.didemo.controllers;

import br.com.faroltech.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl; //If i use the implementation i won't need the @Qualifier annotation

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }

}
