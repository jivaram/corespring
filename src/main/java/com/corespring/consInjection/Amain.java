package com.corespring.consInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Amain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constrcutConfig.xml");
        A a = (A) context.getBean("a");
        System.out.println(a);
    }
}
