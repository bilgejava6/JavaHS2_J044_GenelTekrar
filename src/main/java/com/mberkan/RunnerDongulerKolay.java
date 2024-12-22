package com.mberkan;

import java.util.Scanner;

public class RunnerDongulerKolay {
    public static void main(String[] args) {
        cevap10();
    }
    static void cevap1(){
        for (int i = 1; i<10;i++){
            System.out.println(i);
        }
    }
    static void cevap2(){
        System.out.println("Lutfen bir sayi girin");
        int sayi = new Scanner(System.in).nextInt();
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++){
            faktoriyel *= i;

        }
        System.out.println(faktoriyel);
    }
    static void cevap3(){
        int sayi = 1;
        while (sayi <= 100){
            if(sayi%2 ==0) System.out.println(sayi);
            sayi++;
        }
    }
    static void cevap4(){
        for(int i = 1; i<=50;i++){
            if(i%5==0) System.out.println(i);
        }
    }
    static void cevap5(){
        System.out.println("Bir kelime giriniz");
        String str = new Scanner(System.in).next();
        for(int i=0;i<5;i++){
            System.out.println(str);
        }
    }
    static void cevap6(){
        int sayi = 1;
        do {
            System.out.println(sayi);
            sayi++;

        }while (sayi<21);
    }
    static void cevap7(){
            for(int i = 0; i<3;i++){
                System.out.println("Java");
            }
    }
    static void cevap8(){
        System.out.println("Lutfen bir sayi girin");
        int sayi = new Scanner(System.in).nextInt();
        int toplam = 0;
        for (int i = 0; i < sayi; i++){
            toplam = toplam + i;
        }
        System.out.println(toplam);
    }
    static void cevap9(){
        for (int i =10;i>0;i--)
            System.out.println(i);
    }
    static void cevap10(){
        for(int i = 0;i<10;i++){

            System.out.println(i+ " nin karesi : " +i*i);

        }
    }
}
