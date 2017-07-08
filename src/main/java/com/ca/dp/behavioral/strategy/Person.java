package com.ca.dp.behavioral.strategy;

/**
 * Created by yanya04 on 6/19/2017.
 */
public class Person {

    private int age;
    private String name;
    private String phoneNumber;

    public Person() {
    }

    public Person(String name, String phoneNumber, int age) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
