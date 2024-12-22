package com.onur.oop.zor.uc;


public class Car {
    private String model;
    private String color;

    private Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    // Factory method
    public static Car createCar(String model, String color) {
        return new Car(model, color);
    }
}
