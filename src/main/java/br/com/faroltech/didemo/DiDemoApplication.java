package br.com.faroltech.didemo;

import br.com.faroltech.didemo.controllers.ConstructorInjectedController;
import br.com.faroltech.didemo.controllers.MyController;
import br.com.faroltech.didemo.controllers.PropertyInjectedController;
import br.com.faroltech.didemo.controllers.SetterInjectedController;
import br.com.faroltech.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());
    }
}
