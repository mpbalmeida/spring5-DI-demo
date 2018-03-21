package br.com.faroltech.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pt_BR")
@Primary
public class PrimaryPortugueseGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Serviço de saudação primário";
    }
}
