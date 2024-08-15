package com.corespring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChaiLover {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        context.registerShutdownHook();
        Chai chai = (Chai) context.getBean("chai");
        System.out.println(chai);
        Samosa samosa = (Samosa) context.getBean("samosa");
        System.out.println(samosa);
        Jalebi jalebi = (Jalebi) context.getBean("jalebi");
        System.out.println(jalebi);

    }
}
