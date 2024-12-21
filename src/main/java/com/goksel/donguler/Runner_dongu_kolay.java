package com.goksel.donguler;

import java.util.Scanner;

public class Runner_dongu_kolay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1)

        System.out.println("(1) 1'den 10'a kadar sayılar (for):");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        } System.out.println();

        // 2)

        System.out.print("(2) Bir sayı girin (faktöriyel hesaplamak için): ");

        int sayiFakt = scanner.nextInt();
        int faktoriyel = 1;
        for (int i = 1; i <= sayiFakt; i++) {
            faktoriyel *= i;
        }
        System.out.println("    " + sayiFakt + "! = " + faktoriyel);

        // 3)

        System.out.println("(3) 1'den 100'e kadar çift sayılar (while):");
        int w = 1;
        while (w <= 100) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
            w++;
        } System.out.println();

        // 4)

        System.out.println("(4) 1 ile 50 arasındaki 5'in katları:");
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        } System.out.println();

        // 5)

        scanner.nextLine();

        System.out.print("(5) Bir kelime giriniz: ");

        String kelime = scanner.nextLine();

        System.out.println("    Kelimeyi 5 kez yazdır:");
        for (int i = 1; i <= 5; i++) {

            System.out.println("    " + kelime);
        }

        // 6)

        System.out.println("(6) 1'den 20'ye kadar sayılar (do-while):");
        int dw = 1;
        do {
            System.out.print(dw + " ");
            dw++;
        }
        while (dw <= 20);
        System.out.println();

        // 7)

        System.out.println("(7) \"Java\" kelimesini 3 kez yazdırma:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("    Java");
        }

        // 8)

        System.out.print("(8) Bir sayı giriniz (toplamını alacağız): ");

        int sayiToplam = scanner.nextInt();
        int toplam = 0;
        for (int i = 1; i <= sayiToplam; i++) {
            toplam += i;
        }
        System.out.println("    1'den " + sayiToplam + "'a kadar sayıların toplamı = " + toplam);

        // 9)

        System.out.println("(9) 10'dan geriye doğru:");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");

        } System.out.println();

        // 10)

        System.out.println("(10) 0'dan 10'a kadar sayıların karesi:");
        for (int i = 0; i <= 10; i++) {
            int kare = i * i;

            System.out.println("    " + i + "^2 = " + kare);


        }
    }
}
