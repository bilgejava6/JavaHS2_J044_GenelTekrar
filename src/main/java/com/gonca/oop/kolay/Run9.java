package com.gonca.oop.kolay;

public class Run9 {
    //Bir sınıfta bir metodu aynı isimle farklı parametrelerle tanımlayarak metot overloading yapın.

    private int sayi1;
    private int sayi2;

    // int double

    public int toplam(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }

    public double toplam( double sayi1, double sayi2)
    {
        return sayi1+sayi2;
    }

    public static void main(String[] args) {
        Run9 r = new Run9();
        r.toplam(5,6);
        r.toplam(3.14,2.18);
    }

}
