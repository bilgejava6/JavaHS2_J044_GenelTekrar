package com.mberkan;

import java.util.Scanner;

public class RunnerStringZor {
    public static void main(String[] args) {
    cevap2();
    }
    static void cevap1(){
        System.out.println("Lutfen bir metin giriniz");
        String ifade = new Scanner(System.in).nextLine();
        String[] kelimeler = ifade.split(" ");
        StringBuilder tersCumle = new StringBuilder();
        for(int i = kelimeler.length-1; i >= 0; i--){
            tersCumle.append(kelimeler[i]).append(" ");
        }
        System.out.println(tersCumle.toString());
    }
    static void cevap2(){
    

    }
}
