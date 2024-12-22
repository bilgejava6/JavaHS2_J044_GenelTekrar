package com.onur.oop.orta.siniflar.yedi;

public class MultipleInterfacesClass implements InterfaceOne, InterfaceTwo {
    @Override
    public void methodOne() {
        System.out.println("Method One implementation.");
    }

    @Override
    public void methodTwo() {
        System.out.println("Method Two implementation.");
    }
}