package com.gonca.oop.kolay;

public class Run6 {
    //Bir this anahtar kelimesini kullanarak bir sınıf içindeki özelliğe erişimi gösterin.
    private static String ad;
    private static  int yas;
    private  static int boy;

    public Run6() {}

    public Run6(String ad, int yas, int boy) {
        this.ad = ad;
        this.yas = yas;
        this.boy = boy;
    }

    public void bilgileriYazdir() {
        System.out.println("İsim: " + this.ad);
        System.out.println("Yaş: " + this.yas);
        System.out.println("Boy " + this.boy);

    }

    public static void main(String[] args) {
        Run6 run6 = new Run6();
        run6.bilgileriYazdir();




    }
}
