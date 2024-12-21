package com.mberkan;

import java.util.Scanner;

public class RunnerStringOrta {
    public static void main(String[] args) {
    cevap2();
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

    }

}