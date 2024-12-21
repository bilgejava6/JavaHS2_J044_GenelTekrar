package com.mberkan;

import java.util.Scanner;

public class RunnerStringKolay {
    public static void main(String[] args) {
    cevap10();

    }
    static void cevap1(){
        String str = "Bugun hava cok yagmurlu";
        System.out.println(str.length());
    }
    static void cevap2(){
        String ifade = "Java Programlama";
        System.out.println(ifade.toUpperCase());
    }
    static void cevap3(){
        System.out.println("Lutfen bir metin giriniz..");
        String metin = new Scanner(System.in).nextLine();
        System.out.println(metin.charAt(0));
    }
    static void cevap4(){
        String ifade = "Merhaba Dunya";
        System.out.println(ifade.indexOf("Dunya"));
    }
    static void cevap5(){
        String ifade = "Merhaba Dunya";
        String ters = new StringBuilder(ifade).reverse().toString();
        System.out.println(ters);
    }
    static void cevap6(){
        System.out.println("Lutfen birinci ifadeyi giriniz..");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Lutfen ikinci ifadeyi giriniz..");
        String str2 = new Scanner(System.in).nextLine();
        if(str1.equals(str2))
            System.out.println("esittir");
        else System.out.println("esit degildir.");

    }
    static void cevap7(){
        String ifade = " ";
        if(ifade.isEmpty()) System.out.println("ifade bostur");
        else System.out.println("ifade bos degildir");
        String str = " ";
        if(str.isBlank()) System.out.println("str bostur");
        else System.out.println("str bos degildir");
    }
    static void cevap8(){
        String ifade = "Java cok eglenceli!";
        System.out.println(ifade.replace(" ",""));
    }
    static void cevap9(){
        System.out.println("Lutfen bir cumle giriniz..");
        String str = new Scanner(System.in).nextLine();
        System.out.println(str.contains("a"));
    }
    static void cevap10(){
        String hello = "Hello";
        String world = "World";
        System.out.println(hello.concat(" " +world));
    }

}
