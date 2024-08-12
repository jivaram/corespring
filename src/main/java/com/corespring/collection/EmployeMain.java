package com.corespring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeMain {

    public static void main(String[] args){
       ApplicationContext context1 = new ClassPathXmlApplicationContext("collectionconfig.xml");

       Emp emp1 = (Emp) context1.getBean("Emp1");
       System.out.println("name=" +emp1.getName());
        System.out.println("phones=" +emp1.getPhones());
        System.out.println("courses=" +emp1.getCourses());
        System.out.println("addresses=" +emp1.getAddresses());
    }
}
