package com.gonca.oop.zor;

import java.util.UUID;

public class Ru6 {
    // Bir sınıfta birden fazla constructor tanımlayın
    // ve bunların her birini farklı parametrelerle çağıran bir nesne oluşturun.

    private String ad;
    private String soyad;
    private int yas;
    private String id;
    private String uyruk;

    public Ru6() {}

    public Ru6(String ad, String soyad, String id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id =UUID.randomUUID().toString();
    }

    public Ru6(String ad, String soyad, int yas, String id, String uyruk) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.id = UUID.randomUUID().toString();
        this.uyruk = uyruk;
    }


    public static void main(String[] args) {
        Ru6 nesne=new Ru6("Ahmet ", "Demir", "6546646");
        Ru6 nesne2=new Ru6("Ahmet ", "Demir",56, "6546646","T.C");



    }
}
