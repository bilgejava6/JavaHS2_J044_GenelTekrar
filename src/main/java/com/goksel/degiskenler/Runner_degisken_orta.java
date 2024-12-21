package com.goksel.degiskenler;

import java.util.Scanner;

public class Runner_degisken_orta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.
        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("Yaşınız: " + yas);

        // 2.
        final int SABIT_SAYI = 100;
        System.out.println("Sabit sayı: " + SABIT_SAYI);
        // SABIT_SAYI = 200; // derleme hatası

        // 3.
        String ad = "Kerim";
        String soyad = "Tekin";
        String tamAd = ad + " " + soyad;
        System.out.println("Tam ad: " + tamAd);

        // 4.
        double ondalikli = 5.7;
        int tamsayi = 3;
        double toplam = ondalikli + tamsayi;
        System.out.println("Toplam (double): " + toplam);

        // 5.
        String sayiString = "123";
        int sayiInt = Integer.parseInt(sayiString);
        int toplam2 = sayiInt + 5;
        System.out.println("String'den int'e dönüşüm sonrası toplam: " + toplam2);

        // 6.
        long buyukSayi = 1000000000L;
        System.out.println("Büyük sayı: " + buyukSayi);

        // 7.
        int sayi = 42;
        float sayiFloat = (float) sayi;
        String sayiString2 = String.valueOf(sayi);
        System.out.println("Int: " + sayi);
        System.out.println("Float: " + sayiFloat);
        System.out.println("String: " + sayiString2);

        // 8.
        System.out.print("Bir kelime giriniz: ");
        scanner.nextLine();
        String kelime = scanner.nextLine();
        System.out.println("Kelimenin uzunluğu: " + kelime.length());

        // 9.
        short kucukSayi = 150;
        int normalSayi = kucukSayi;
        System.out.println("Short'tan int'e dönüştürülen sayı: " + normalSayi);

    }
}