package br.com.faroltech.didemo.services;

public class PrimaryPortugueseGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryPortugueseGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getPortugueseGreeting();
    }
}
