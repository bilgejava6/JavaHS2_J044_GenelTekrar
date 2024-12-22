package com.bekircan.oop;

class Arac {
    String marka;
    int hiz;

    // Constructor
    public Arac(String marka, int hiz) {
        this.marka = marka;
        this.hiz = hiz;
        System.out.println("Arac Constructor Çalıştı: Marka - " + marka + ", Hız - " + hiz);
    }

    // Metot
    public void bilgileriGoster() {
        System.out.println("Marka: " + marka + ", Hız: " + hiz + " km/sa");
    }
}
