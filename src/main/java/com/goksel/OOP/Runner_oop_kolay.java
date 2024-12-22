package com.goksel.OOP;

import java.util.Scanner;

public class Runner_oop_kolay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // 1.

        System.out.println("\n--- 1. Soru: Sınıf, Özellik ve Metot ---");
        PC Pc1 = new PC();
        Pc1.marka ="HP PAvillion";
        Pc1.model ="Lenovo 1i";
        Pc1.bilgileriGoster();

        // 2.

        System.out.println("\n--- 2. Soru: private Özellik ve getter/setter ---");

        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.setAd("Gokhan");
        System.out.println("Ogrencinin adı :"+ ogrenci1.getAd());

        // 3.

        System.out.println("\n--- 3. Soru: static Özellik ---");

        Sayac sayac1 = new Sayac();
        Sayac sayac2 = new Sayac();
        System.out.println("Sayaç Değeri: " + Sayac.sayac);

        // 4.

        System.out.println("\n--- 4. Soru: final Metot ---");
        Canli canli = new Canli();
        canli.konus();
        //   Kedi kedi = new Kedi(); // error

        // 5.

        System.out.println("\n--- 5. Soru: Constructor Overloading ---");

        Dikdortgen dikdortgen1 = new Dikdortgen();
        dikdortgen1.alanHesapla();
        Dikdortgen dikdortgen2 = new Dikdortgen(3,5);
        dikdortgen2.alanHesapla();

        // 6.

        System.out.println("\n--- 6. Soru: this Anahtar Kelimesi ---");
        Kitap kitap1 = new Kitap("Suç ve Ceza", "Dostoyevski");
        kitap1.bilgileriGoster();


        // 7.

        System.out.println("\n--- 7. Soru: toString() Override ---");
        Urun urun1 = new Urun("Laptop", 34000);
        System.out.println(urun1);

        // 8.

        System.out.println("\n--- 8. Soru: new Anahtar Kelimesi ---");

        Kedi kedi1 = new Kedi("Van kedisi", "Syah");
        System.out.println("Kedinin cinsi: "+kedi1.cins);
        System.out.println("Kedinin rengi: "+kedi1.renk);


        // 9.

        System.out.println("\n--- 9. Soru: Metot Overloading ---");

        Hesap hesap = new Hesap();
        System.out.println("İnt Toplama: "+ hesap.topla(5, 10));
        System.out.println("Double Toplama: "+ hesap.topla(3.5, 2.5));


        // 10.

        System.out.println("\n--- 10. Soru: Default Constructor ---");

        Ogretmen ogretmen1 = new Ogretmen();
        ogretmen1.ad = "ayşe";
        ogretmen1.soyad ="karahanlı";
        System.out.println("Ogretmen 1 adı: "+ ogretmen1.ad);
        System.out.println("Ogretmen 1 soyadı: "+ ogretmen1.soyad);
        Ogretmen ogretmen2 = new Ogretmen("elif","kerimoglu");
        System.out.println("Ogretmen 2 adı: "+ ogretmen2.ad);
        System.out.println("Ogretmen 2 soyadı: "+ ogretmen2.soyad);



    }
}


// 1.
class PC {
    String marka;
    String model;

    public void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
    }
}

// 2.
class Ogrenci {
    private String ad;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
// 3.
class Sayac {
    public static int sayac = 0;

    public Sayac() {
        sayac++;
    }
}
// 4.
class Canli {
    public final void konus() { // final metot
        System.out.println("Canlı konuşuyor.");
    }
}
// 5.
class Dikdortgen {
    int en;
    int boy;

    public Dikdortgen() {
        en = 5;
        boy = 36;
    }

    public Dikdortgen(int en, int boy) {
        this.en = en;
        this.boy = boy;
    }

    public void alanHesapla() {
        System.out.println("Alan: " + (en * boy));
    }
}
// 6.
class Kitap {
    String ad;
    String yazar;

    public Kitap(String ad, String yazar) {
        this.ad = ad;
        this.yazar = yazar;
    }

    public void bilgileriGoster() {
        System.out.println("Kitap adı: " + ad);
        System.out.println("Yazar: " + yazar);
    }
}
// 7.
class Urun {
    String ad;
    double fiyat;

    public Urun(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Urun [ad=" + ad + ", fiyat=" + fiyat + "]";
    }
}

// 8.
class Kedi {
    String cins;
    String renk;

    public Kedi(String cins, String renk) {
        this.cins = cins;
        this.renk = renk;
    }
}
// 9.
class Hesap {
    public int topla(int a, int b) {
        return a + b;
    }

    public double topla(double a, double b) {
        return a + b;
    }
}
// 10.
class Ogretmen {
    String ad;
    String soyad;

    public Ogretmen() {
    }
    public Ogretmen(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }
}