package org.springframework.beans.factory.config;

/**
 * @author pengfei.zhao
 * @date 2021/5/18 15:50
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
