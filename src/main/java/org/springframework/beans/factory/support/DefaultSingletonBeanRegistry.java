package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengfei.zhao
 * @date 2021/5/18 16:29
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> beanDefinitionMap = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return beanDefinitionMap.get(beanName);
    }

    public void addSingleton(String beanName, Object singletonObj) {
        beanDefinitionMap.put(beanName, singletonObj);
    }
}
