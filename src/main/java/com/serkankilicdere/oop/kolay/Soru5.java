package com.serkankilicdere.oop.kolay;

import java.util.Random;
import java.util.UUID;

public class Soru5 {

    /*
    5.	Bir sınıfın birden fazla constructor tanımlamasını (constructor overloading) gösteren bir örnek yazın.
     */
    private String uuid;
    private String ad;
    private String soyad;

    public Soru5(String ad, String soyad) {
        this.uuid = UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
    }

    public Soru5() {
        this.uuid = UUID.randomUUID().toString();
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
}


