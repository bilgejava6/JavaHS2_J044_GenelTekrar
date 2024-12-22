package com.onur.oop.kolay.siniflar;

public class Dort {

    // Bir sınıfta final bir metot oluşturun ve bu metodun neden override edilemediğini açıklayın.
    public final void finalMetot() {
        System.out.println("Final metot çalıştı.");
    }
    // final methodlar override edilemezler. Çünkü final methodlar ezilemezler. Yani final methodlar sınıfın son halidir ve değiştirilemezler.
}
