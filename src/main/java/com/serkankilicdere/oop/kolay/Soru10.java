package com.serkankilicdere.oop.kolay;

public class Soru10 {

    private String ad;
    private String soyad;
    private int yas;

    public Soru10() {


    }

    public Soru10(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public static void main(String[] args) {
        Soru10 soru = new Soru10();

        soru.setAd("serkan");
        soru.setSoyad("kilicdere");
        soru.setYas(47);
    }
}
