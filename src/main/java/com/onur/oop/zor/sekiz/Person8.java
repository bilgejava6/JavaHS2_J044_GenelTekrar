package com.onur.oop.zor.sekiz;

public class Person8 {
    private String name;
    private int age;
    private String address;

    public Person8 setName(String name) {
        this.name = name;
        return this;
    }

    public Person8 setAge(int age) {
        this.age = age;
        return this;
    }

    public Person8 setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }
}