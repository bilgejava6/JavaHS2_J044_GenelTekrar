package com.onur.donguler.zor;

import java.util.Scanner;

public class ZorRunner {

    public static void main(String[] args) {


        // 1. Kullanıcıdan bir sayı alın ve bu sayıyı asal çarpanlarına ayıran bir program yazın.
        System.out.println("Bir sayı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int i = 2;
        while (sayi > 1) {
            if (sayi % i == 0) {
                System.out.println(i);
                sayi /= i;
            } else {
                i++;
            }
        }

        // 2. Bir sayı dizisindeki tüm çift ve tek sayıların toplamını ayrı ayrı bulan bir döngü yazın.
        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ciftToplam = 0;
        int tekToplam = 0;
        for (int sayi2 : sayilar) {
            if (sayi2 % 2 == 0) {
                ciftToplam += sayi2;
            } else {
                tekToplam += sayi2;
            }
        }

        System.out.println("Çift sayıların toplamı: " + ciftToplam);
        System.out.println("Tek sayıların toplamı: " + tekToplam);

        // 3. Kullanıcıdan bir sayı alın ve bu sayının mükemmel sayı olup olmadığını kontrol eden bir program yazın.
        System.out.println("Bir sayı giriniz: ");
        int sayi3 = scanner.nextInt();
        int toplam = 0;
        for (int j = 1; j < sayi3; j++) {
            if (sayi3 % j == 0) {
                toplam += j;
            }
        }

        if (toplam == sayi3) {
            System.out.println("Mükemmel sayıdır.");
        } else {
            System.out.println("Mükemmel sayı değildir.");
        }

        // 4. Kullanıcıdan bir kelime alın ve kelimenin permütasyonlarını iç içe döngüler kullanarak yazdırın.

        // 5. Kullanıcıdan bir sayı alın ve bu sayıyı binary formatına dönüştüren bir döngü yazın.
        System.out.println("Bir sayı giriniz: ");
        int sayi4 = scanner.nextInt();
        StringBuilder binary = new StringBuilder();
        while (sayi4 > 0) {
            binary.insert(0, (sayi4 % 2));
            sayi4 /= 2;
        }

        System.out.println("Binary: " + binary);

        // 6. Bir dizi içindeki tekrarlayan öğeleri bulan bir döngü yazın.
        int[] sayilar2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2};
        for (int j = 0; j < sayilar2.length; j++) {
            for (int k = j + 1; k < sayilar2.length; k++) {
                if (sayilar2[j] == sayilar2[k]) {
                    System.out.println("Tekrar eden sayı: " + sayilar2[j]);
                }
            }
        }

        // 7. İç içe döngülerle bir elmas deseni çizen bir program yazın.
        int n = 5;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n - j; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * j + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = n - 2; j >= 0; j--) {
            for (int k = 0; k < n - j; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * j + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 8. Kullanıcıdan bir sayı alın ve bu sayının tersine çevrilmiş halini yazdıran bir döngü yazın.
        System.out.println("Bir sayı giriniz: ");
        int sayi5 = scanner.nextInt();
        int ters = 0;
        while (sayi5 > 0) {
            ters = ters * 10 + (sayi5 % 10);
            sayi5 /= 10;
        }

        System.out.println("Ters: " + ters);

        // 9. Bir for döngüsü kullanarak Pascal üçgenini ekrana yazdıran bir program yazın.
        int satir = 5;
        for (int j = 0; j < satir; j++) {
            int sayi6 = 1;
            for (int k = 0; k <= j; k++) {
                System.out.print(sayi6 + " ");
                sayi6 = sayi6 * (j - k) / (k + 1);
            }
            System.out.println();
        }

        scanner.close();


    }

}
