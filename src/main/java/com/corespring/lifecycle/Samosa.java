package com.corespring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

import javax.security.auth.Destroyable;

public class Samosa implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Seted somosa price..");
        this.price = price;
    }

    public Samosa() {
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this is init..");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("this is destroy..");
    }
}
