package com.serkankilicdere.oop.kolay;

class Personel {

    /*
    6.	Bir this anahtar kelimesini kullanarak bir sınıf içindeki özelliğe erişimi gösterin.
     */
    private String name; // Sınıf özelliği
    private int age;


    public Personel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void goster() {
        System.out.println("İsim: " + this.name); // this ile erisim
        System.out.println("Yaş: " + this.age);
    }
}

public class Soru6 {
    public static void main(String[] args) {
        Personel personel = new Personel("Ahmet", 25);

        personel.goster();
    }
}

