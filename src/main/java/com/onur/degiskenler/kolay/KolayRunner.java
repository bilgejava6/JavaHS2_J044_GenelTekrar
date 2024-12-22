package com.onur.degiskenler.kolay;

public class KolayRunner {

    public static void main(String[] args) {

        // 1. Bir tamsayı değişkeni oluşturun ve ona 10 değerini atayın. Bu değişkeni ekrana yazdırın.
        int sayi = 10;
        System.out.println(sayi);

        // 2. Bir double türünde değişken tanımlayın ve 3.14 değerini atayın. Değeri konsola yazdırın.
        double pi = 3.14;
        System.out.println(pi);

        // 3. Bir String değişken oluşturup adınızı atayın. Bu değişkeni kullanarak “Merhaba, [adınız]!” çıktısını alın.
        String ad = "Onur";
        System.out.println("Merhaba, " + ad + "!");

        // 4. boolean türünde bir değişken tanımlayın ve ona true değeri verin. Değeri konsolda yazdırın.
        boolean dogruMu = true;
        System.out.println(dogruMu);

        // 5. Bir char türünde değişken oluşturun ve ilk harfinizi atayın. Değeri ekrana yazdırın.
        char ilkHarf = 'O';
        System.out.println(ilkHarf);

        // 6. İki tamsayı değişkeni oluşturun (x=5 ve y=7). Bu iki sayının toplamını ekrana yazdırın.
        int x = 5;
        int y = 7;
        System.out.println(x + y);

        // 7. Bir değişken tanımlayın ve ona null atayın. Sonra değerini 100 olarak değiştirin.
        Integer deger = null;
        deger = 100;
        System.out.println(deger);

        // 8. Bir değişken tanımlayın ve değer atamadan önce bir çıktı almaya çalışın. Hata mesajını yorumlayın.
        // int sayi2;
        // System.out.println(sayi2);
        // Hata: The local variable sayi2 may not have been initialized

        // 9. Bir float değişken oluşturun ve 2.5 değerini atayın. Bu değeri ekrana yazdırın.
        float ondalik = 2.5f;
        System.out.println(ondalik);

        // 10. byte türünde bir değişken tanımlayıp 127 değeri verin. Daha büyük bir değer atarsanız ne olur?
        byte buyukSayi = 127;
        // buyukSayi = 128;
        // Hata: Type mismatch: cannot convert from int to byte

    }

}
