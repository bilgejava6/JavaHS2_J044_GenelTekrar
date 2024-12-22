package com.onur.oop.kolay.siniflar;

public class Yedi {

    //Bir sınıfta toString metodunu override ederek sınıfın verilerini anlamlı bir şekilde yazdırın.

    private String ad;
    private int yas;
    private String adres;

    public Yedi(String ad, int yas, String adres) {
        this.ad = ad;
        this.yas = yas;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Ad: " + ad + ", Yaş: " + yas + ", Adres: " + adres;
    }

}
