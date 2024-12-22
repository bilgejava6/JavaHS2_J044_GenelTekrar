package com.bekircan.kararYapilari;

import java.util.Scanner;

/**
 *          * Orta
 *          * 	1.	Kullanıcıdan iki sayı alın ve büyüğünü ekrana yazdıran bir kod yazın.
 *          * 	2.	Kullanıcıdan bir not alın ve bu nota göre harf notu (A, B, C, vb.) yazdırın.
 *          * 	3.	Kullanıcıdan bir yıl alın ve bu yılın artık yıl olup olmadığını kontrol edin.
 *          * 	4.	Bir karakter alın ve bu karakterin büyük harf, küçük harf veya sayı olup olmadığını kontrol eden bir program yazın.
 *          * 	5.	Kullanıcıdan üç sayı alın ve en büyüğünü bulan bir kod yazın.
 *          * 	6.	Kullanıcıdan bir sayı alın ve bu sayının hangi çeyreğe (0-25, 26-50, vb.) düştüğünü kontrol edin.
 *          * 	7.	Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisinde olup olmadığını kontrol edin.
 *          * 	8.	Kullanıcıdan bir gün adı alın ve bu güne göre bir öneri yazdırın (örneğin: “Pazartesi: Yeni haftaya başlıyoruz!”).
 *          * 	9.	Bir switch ifadesi kullanarak bir hesap makinesi yazın (toplama, çıkarma, çarpma, bölme).
 *          * 	10.	Kullanıcıdan bir kelime alın ve bu kelimenin uzunluğuna göre farklı mesajlar yazdırın.
 */

public class Karar_Yapilari_Orta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("""
                *** 1. Soru ***
                """);
        System.out.println("Bir 1. sayı giriniz: ");
        int soru1sayi1 = scanner.nextInt();
        System.out.println("Bir 2. sayı giriniz: ");
        int soru1sayi2 = scanner.nextInt();

        if (soru1sayi1 > soru1sayi2) {
            System.out.println("Büyük olan sayı: " + soru1sayi1);
        }else if (soru1sayi2 > soru1sayi1) {
            System.out.println("Büyük olan sayı: " + soru1sayi2);
        }else {
            System.out.println("İki sayı eşit!");
        }


        System.out.println("");
        System.out.println("""
                *** 2. Soru ***
                """);
        System.out.println("Bir notunuzu giriniz(0-100): ");
        int soru2sayi1 = scanner.nextInt();
        // 2.	Kullanıcıdan bir not alın ve bu nota göre harf notu (A, B, C, vb.) yazdırın.
        if (soru2sayi1 < 0 || soru2sayi1 > 100) {
            System.out.println("Geçersiz giriş. Not 0 ile 100 arasında olmalıdır.");
        } else {
            switch (soru2sayi1 / 10) {
                case 10: // 100 puan için
                case 9:  // 90-99 arası
                    System.out.println("Harf Notu: A");
                    break;
                case 8:  // 80-89 arası
                    System.out.println("Harf Notu: B");
                    break;
                case 7:  // 70-79 arası
                    System.out.println("Harf Notu: C");
                    break;
                case 6:  // 60-69 arası
                    System.out.println("Harf Notu: D");
                    break;
                default: // 0-59 arası
                    System.out.println("Harf Notu: F");
                    break;
            }
        }
        // 3.	Kullanıcıdan bir yıl alın ve bu yılın artık yıl olup olmadığını kontrol edin.
        System.out.println("");
        System.out.println("""
                *** 3. Soru ***
                """);
        System.out.println("Bir yıl giriniz: ");
        int yil = scanner.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        // 4.	Bir karakter alın ve bu karakterin büyük harf, küçük harf veya sayı olup olmadığını kontrol eden bir program yazın.
            System.out.println("");
            System.out.println("""
                *** 4. Soru ***
                """);

        System.out.println("Bir karakter giriniz: ");
        char karakter = scanner.next().charAt(0);


        if (Character.isUpperCase(karakter)) {
            System.out.println("Girdiğiniz karakter bir büyük harf: " + karakter);
        } else if (Character.isLowerCase(karakter)) {
            System.out.println("Girdiğiniz karakter bir küçük harf: " + karakter);
        } else if (Character.isDigit(karakter)) {
            System.out.println("Girdiğiniz karakter bir sayı: " + karakter);
        } else {
            System.out.println("Girdiğiniz karakter ne harf ne de sayı: " + karakter);
        }


    }
}
