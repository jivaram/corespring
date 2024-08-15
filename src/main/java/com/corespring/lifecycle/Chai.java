package com.corespring.lifecycle;

public class Chai {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chai price" + this.price;
    }

    public void init() {
        System.out.println("hey this is init: init");
    }

    public void destroy() {
        System.out.println("hey this is destroy: destroy");
    }

}
