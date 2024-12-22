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

        System.out.println("*** 2. Soru ***");
        kisi.setIl("Ankara");
        kisi.setIlce("Eryaman");
        kisi.adres();

        System.out.println("*** 3. Soru ***");
        System.out.println("Ülke: " + Kisi.ulke);
        kisi.hangiUlke();

        System.out.println("*** 4. Soru ***");
        kisi.soru4();

        System.out.println("*** 5. Soru: Constructor Overloading ***");
        // Varsayılan constructor
        Kisi kisi1 = new Kisi();
        kisi1.kisiBilgisi();

        // Tek parametreli constructor
        Kisi kisi2 = new Kisi("Bekir Can");
        kisi2.kisiBilgisi();

        // İki parametreli constructor
        Kisi kisi3 = new Kisi("Bekir Can", "Yumrutepe");
        kisi3.kisiBilgisi();

        // Üç parametreli constructor
        Kisi kisi4 = new Kisi("Bekir Can", "Yumrutepe", 30);
        kisi4.kisiBilgisi();

        System.out.println("*** 6. Soru: this Anahtar Kelimesi ***");
        Kisi kisi5 = new Kisi("Ahmet", "Kaya", 25);
        kisi5.yazdir();

        kisi5.guncelle("Mehmet", "Yılmaz", 40);
        kisi5.yazdir();

        System.out.println("*** 7. Soru: toString Metodunu Override Etme ***");
        System.out.println(kisi5);

        System.out.println("*** 8. Soru: New Anahtar Kelimesi ile Sınıf Nesnesi Oluşturma ***");
        Kisi kisi6 = new Kisi("Ayşe", "Kara", 20);
        System.out.println("Yeni oluşturulan nesne bilgileri: " + kisi6);

        System.out.println("*** 9. Soru: Metot Overloading ***");
        kisi5.metotOverload();
        kisi5.metotOverload("Overloading örneği");

        System.out.println("*** 10. Soru: Default Constructor ***");
        Kisi kisi7 = new Kisi(); // Varsayılan constructor kullanıldı
        kisi7.kisiBilgisi();
    }
}
