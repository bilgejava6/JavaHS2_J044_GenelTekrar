package com.onur.kararyapilari.orta;

import java.util.Scanner;

public class OrtaRunner {

    public static void main(String[] args) {

        // 1.	Kullanıcıdan iki sayı alın ve büyüğünü ekrana yazdıran bir kod yazın.
        System.out.println("İlk sayıyı girin: ");
        int sayi1 = new Scanner(System.in).nextInt();
        System.out.println("İkinci sayıyı girin: ");
        int sayi2 = new Scanner(System.in).nextInt();
        if (sayi1 > sayi2) {
            System.out.println("Büyük sayı: " + sayi1);
        } else if (sayi2 > sayi1) {
            System.out.println("Büyük sayı: " + sayi2);
        } else {
            System.out.println("Sayılar eşit");
        }

        // 2.	Kullanıcıdan bir not alın ve bu nota göre harf notu (A, B, C, vb.) yazdırın.
        System.out.println("Notunuzu girin: ");
        int not = new Scanner(System.in).nextInt();
        if (not >= 90) {
            System.out.println("A");
        } else if (not >= 80) {
            System.out.println("B");
        } else if (not >= 70) {
            System.out.println("C");
        } else if (not >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // 3.	Kullanıcıdan bir yıl alın ve bu yılın artık yıl olup olmadığını kontrol edin.
        System.out.println("Yıl girin: ");
        int yil = new Scanner(System.in).nextInt();
        if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)) {
            System.out.println("Artık yıl");
        } else {
            System.out.println("Artık yıl değil");
        }

        // 4.	Bir karakter alın ve bu karakterin büyük harf, küçük harf veya sayı olup olmadığını kontrol eden bir program yazın.
        System.out.println("Bir karakter girin: ");
        char karakter = new Scanner(System.in).next().charAt(0);
        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println("Büyük harf");
        } else if (karakter >= 'a' && karakter <= 'z') {
            System.out.println("Küçük harf");
        } else if (karakter >= '0' && karakter <= '9') {
            System.out.println("Sayı");
        } else {
            System.out.println("Diğer");
        }

        // 5.	Kullanıcıdan üç sayı alın ve en büyüğünü bulan bir kod yazın.
        System.out.println("Üç sayı girin: ");
        int sayi3 = new Scanner(System.in).nextInt();
        int sayi4 = new Scanner(System.in).nextInt();
        int sayi5 = new Scanner(System.in).nextInt();
        int enBuyuk = sayi3;
        if (sayi4 > enBuyuk) {
            enBuyuk = sayi4;
        }
        if (sayi5 > enBuyuk) {
            enBuyuk = sayi5;
        }
        System.out.println("En büyük sayı: " + enBuyuk);

        // 6.	Kullanıcıdan bir sayı alın ve bu sayının hangi çeyreğe (0-25, 26-50, vb.) düştüğünü kontrol edin.
        System.out.println("Bir sayı girin: ");
        int sayi6 = new Scanner(System.in).nextInt();
        if (sayi6 >= 0 && sayi6 <= 100) {
            if (sayi6 <= 25) {
                System.out.println("0-25");
            } else if (sayi6 <= 50) {
                System.out.println("26-50");
            } else if (sayi6 <= 75) {
                System.out.println("51-75");
            } else {
                System.out.println("76-100");
            }
        } else {
            System.out.println("0-100 arasında bir sayı girin");
        }

        // 7.	Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisinde olup olmadığını kontrol edin.
        System.out.println("Bir sayı girin: ");
        int sayi7 = new Scanner(System.in).nextInt();
        int onceki = 0;
        int sonraki = 1;
        while (sonraki < sayi7) {
            int toplam = onceki + sonraki;
            onceki = sonraki;
            sonraki = toplam;
        }
        if (sonraki == sayi7) {
            System.out.println("Fibonacci serisinde");
        } else {
            System.out.println("Fibonacci serisinde değil");
        }

        // 8.	Kullanıcıdan bir gün adı alın ve bu güne göre bir öneri yazdırın (örneğin: “Pazartesi: Yeni haftaya başlıyoruz!”).
        System.out.println("Bir gün adı girin: ");
        String gun = new Scanner(System.in).nextLine();
        switch (gun.toLowerCase()) {
            case "pazartesi":
                System.out.println("Yeni haftaya başlıyoruz!");
                break;
            case "salı":
                System.out.println("Salı günü öğrenci işleri var");
                break;
            case "çarşamba":
                System.out.println("Çarşamba günü toplantı var");
                break;
            case "perşembe":
                System.out.println("Perşembe günü izinliyim");
                break;
            case "cuma":
                System.out.println("Cuma günü tatil");
                break;
            case "cumartesi":
                System.out.println("Cumartesi günü alışveriş");
                break;
            case "pazar":
                System.out.println("Pazar günü dinlenme");
                break;
            default:
                System.out.println("Geçersiz gün");
        }

        // 9.	Bir switch ifadesi kullanarak bir hesap makinesi yazın (toplama, çıkarma, çarpma, bölme).
        System.out.println("İki sayı girin: ");
        int sayi8 = new Scanner(System.in).nextInt();
        int sayi9 = new Scanner(System.in).nextInt();
        System.out.println("İşlem seçin: ");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        int secim = new Scanner(System.in).nextInt();
        switch (secim) {
            case 1:
                System.out.println("Toplam: " + (sayi8 + sayi9));
                break;
            case 2:
                System.out.println("Fark: " + (sayi8 - sayi9));
                break;
            case 3:
                System.out.println("Çarpım: " + (sayi8 * sayi9));
                break;
            case 4:
                System.out.println("Bölüm: " + (sayi8 / sayi9));
                break;
            default:
                System.out.println("Geçersiz işlem");
        }

        // 10.	Kullanıcıdan bir kelime alın ve bu kelimenin uzunluğuna göre farklı mesajlar yazdırın.
        System.out.println("Bir kelime girin: ");
        String kelime = new Scanner(System.in).next();
        int kelimeUzunlugu = kelime.length();
        switch (kelimeUzunlugu) {
            case 1:
                System.out.println("Tek karakterli kelime");
                break;
            case 2:
                System.out.println("İki karakterli kelime");
                break;
            case 3:
                System.out.println("Üç karakterli kelime");
                break;
            default:
                System.out.println("Dört veya daha fazla karakterli kelime");
        }



    }

}
