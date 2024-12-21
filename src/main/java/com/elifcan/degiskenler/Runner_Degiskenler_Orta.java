package com.elifcan.degiskenler;

import java.util.Scanner;

public class Runner_Degiskenler_Orta {
    public static void main(String[] args) {
        cevap9();
    }
    private static int cevap1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz : ");
        int yas = sc.nextInt();
        return yas;
    }
    private static void cevap2(){
        final int deger = 15;
        // deger = 17;
        // final değeri bir değer atayamazsın hatası verilmektedir. Değer final olarak atandıysa değişim yapılamaz.
    }
    private static String cevap3(){
        String ad = "Elifcan";
        String soyad = "Göktepe";
        return ad + " " + soyad;
    }
    private static void cevap4(){
        int integer = 5;
        double doublee = 2.45d;
        System.out.println(integer+doublee); // sonuc 7.45'tir yani double sonuç çıkmıştır.
    }
    private static void cevap5(){
        String ad = "123";
        int adInt = Integer.parseInt((String) ad);
        System.out.println(adInt + 156);
    }
    private static void cevap6(){
        long buyuk = 1_000_000_000_000L; // 64 bit uzunluğundadır. Max 9,223,372,036,854,775,807 , Min  -9,223,372,036,854,775,808   değerleri arasındadı
        System.out.println(buyuk);
    }
    private static void cevap7(){
        int degisken = 5;
        System.out.println(degisken);
        float degiskeni = (int) 5 ;
        System.out.println(degiskeni);
        String yeni = String.valueOf((float) degiskeni);
        System.out.println(yeni);
    }
    private static void cevap8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");
        String str = sc.nextLine();
        System.out.println("Kelimenin uzunluğu : " + str.length());
    }
    private static void cevap9(){
        short shortt;
        int integer = 321_7698;
        shortt = (short) integer;
        System.out.println(shortt);
        // hata alınmaz fakat sayı rotate eder ve minimum değerinden saymaya tekrar başlar ve Max 32,767 , Min -32,768 değerleri arasında değer döner
    }

}
