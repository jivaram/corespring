package com.corespring.consInjection;

public class A {
    private String name;
    private int age;

    public A(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.age ;
    }
}
