package org.springframework.ioc.test;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author pengfei.zhao
 * @date 2021/5/20 15:08
 */
public class BeanDefinitionAndBeanDefinitionRegistryTest {
    @Test
    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("helloService", new BeanDefinition(HelloService.class));

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        System.out.println(helloService.sayHello());
    }
}
