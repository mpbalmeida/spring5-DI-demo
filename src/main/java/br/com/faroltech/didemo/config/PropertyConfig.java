package br.com.faroltech.didemo.config;

import br.com.faroltech.didemo.examplebeans.FakeDataSource;
import br.com.faroltech.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class PropertyConfig {

    @Value("${faroltech.username}")
    String user;

    @Value("${faroltech.password}")
    String password;

    @Value("${faroltech.dburl}")
    String url;

    @Value("${faroltech.jms.username}")
    String jmsUser;

    @Value("${faroltech.jms.password}")
    String jmsPassword;

    @Value("${faroltech.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        fakeDataSource.setUser(user);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);


        return fakeJmsBroker;
    }

}
