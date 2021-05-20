package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author pengfei.zhao
 * @date 2021/5/18 14:13
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
