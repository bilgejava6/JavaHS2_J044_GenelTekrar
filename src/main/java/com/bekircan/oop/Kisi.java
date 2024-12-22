package com.bekircan.oop;

public class Kisi {
    // Özellikler
    String ad;
    String soyad;

    // Private Özellikler
    private String il;
    private String ilce;

    // 1. Soru: Özellik ve metot
    void selamVer() {
        System.out.println("Merhaba, ben " + ad + " " + soyad + ".");
    }

    // 2. Soru: Getter ve Setter metotları
    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    // 2. Soru: Adres metodu
    void adres() {
        System.out.println("Benim adresim " + il + ", " + ilce + ".");
    }

    // 3. Soru: Static özellik
    public static String ulke = "Türkiye";

    public void hangiUlke() {
        System.out.println("Benim ülkem " + ulke + ".");
    }

    // 4. Soru: Final metot
    public final void soru4() {
        System.out.println("Bu değiştirilemez bir final metodu.");
    }

    // 5. soru:


}
