package com.yohendrakumar.callectionslistexp.Models;

public class Person {
    private String name,city,mobile,email;
    private int salary;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public Person(String name, String city, String mobile, String email, int salary) {
        this.name = name;
        this.city = city;
        this.mobile = mobile;
        this.email = email;
        this.salary = salary;
    }
}
