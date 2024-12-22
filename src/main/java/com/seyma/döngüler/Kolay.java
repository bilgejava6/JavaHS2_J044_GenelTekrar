package com.seyma.döngüler;

import java.util.Scanner;

public class Kolay {
    /**
     * 1.	for döngüsü kullanarak 1’den 10’a kadar olan sayıları ekrana yazdırın.
     * * 	2.	Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayan bir program yazın.
     * * 	3.	while döngüsü kullanarak 1’den 100’e kadar olan çift sayıları ekrana yazdırın.
     * * 	4.	1 ile 50 arasındaki sayılardan 5’in katlarını yazdıran bir döngü yazın.
     * * 	5.	Kullanıcıdan bir kelime alın ve bu kelimeyi 5 kez ekrana yazdıran bir kod yazın.
     * * 	6.	do-while döngüsü kullanarak 1’den 20’ye kadar olan sayıları yazdırın.
     * * 	7.	Bir döngü içinde “Java” kelimesini 3 kez ekrana yazdırın.
     * * 	8.	Kullanıcıdan bir sayı alın ve 1’den bu sayıya kadar olan sayıların toplamını hesaplayan bir kod yazın.
     * * 	9.	Bir for döngüsüyle 10’dan geriye doğru sayan bir program yazın.
     * * 	10.	Bir döngü ile 0’dan 10’a kadar olan sayıların karesini ekrana yazdırın.
     */


    public static void main(String[] args) {
        soru1();
        soru2();
        soru3();
        soru4();
        soru5();
        soru6();
        soru7();
        soru8();
        soru9();
        soru10();

    }

    public static void soru1() {

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void soru2() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...:");
        int sayi = scan.nextInt();
        int fak = 1;
        for (int i = 1; i <= sayi; i++) {
            fak = fak * i;

        }
        System.out.println("Faktoriye..:" + fak);


    }

    public static void soru3() {
        int i =1;
        while (i <= 100) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void soru4() {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }

        }

    }

    public static void soru5() {
        System.out.println("Bir kelime yazınız");
        Scanner scan = new Scanner(System.in);
        String yazi = scan.nextLine();
        for (int i = 1; i <=5; i++) {
            System.out.println(yazi);
        }
    }

    public static void soru6() {
        int sayi =0;
        do {
            sayi++;
            System.out.println(sayi);

        }while (sayi < 20);

    }

    public static void soru7() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("JAVA");
        }

    }

    public static void soru8() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...:");
        int sayi = scan.nextInt();
        int toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            toplam = toplam + i;

        }
        System.out.println("Toplam:" + toplam);


    }

    public static void soru9() {

        for (int i = 10; i > 0; i--) {
            System.out.println(i);

        }

    }

    public static void soru10() {
        int sayi =1;
        for (int i = 1; i <= 10; i++) {
            sayi = i*i;
            System.out.println(i+" sayısının karesi"+sayi);
        }

    }















}













