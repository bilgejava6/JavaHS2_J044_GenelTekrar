package com.onur.donguler.kolay;

import java.util.Scanner;

public class KolayRunner {
    public static void main(String[] args) {

        // 1. for döngüsü kullanarak 1’den 10’a kadar olan sayıları ekrana yazdırın.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 2. Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayan bir program yazın.
        System.out.println("Bir sayı girin: ");
        int sayi = new Scanner(System.in).nextInt();
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        System.out.println("Faktoriyel: " + faktoriyel);

        // 3. while döngüsü kullanarak 1’den 100’e kadar olan çift sayıları ekrana yazdırın.
        int j = 1;
        while (j <= 100) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }

        // 4. 1 ile 50 arasındaki sayılardan 5’in katlarını yazdıran bir döngü yazın.
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        // 5. Kullanıcıdan bir kelime alın ve bu kelimeyi 5 kez ekrana yazdıran bir kod yazın.
        System.out.println("Bir kelime girin: ");
        String kelime = new Scanner(System.in).nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(kelime);
        }

        // 6. do-while döngüsü kullanarak 1’den 20’ye kadar olan sayıları yazdırın.
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 20);

        // 7. Bir döngü içinde “Java” kelimesini 3 kez ekrana yazdırın.
        for (int i = 0; i < 3; i++) {
            System.out.println("Java");
        }

        // 8. Kullanıcıdan bir sayı alın ve 1’den bu sayıya kadar olan sayıların toplamını hesaplayan bir kod yazın.
        System.out.println("Bir sayı girin: ");
        int sayi2 = new Scanner(System.in).nextInt();
        int toplam = 0;
        for (int i = 1; i <= sayi2; i++) {
            toplam += i;
        }
        System.out.println("Toplam: " + toplam);

        // 9. Bir for döngüsüyle 10’dan geriye doğru sayan bir program yazın.
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // 10. Bir döngü ile 0’dan 10’a kadar olan sayıların karesini ekrana yazdırın.
        for (int i = 0; i <= 10; i++) {
            System.out.println(i * i);
        }


    }
}
