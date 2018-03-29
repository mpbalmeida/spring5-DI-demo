package br.com.faroltech.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the lifecycle contructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean factory has benn set.");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## My bean name is " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The lifecycle bean has been terminated.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The lifecycle bean has its properties set.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    public void beforInit() {
        System.out.println("## - Before init - Called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## - After Init - Called by Bean Post Processor");
    }
}
