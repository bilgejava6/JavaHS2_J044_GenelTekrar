package com.serkankilicdere.donguler.kolay;

import java.util.Scanner;

public class Kolay {

    /*
     *Kolay
     * 	1.	for döngüsü kullanarak 1’den 10’a kadar olan sayıları ekrana yazdırın.
     * 	2.	Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayan bir program yazın.
     * 	3.	while döngüsü kullanarak 1’den 100’e kadar olan çift sayıları ekrana yazdırın.
     * 	4.	1 ile 50 arasındaki sayılardan 5’in katlarını yazdıran bir döngü yazın.
     * 	5.	Kullanıcıdan bir kelime alın ve bu kelimeyi 5 kez ekrana yazdıran bir kod yazın.
     * 	6.	do-while döngüsü kullanarak 1’den 20’ye kadar olan sayıları yazdırın.
     * 	7.	Bir döngü içinde “Java” kelimesini 3 kez ekrana yazdırın.
     * 	8.	Kullanıcıdan bir sayı alın ve 1’den bu sayıya kadar olan sayıların toplamını hesaplayan bir kod yazın.
     * 	9.	Bir for döngüsüyle 10’dan geriye doğru sayan bir program yazın.
     * 	10.	Bir döngü ile 0’dan 10’a kadar olan sayıların karesini ekrana yazdırın.
     *
     */

    public static void main(String[] args) {

        //1.	for döngüsü kullanarak 1’den 10’a kadar olan sayıları ekrana yazdırın.

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //2.	Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayan bir program yazın.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        long faktoriyel=1;

        for (int i = 1; i <= num; i++) {
            faktoriyel *=i;
        }
        System.out.println(num+"! = "+faktoriyel);

        //3.	while döngüsü kullanarak 1’den 100’e kadar olan çift sayıları ekrana yazdırın.

        int sayi = 0;

        while (sayi <= 100) {
            if (sayi % 2 == 0) {
                System.out.println(sayi);
            }
            sayi++;
        }

        //4.	1 ile 50 arasındaki sayılardan 5’in katlarını yazdıran bir döngü yazın.

        for (int i = 1; i <= 50; i++) {
            if(i%5==0) System.out.println(i);
        }

        //5.	Kullanıcıdan bir kelime alın ve bu kelimeyi 5 kez ekrana yazdıran bir kod yazın.

        System.out.println("bir kelime giriniz: ");
        String kelime = sc.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.println(kelime);
        }

        //6.	do-while döngüsü kullanarak 1’den 20’ye kadar olan sayıları yazdırın.
        int sayi2=1;
        do {
            System.out.println(sayi2);
            sayi2++;
        }while(sayi2<=20);

        //7.	Bir döngü içinde “Java” kelimesini 3 kez ekrana yazdırın.

        String str1="Java";

        for (int i = 1; i <= 3; i++) {
            System.out.println(str1);
        }
        //	8.	Kullanıcıdan bir sayı alın ve 1’den bu sayıya kadar olan sayıların toplamını hesaplayan bir kod yazın.

        System.out.println("bir sayi girin : ");
        int sayi3 = sc.nextInt();
        int toplam=0;
        for (int i = 1; i <= sayi3; i++) {
            toplam+=i;
        }
        System.out.println(toplam);

        //9.	Bir for döngüsüyle 10’dan geriye doğru sayan bir program yazın.

        for (int i = 10; i >0; i--) {
            System.out.println(i);
        }

        //10.	Bir döngü ile 0’dan 10’a kadar olan sayıların karesini ekrana yazdırın.

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " karesi: " + (i * i));
        }

    }
}
