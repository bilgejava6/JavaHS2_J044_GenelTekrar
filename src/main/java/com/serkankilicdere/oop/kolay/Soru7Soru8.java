package com.serkankilicdere.oop.kolay;

public class Soru7Soru8 {

    /*
    7.	Bir sınıfta toString metodunu override ederek sınıfın verilerini anlamlı bir şekilde yazdırın.
    8.	Bir sınıf oluşturun ve bu sınıfın bir nesnesini new anahtar kelimesi ile oluşturun.
     */
    private String ad;
    private String soyad;
    private int yas;

    public Soru7Soru8(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Soru7{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }

    public static void main(String[] args) {
        Soru7Soru8 insan=new Soru7Soru8("ad","soyad",2);// soru 8 cevap

        System.out.println(insan);

    }

}
