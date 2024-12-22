package com.onur.oop.zor.dort;

public class Singleton {

    private static Singleton instance;


    private Singleton() {
        // Initialization code here
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
