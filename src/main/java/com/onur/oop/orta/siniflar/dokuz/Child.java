package com.onur.oop.orta.siniflar.dokuz;

public class Child extends Parent {
    public void accessProtectedField() {
        System.out.println("Accessing protected field from Child class: " + protectedField);
    }

    @Override
    protected void showProtectedField() {
        super.showProtectedField();
    }
}
