package com.onur.oop.kolay.siniflar;

public class Bes {

    //Bir sınıfın birden fazla constructor tanımlamasını (constructor overloading) gösteren bir örnek yazın.

    private String ad;
    private int yas;
    private String adres;


    public Bes(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public Bes(String ad, int yas, String adres) {
        this.ad = ad;
        this.yas = yas;
        this.adres = adres;
    }


}
