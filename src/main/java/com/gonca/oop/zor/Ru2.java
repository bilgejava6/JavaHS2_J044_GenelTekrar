package com.gonca.oop.zor;

public class Ru2 {
    //Bir sınıfta immutable bir yapı oluşturun. Tüm özellikler private final olsun ve bir constructor ile ilk değerleri atayın.
    private final String name;
    private final int age;

    // Constructor
    public Ru2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Main Method to Test
    public static void main(String[] args) {
        Ru2 person = new Ru2("Alice", 25);

        System.out.println("Name: " + person.getName()); // Alice
        System.out.println("Age: " + person.getAge());   // 25

        // Aşağıdaki işlemler derleme hatası verecektir:
        // person.name = "Bob"; // Hata: Özellik final ve private
        // person.age = 30;     // Hata: Özellik final ve private
    }
}
