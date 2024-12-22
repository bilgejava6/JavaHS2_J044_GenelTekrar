package com.sercan.Donguler;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Runner_Kolay {
    public static void main(String[] args) {
        /***Kolay
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
        cevap10();
    }
    public static void cevap1(){
        for (int i=0;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void cevap2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi=sc.nextInt();
        int sonuc=1;
        for (int i=sayi;i>0;i--){
            sonuc*=i;
        }
        System.out.println(sayi+ "'nın faktöriyeli : "+ sonuc);
    }

    public static void cevap3(){
        int sayi=1;
        while (sayi<=100){
            if (sayi %2==0){
                System.out.println(sayi);
            }
            sayi++;
        }
    }

    public static void cevap4(){

        for (int i=1;i<=50;i++){
            if (i % 5 == 0){
                System.out.println(i);
            }

        }

    }

    public static void cevap5(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime yazınız : ");
        String kelime=sc.next();
        for (int i=0;i<=5;i++) {
            System.out.println(kelime);
        }
    }

    public static void cevap6(){
        int sayi=0;
        do {
            sayi++;
            System.out.println(sayi);

        }while (sayi<20);
    }

    public static void cevap7(){
        for (int i=0;i<3;i++){
            System.out.println("Java");
        }
    }

    public static void cevap8(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi=sc.nextInt();
        int toplam=0;
        for (int i=1;i<sayi;i++){
            toplam+=i;
        }
        System.out.println(toplam);
    }

    public static void cevap9(){
        for (int i=10;i>0;i--){
            System.out.println(i);
        }
    }

    public static void cevap10(){
        for (int i=1;i<=10;i++){
            System.out.println(i +" sayısının karesi "+(i*i));
        }

    }
}
