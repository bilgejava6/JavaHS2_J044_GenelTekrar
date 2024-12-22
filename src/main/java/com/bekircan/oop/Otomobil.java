package com.bekircan.oop;

class Otomobil extends Arac {
    int yolcuSayisi;

    // Constructor
    public Otomobil(String marka, int hiz, int yolcuSayisi) {
        super(marka, hiz);
        this.yolcuSayisi = yolcuSayisi;
        System.out.println("Otomobil Constructor Çalıştı: Yolcu Sayısı - " + yolcuSayisi);
    }

    // Metot override
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yolcu Sayısı: " + yolcuSayisi);
    }
}