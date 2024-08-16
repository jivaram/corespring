package com.corespring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PersonInformation {

    @Autowired
    @Qualifier("personInfo")
    private Person personInfo;

    public Person getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(Person personInfo) {
        this.personInfo = personInfo;
    }

    public PersonInformation(Person personInfo) {
        this.personInfo = personInfo;
    }

    public PersonInformation() {
        super();
    }

    @Override
    public String toString() {
        return "PersonInformation:" + this.personInfo;
    }
}
