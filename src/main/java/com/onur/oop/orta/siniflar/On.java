package com.onur.oop.orta.siniflar;

public class On {
    private String outerField = "Outer field";

    public void outerMethod() {
        System.out.println("Outer method");
    }

    // Nested class
    public class InnerClass {
        private String innerField = "Inner field";

        public void innerMethod() {
            System.out.println("Inner method");
            // Accessing outer class members
            System.out.println("Accessing: " + outerField);
            outerMethod();
        }
    }
}