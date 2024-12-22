package com.elifcan.kararyapilari;

import java.util.Scanner;

public class Runner_Kararypilari_Kolay {
    public static void main(String[] args) {
        cevap10(5);
    }
    private static void cevap1(int sayi){
        String negatif = "negatif";
        String pozitif = "pozitif";
        if(sayi < 0) {
            System.out.println(negatif);
        }
        if(sayi >= 0){
            System.out.println(pozitif);
        }
    }
    private static void cevap2(int sayi){
        if(sayi % 2 ==  0){
            System.out.println("Cift sayidir.");
        }
        if(sayi % 2 == 1){
            System.out.println("Tek sayidir.");
        }
    }
    private static void cevap3(int sayi){
        if(sayi < 12){
            System.out.println("Çocuk.");
        }
        else if(sayi < 18 ){
            System.out.println("Genç.");
        }
        else if(sayi > 18){
            System.out.println("Yetişkin.");
        }
    }
    private static void cevap4(char statement){
        if (statement == 'a' || statement == 'e' || statement == 'ı' || statement == 'i'
                || statement == 'o'|| statement == 'ö' || statement == 'u' || statement == 'ü'){
            System.out.println("Sesli Harf");
        }
        else{
            System.out.println("Sessiz Harf");
        }
    }
    private static void cevap5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Not giriniz : ");
        float sayi = sc.nextFloat();
        if(sayi < 50){
            System.out.println("Kaldı");
        }
        else if(sayi >= 50 && sayi <= 100){
            System.out.println("Geçti");
        }
    }
    private static void cevap6(){
        // TODO: hantal oluyor if kullanarak switch..case daha doğru
        Scanner sc = new Scanner(System.in);
        System.out.println("Gün giriniz : ");
        String gun = sc.nextLine();
        if(gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("cumartesi")){
            System.out.println("Haftasonu");
        }
        else if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("salı") || gun.equalsIgnoreCase("çarşamba")|| gun.equalsIgnoreCase("cuma") || gun.equalsIgnoreCase("perşembe")){
            System.out.println("Haftaiçi");
        }
    }
    private static boolean cevap7(int sayi){
        if (sayi == 1){
            return true;
        }
        else if(sayi == 0){
            return true;
        }
        else{
            return false;
        }
    }
    private static void cevap8(int rakam){
        switch (rakam){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 0:
                System.out.println("zero");
                break;
            default:
                System.out.println("There is no number called " + rakam);
        }
    }
    private static void cevap9(int sayi){
        if(sayi % 3 == 0 || sayi % 5 == 0){
            System.out.println(sayi + " 15'in katıdır.");
        }
        else{
            System.out.println("15'in katı değildir.");
        }
    }
    private static void cevap10(int sayi){
        switch (sayi){
            case 1:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
            default:
                System.out.println("There is no month numbered as " + sayi);
        }
    }
}
