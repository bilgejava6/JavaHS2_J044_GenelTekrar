package com.bekircan.oop;

/**
 *  OOP - Kolay
 *  1.	Bir class oluşturun ve bu sınıfta bir özellik (field) ve bir metot tanımlayın.
 *  2.	Bir sınıfta private bir özellik tanımlayın ve buna erişmek için bir getter ve setter metodu oluşturun.
 *  3.	Bir sınıfta static bir özellik tanımlayın ve bu özelliğe sınıf adıyla erişin.
 *  4.	Bir sınıfta final bir metot oluşturun ve bu metodun neden override edilemediğini açıklayın.
 *  5.	Bir sınıfın birden fazla constructor tanımlamasını (constructor overloading) gösteren bir örnek yazın.
 *  6.	Bir this anahtar kelimesini kullanarak bir sınıf içindeki özelliğe erişimi gösterin.
 *  7.	Bir sınıfta toString metodunu override ederek sınıfın verilerini anlamlı bir şekilde yazdırın.
 *  8.	Bir sınıf oluşturun ve bu sınıfın bir nesnesini new anahtar kelimesi ile oluşturun.
 *  9.	Bir sınıfta bir metodu aynı isimle farklı parametrelerle tanımlayarak metot overloading yapın.
 *  10.	Bir sınıfta default bir constructor tanımlayın ve bu constructor’ın kullanımını gösterin.
 */


public class Oop_Kolay {
    public static void main(String[] args) {

        System.out.println("*** 1. Soru ***");

        Kisi kisi = new Kisi();
        kisi.ad = "Bekir Can";
        kisi.soyad = "Yumrutepe";
        kisi.selamVer();

        System.out.println();
        System.out.println("*** 2. Soru ***");

        kisi.setIl("Ankara");
        kisi.setIlce("Eryaman");
        kisi.adres();

        System.out.println();
        System.out.println("*** 3. Soru ***");

        System.out.println("Ülke: " + Kisi.ulke);
        kisi.hangiUlke();

        System.out.println();
        System.out.println("*** 4. Soru ***");

        kisi.soru4();


    }
}
