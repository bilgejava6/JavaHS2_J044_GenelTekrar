package com.bekircan.degiskenler;

import java.util.Scanner;

/**
 *          * ** DEĞİŞKENLER
 *          * -- Kolay
 *          * 	1.	Bir tamsayı değişkeni oluşturun ve ona 10 değerini atayın. Bu değişkeni ekrana yazdırın.
 *          * 	2.	Bir double türünde değişken tanımlayın ve 3.14 değerini atayın. Değeri konsola yazdırın.
 *          * 	3.	Bir String değişken oluşturup adınızı atayın. Bu değişkeni kullanarak “Merhaba, [adınız]!” çıktısını alın.
 *          * 	4.	boolean türünde bir değişken tanımlayın ve ona true değeri verin. Değeri konsolda yazdırın.
 *          * 	5.	Bir char türünde değişken oluşturun ve ilk harfinizi atayın. Değeri ekrana yazdırın.
 *          * 	6.	İki tamsayı değişkeni oluşturun (x=5 ve y=7). Bu iki sayının toplamını ekrana yazdırın.
 *          * 	7.	Bir değişken tanımlayın ve ona null atayın. Sonra değerini 100 olarak değiştirin.
 *          * 	8.	Bir değişken tanımlayın ve değer atamadan önce bir çıktı almaya çalışın. Hata mesajını yorumlayın.
 *          * 	9.	Bir float değişken oluşturun ve 2.5 değerini atayın. Bu değeri ekrana yazdırın.
 *          * 	10.	byte türünde bir değişken tanımlayıp 127 değeri verin. Daha büyük bir değer atarsanız ne olur?
 */

public class Runner_Degiskenler_Kolay {

    public static void main(String[] args) {
    // 1. soru
            int sayi = 10;
            System.out.println("1.  soru; İstenen sayı: " + sayi);
    // 2. soru
        double pi = 3.14;
        System.out.println("2.  soru; Pi sayısı: " + pi);
    // 3. soru
        String ismim = "Bekir Can";
        System.out.println("3.  soru; Merhaba, benim ismim " + ismim + "!");
    // 4. soru
        boolean dersteMisin = true;
        System.out.println("4.  soru; " + dersteMisin);
    // 5. soru
        char ilkHarf = 'A';
        System.out.println("5.  soru; Alfabenin ilk harfi: " + ilkHarf);
    // 6. soru
        int x = 5;
        int y = 7;
        int topla = x+y;
        System.out.println("6.  soru; x + y: " + topla);
    // 7. soru
        Integer sayi7soru = null;
        System.out.println("7.  soru; Başlangıç değeri : " + sayi7soru);
        sayi7soru = 100;
        System.out.println("7.  soru; Yeni değeri : " + sayi7soru);
    // 8. soru -> Bir değişken tanımlayın ve değer atamadan önce bir çıktı almaya çalışın. Hata mesajını yorumlayın.
        int sayi8soru;
        // System.out.println("8.  soru; tanımlanmayan sayı " + sayi8soru);
    // 9. soru -> Bir float değişken oluşturun ve 2.5 değerini atayın. Bu değeri ekrana yazdırın.
        float sayi9soru = 2.5f;
        System.out.println("9.  soru; float değeri : " + sayi9soru);
    // 10. soru -> byte türünde bir değişken tanımlayıp 127 değeri verin. Daha büyük bir değer atarsanız ne olur?
        byte sayi10soru = 127;
        System.out.println("10. soru; " + sayi10soru);
        // byte sayi10soru2 = 128; // error: incompatible types: possible lossy conversion from int to byte
        // System.out.println("10. soru; " + sayi10soru2);
    }// psvm end
}// kolay sorular end
