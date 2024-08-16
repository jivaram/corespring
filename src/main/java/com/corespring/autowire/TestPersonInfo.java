package com.corespring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonInfo {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireconfig.xml");
        PersonInformation personInfo = (PersonInformation) context.getBean("person1");
        System.out.println(personInfo);
    }
}
