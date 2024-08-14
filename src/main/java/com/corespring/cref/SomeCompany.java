package com.corespring.cref;

public class SomeCompany {
    private int eSalary;

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    public SomeCompany(int eSalary) {
        this.eSalary = eSalary;
    }

    public SomeCompany() {
        super();
    }

    @Override
    public String toString() {
        return "SomeCompany{" +
                "eSalary=" + eSalary +
                '}';
    }
}
