package com.corespring.cref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFrim {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("crefconfig.xml");
        Employee emp = (Employee) context.getBean("emp");
        System.out.println(emp.geteName());
        System.out.println(emp.getsCompany());
        System.out.println(emp.getsCompany().geteSalary());
    }
}
