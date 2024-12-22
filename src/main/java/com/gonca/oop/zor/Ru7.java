package com.gonca.oop.zor;

public class Ru7 {

    //Bir sınıfta method chaining kullanarak ardışık metot çağrımlarını mümkün kılan bir yapı oluşturun.
    private String model;
    private String color;
    private int year;

    // Setters that return the current object (this) for method chaining
    public Ru7 setModel(String model) {
        this.model = model;
        return this;
    }

    public Ru7 setColor(String color) {
        this.color = color;
        return this;
    }

    public Ru7 setYear(int year) {
        this.year = year;
        return this;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Method chaining example
        Ru7 car = new Ru7();
        car.setModel("Toyota Corolla")
                .setColor("Red")
                .setYear(2020)
                .displayDetails(); // All methods are called in a chain
    }
}
