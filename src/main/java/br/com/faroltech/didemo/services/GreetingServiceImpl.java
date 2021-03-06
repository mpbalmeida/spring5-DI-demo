package br.com.faroltech.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello message - Original";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
