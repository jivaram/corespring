package com.corespring.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Jalebi {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Set jalebi price");
        this.price = price;
    }

    public Jalebi() {
        super();
    }

    @Override
    public String toString() {
        return "Jalebi price:" + this.price;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("this is annotation init..");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("this is anotation destroy..");
    }
}
