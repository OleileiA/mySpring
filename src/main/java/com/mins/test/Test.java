package com.mins.test;

import com.mins.ClassPathXmlApplicationContext;
import com.mins.beans.BeansException;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AService aService = null;
        try {
            aService = (AService) context.getBean("aservice");
        } catch (BeansException e) {
            throw new RuntimeException(e);
        }
        aService.sayHello();
    }
}
