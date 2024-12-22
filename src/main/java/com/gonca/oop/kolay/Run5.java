package com.gonca.oop.kolay;

public class Run5 {
    //Bir sınıfın birden fazla constructor tanımlamasını (constructor overloading) gösteren bir örnek yazın.
    private  int uzunluk;
    private String renk;
    private int yas;

    public Run5() {

    }

    public Run5(int uzunluk, String renk) {
        this.uzunluk = uzunluk;
        this.renk = renk;
    }

    public Run5(int uzunluk, String renk, int yas) {
        this.uzunluk = uzunluk;
        this.renk = renk;
        this.yas = yas;
    }
}
