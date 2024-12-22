package com.bekircan.oop;

public class Kisi {
    // Özellikler
    public String ad;
    public String soyad;
    private String il;
    private String ilce;
    private int yas;

    // 3. Soru: Static özellik
    public static String ulke = "Türkiye";

    // 1. Soru: Özellik ve metot
    public void selamVer() {
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
    public void adres() {
        System.out.println("Benim adresim " + il + ", " + ilce + ".");
    }

    // 3. Soru: Static metot
    public void hangiUlke() {
        System.out.println("Benim ülkem " + ulke + ".");
    }

    // 4. Soru: Final metot
    public final void soru4() {
        System.out.println("Bu değiştirilemez bir final metodu.");
    }

    // 5. Soru: Constructor Overloading (Overload edilmiş yapıcı metotlar)

    // Boş constructor
    public Kisi() {
        this.ad = "Bilinmiyor";
        this.soyad = "Bilinmiyor";
        this.yas = 0;
    }

    // Tek parametreli constructor
    public Kisi(String ad) {
        this.ad = ad;
        this.soyad = "Bilinmiyor";
        this.yas = 0;
    }

    // İki parametreli constructor
    public Kisi(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = 0;
    }

    // Üç parametreli constructor
    public Kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public Kisi(String ad, int yas) {
        this.ad = ad;
        this.soyad = "Bilinmiyor";
        this.yas = yas;
    }

    public void kisiBilgisi() {
        System.out.println("Ad: " + ad + ", Soyad: " + soyad + ", Yaş: " + yas);
    }

    // 6. Soru: this kullanımı
    public void guncelle(String ad, String soyad, int yas) {
        this.setAd(ad);
        this.setSoyad(soyad);
        this.setYas(yas);
    }

    public void yazdir() {
        System.out.println("Ad: " + this.ad + ", Soyad: " + this.soyad + ", Yaş: " + this.yas);
    }

    // 7. Soru: toString Metodunu Override Etme
    @Override
    public String toString() {
        return "Ad: " + ad + ", Soyad: " + soyad + ", Yaş: " + yas + ", İl: " + il + ", İlçe: " + ilce;
    }

    // 9. Soru: Metot Overloading
    public void metotOverload() {
        System.out.println("Parametresiz metot çağrıldı.");
    }

    public void metotOverload(String mesaj) {
        System.out.println("Parametreli metot çağrıldı: " + mesaj);
    }

    // Getter ve Setter'lar
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
}
