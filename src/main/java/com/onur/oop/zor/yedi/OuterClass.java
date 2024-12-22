package com.onur.oop.zor.yedi;


public class OuterClass {
    private String outerField = "Outer field";

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            System.out.println("Inside static nested class");
        }
    }

    // Non-static nested class (inner class)
    public class InnerClass {
        public void display() {
            System.out.println("Inside inner class");
            System.out.println("Accessing outer class field: " + outerField);
        }
    }
}
