package com.corespring.cref;

public class Employee {
    private String eName;
    private SomeCompany sCompany;

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public SomeCompany getsCompany() {
        return sCompany;
    }

    public void setsCompany(SomeCompany sCompany) {
        this.sCompany = sCompany;
    }

    public Employee(SomeCompany sCompany, String eName) {
        this.sCompany = sCompany;
        this.eName = eName;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eName='" + eName + '\'' +
                ", sCompany=" + sCompany +
                '}';
    }
}
