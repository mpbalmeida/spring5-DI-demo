package br.com.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello message - Original";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
