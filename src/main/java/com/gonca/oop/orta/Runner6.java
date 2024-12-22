package com.gonca.oop.orta;

public class Runner6 {
    //Bir enum oluşturun ve bu enum türünde bir değişkeni sınıf içinde kullanın.
    private String ad;
    private CİNSİYET cinsiyet;

    public Runner6(String ad, CİNSİYET cinsiyet) {
        this.ad = ad;
        this.cinsiyet = cinsiyet;
    }

    public static void main(String[] args) {
        Runner6 kisi=new Runner6("GONCA", CİNSİYET.KADIN);
    }
}
