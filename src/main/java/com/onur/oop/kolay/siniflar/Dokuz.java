package com.onur.oop.kolay.siniflar;

public class Dokuz {
    //Bir sınıfta bir metodu aynı isimle farklı parametrelerle tanımlayarak metot overloading yapın.

    public void toplama(int a, int b) {
        System.out.println("Toplam: " + (a + b));
    }

    public void toplama(int a, int b, int c) {
        System.out.println("Toplam: " + (a + b + c));
    }
}
