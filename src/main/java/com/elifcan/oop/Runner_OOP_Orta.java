package com.elifcan.oop;

public class Runner_OOP_Orta {
    public static void main(String[] args) {
        Soru4.call();
        Soru5 soru5 = new Soru5("Elif",31);
        Soru6 soru6 = new Soru6(28,"Deniz",Soru6Enum.Pozitif);
    }

}
class Soru1{
    int yas;
    String ad;
    String renk;

    public Soru1(int yas, String ad, String renk) {
        this.yas = yas;
        this.ad = ad;
        this.renk = renk;
    }
}
class Soru1_1 extends Soru1{

    public Soru1_1(int yas, String ad, String renk) {
        super(yas, ad, renk);
    }
}
//------------------------------------------------------

abstract class Soru2{

    int yas;
    String ad;

    public Soru2(int yas, String ad) {
        this.yas = yas;
        this.ad = ad;
    }

    public void mesaj(){
         System.out.println("Soru2 mesaj");
     }
}
class Soru2_1 extends Soru2{

    String renk;
    public Soru2_1(int yas, String ad, String renk) {
        super(yas, ad);
        this.renk = renk;
    }
    @Override
    public void mesaj(){
        System.out.println("Soru2 yeni mesaj");
    }

}
//------------------------------------------------------

class Soru3_1 implements Soru3{

    @Override
    public void save(Object object) {

    }

    @Override
    public void update(Object object) {

    }

    @Override
    public void delete(Long id) {

    }
}
//-------------------------------------------------------
class Soru4{
    public static void call(){
        System.out.println("Class has called!");
    }
}
//-------------------------------------------------------
class Soru5{

    private final String name; //Constructor tanımlanmazsa hata verecektir. Çünkü hiç bir değer atanmamıştır.
    private final int age;

    public Soru5(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Soru6{

    int age;
    String name;
    Soru6Enum category;

    public Soru6(int age, String name, Soru6Enum category) {
        this.age = age;
        this.name = name;
        this.category = category;
    }

}
class Soru7_1 implements Soru3, Soru7{

    @Override
    public void save(Object object) {

    }

    @Override
    public void update(Object object) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void repeat(Object object) {

    }

    @Override
    public void insert(Object object) {

    }

    @Override
    public void rave(Long id) {

    }
}
class Soru8_1{

    private final String name;

    public Soru8_1(String name) {
        this.name = name;
    }

    public void selamla(String name){
        System.out.println("Selam!");
    }
}
class Soru8_2{

    private final String name;

    public Soru8_2(String name) {
        this.name = name;
    }
    public void selamla(String name){
        System.out.println("Selam!");
    }
}
class Soru9{
    protected int ageUp;

    public Soru9(int ageUp) {
        this.ageUp = ageUp;
    }
}
class Soru9_1 extends Soru9{

    public Soru9_1(int ageUp) {
        super(ageUp);
    }
}
class Soru10{
    String name;

    class Soru10_1{
        String surName;

        public Soru10_1(String surName) {
            this.surName = surName;
        }
    }

    public Soru10(String name) {
        this.name = name;
    }
}