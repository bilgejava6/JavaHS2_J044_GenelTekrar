package com.onur.kararyapilari.kolay;

import java.util.Scanner;

public class KolayRunner {

    public static void main(String[] args) {

        /** 	1.	Kullanıcıdan bir sayı alın ve pozitif mi negatif mi olduğunu kontrol edin.
         * 	2.	Kullanıcıdan bir sayı alın ve bu sayının çift mi tek mi olduğunu yazdıran bir program yazın.
         * 	3.	Kullanıcıdan bir yaş değeri alın ve bu yaşa göre “Çocuk”, “Genç”, veya “Yetişkin” yazdırın.
                * 	4.	Bir karakter alın ve bu karakterin sesli harf olup olmadığını kontrol eden bir kod yazın.
                * 	5.	Kullanıcıdan bir not girilmesini isteyin ve bu nota göre “Geçti” veya “Kaldı” yazdırın.
                * 	6.	Kullanıcıdan bir gün adı alın ve bu günün hafta içi mi hafta sonu mu olduğunu kontrol edin.
                * 	7.	Bir sayının 0, 1 veya diğer durumlarını kontrol eden bir if yapısı yazın.
         * 	8.	Kullanıcıdan bir rakam girilmesini isteyin ve bu rakamın İngilizce karşılığını yazdırın.
                * 	9.	Kullanıcıdan bir sayı alın ve bu sayının 3 ve 5 ile bölünebilirliğini kontrol edin.
         * 	10.	Kullanıcıdan bir ay numarası alın ve bu ayın kaç gün olduğunu yazdırın.*/

        // 1.	Kullanıcıdan bir sayı alın ve pozitif mi negatif mi olduğunu kontrol edin.
        System.out.println("Bir sayı girin: ");
        int sayi = new Scanner(System.in).nextInt();
        if (sayi > 0) {
            System.out.println("Pozitif");
        } else if (sayi < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Sıfır");
        }

        // 2.	Kullanıcıdan bir sayı alın ve bu sayının çift mi tek mi olduğunu yazdıran bir program yazın.
        System.out.println("Bir sayı girin: ");
        int sayi2 = new Scanner(System.in).nextInt();
        if (sayi2 % 2 == 0) {
            System.out.println("Çift");
        } else {
            System.out.println("Tek");
        }

        // 3.	Kullanıcıdan bir yaş değeri alın ve bu yaşa göre “Çocuk”, “Genç”, veya “Yetişkin” yazdırın.
        System.out.println("Yaşınızı girin: ");
        int yas = new Scanner(System.in).nextInt();
        if (yas < 18) {
            System.out.println("Çocuk");
        } else if (yas < 35) {
            System.out.println("Genç");
        } else {
            System.out.println("Yetişkin");
        }

        // 4.	Bir karakter alın ve bu karakterin sesli harf olup olmadığını kontrol eden bir kod yazın.
        System.out.println("Bir karakter girin: ");
        char karakter = new Scanner(System.in).next().charAt(0);
        if (karakter == 'a' || karakter == 'e' || karakter == 'ı' || karakter == 'i' || karakter == 'o' || karakter == 'ö' || karakter == 'u' || karakter == 'ü') {
            System.out.println("Sesli harf");
        } else {
            System.out.println("Sessiz harf");
        }

        // 5.	Kullanıcıdan bir not girilmesini isteyin ve bu nota göre “Geçti” veya “Kaldı” yazdırın.
        System.out.println("Notunuzu girin: ");
        int not = new Scanner(System.in).nextInt();
        if (not >= 50) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }

        // 6.	Kullanıcıdan bir gün adı alın ve bu günün hafta içi mi hafta sonu mu olduğunu kontrol edin.
        System.out.println("Bir gün adı girin: ");
        String gun = new Scanner(System.in).nextLine();
        if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) {
            System.out.println("Hafta sonu");
        } else {
            System.out.println("Hafta içi");
        }

        // 7.	Bir sayının 0, 1 veya diğer durumlarını kontrol eden bir if yapısı yazın.
        System.out.println("Bir sayı girin: ");
        int sayi3 = new Scanner(System.in).nextInt();
        if (sayi3 == 0) {
            System.out.println("Sıfır");
        } else if (sayi3 == 1) {
            System.out.println("Bir");
        } else {
            System.out.println("Diğer");
        }

        // 8.	Kullanıcıdan bir rakam girilmesini isteyin ve bu rakamın İngilizce karşılığını yazdırın.
        System.out.println("Bir rakam girin: ");
        int rakam = new Scanner(System.in).nextInt();
        switch (rakam) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Geçersiz rakam");
        }

        // 9.	Kullanıcıdan bir sayı alın ve bu sayının 3 ve 5 ile bölünebilirliğini kontrol edin.
        System.out.println("Bir sayı girin: ");
        int sayi4 = new Scanner(System.in).nextInt();
        if (sayi4 % 15 == 0) {
            System.out.println("Hem 3'e hem de 5'e bölünebilir");
        } else if (sayi4 % 3 == 0) {
            System.out.println("Sadece 3'e bölünebilir");
        } else if (sayi4 % 5 == 0) {
            System.out.println("Sadece 5'e bölünebilir");
        } else {
            System.out.println("Bölünemez");
        }

        // 10.	Kullanıcıdan bir ay numarası alın ve bu ayın kaç gün olduğunu yazdırın.
        System.out.println("Bir ay numarası girin: ");
        int ay = new Scanner(System.in).nextInt();
        switch (ay) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 gün");
                break;
            case 2:
                System.out.println("28/29 gün");
                break;
            case 4, 9, 11, 6:
                System.out.println("30 gün");
                break;
            default:
                System.out.println("Geçersiz ay numarası");
        }


    }

}
