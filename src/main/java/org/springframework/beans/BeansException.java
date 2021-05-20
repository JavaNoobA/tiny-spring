package org.springframework.beans;

/**
 * @author pengfei.zhao
 * @date 2021/5/18 14:11
 */
public class BeansException extends RuntimeException{

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
