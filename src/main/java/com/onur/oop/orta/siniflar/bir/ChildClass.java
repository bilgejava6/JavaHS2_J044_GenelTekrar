package com.onur.oop.orta.siniflar.bir;

public class ChildClass extends ParentClass {

    public ChildClass(String message) {
        super(message);
    }

    public void printMessage() {
        System.out.println(getMessage());
    }
}