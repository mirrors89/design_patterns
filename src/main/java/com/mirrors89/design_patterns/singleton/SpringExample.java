package com.mirrors89.design_patterns.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        String hello1 = context.getBean("hello", String.class);
        String hello2 = context.getBean("hello", String.class);

        System.out.println(hello1 == hello2);
    }
}
