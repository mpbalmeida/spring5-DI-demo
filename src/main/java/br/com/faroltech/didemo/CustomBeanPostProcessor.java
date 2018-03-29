package br.com.faroltech.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof LifeCycleDemoBean) {
            ((LifeCycleDemoBean) bean).beforInit();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof  LifeCycleDemoBean) {
            ((LifeCycleDemoBean) bean).afterInit();
        }

        return bean;
    }
}
