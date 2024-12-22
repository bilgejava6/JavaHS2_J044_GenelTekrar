package com.onur.oop.zor.alti;


public class Person {
    private String name;
    private int age;
    private String address;

    // Constructor with no parameters
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }

    // Constructor with name parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.address = "Unknown";
    }

    // Constructor with name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Unknown";
    }

    // Constructor with name, age, and address parameters
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }
}
