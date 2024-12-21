package com.elifcan.donguler;

import java.util.Scanner;

public class Runner_Donguler_Kolay {
    public static void main(String[] args) {
        cevap10();
        System.out.println(cevap8(3));
    }
    private static void cevap1(){
        for( int i = 1 ; i < 11 ; i++){
            System.out.println(i);
        }
    }
    private static int cevap2(int sayi){
        int k = 1;
        for( int i = sayi ; i > 0 ; i--){
            k *= i;
        }
        return k;
    }
    private static void cevap3(){
        int sayi = 2;
        while (sayi <= 100) {
            System.out.println(sayi);
            sayi += 2;
        }
    }
    private static void cevap4(){
        for( int i = 1 ; i <= 50 ; i++){
            if( i % 5 == 0)
            System.out.println(i);
        }
    }
    private static void cevap5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen kelime giriniz : ");
        String cvp = sc.nextLine();
        for( int i = 0 ; i < 5 ; i++){
            System.out.println(cvp);
        }
    }
    private static void cevap6(){
        int i = 1;
        do{
            System.out.println(i);
            i++;

        }while( i != 21);
    }
    private static void cevap7(){
        for( int i = 0 ; i < 3 ; i++){
            System.out.println("Java");
        }
    }
    private static int cevap8(int sayi) {
        int k = 0;
        for (int i = sayi; i > 0; i--) {
            k += i;
        }
        return k;
    }
    private static void cevap9() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
    private static void cevap10() {
        for ( int i = 0 ; i <= 10 ; i++) {
            System.out.println(i*i);
        }
    }
}
