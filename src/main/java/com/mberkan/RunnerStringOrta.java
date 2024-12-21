package com.mberkan;

public class RunnerStringOrta {
    public static void main(String[] args) {
    cevap1();
    }
    static void cevap1(){
        String metin = "Bugun hava cok yagmurlu yarin umarim gunes acar";
        String ters = new StringBuilder(metin).reverse().toString();
        System.out.println(ters);
    }

}