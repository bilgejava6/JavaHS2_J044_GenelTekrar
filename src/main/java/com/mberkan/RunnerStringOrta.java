package com.mberkan;

import java.util.Scanner;

public class RunnerStringOrta {
    public static void main(String[] args) {
    cevap6();
    }
    static void cevap1(){
        String metin = "Bugun hava cok yagmurlu yarin umarim gunes acar";
        String ters = new StringBuilder(metin).reverse().toString();
        System.out.println(ters);
    }
    static void cevap2(){
        System.out.println("Lutfen bir cumle giriniz..");
        String str = new Scanner(System.in).nextLine();
        int karakterSayisi = str.split(" ").length;
        System.out.println(karakterSayisi);
    }
    static void cevap3(){
        String ifade = "Bugün hava çok güzel";
        System.out.println(ifade.replace("a","e"));
    }
    static void cevap4(){
        String ifade = "Bugun 21 12 2024 de java kursumuzda tekrar 5 ettik";
        String yeniIfade = ifade.replace("21 12 2024 ","").replace("5","");
        System.out.println(yeniIfade);

    }
    static void cevap5(){
        System.out.println("Lutfen bir kelime giriniz..");
        String str = new Scanner(System.in).nextLine();
        String ters = new StringBuilder(str).reverse().toString();
        if(str.equals(ters)){
            System.out.println("Bu kelime palindromedir");
        }else System.out.println("Palindrome degildir.");
    }
    static void cevap6(){
        System.out.println("Lutfen bir kelime giriniz..");
        String str = new Scanner(System.in).nextLine();
        for (int i = 0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }

}