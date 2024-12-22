package com.mberkan;

import java.util.Scanner;

public class RunnerKararYapilariKolay {
    public static void main(String[] args) {
    cevap10();
    }
    static void cevap1(){
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = new Scanner(System.in).nextInt();
        if(sayi<0) System.out.println("Negatif");
        else if(sayi>0) System.out.println("Pozitif");
        else System.out.println("Notr");
    }
    static void cevap2(){
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = new Scanner(System.in).nextInt();
        if(sayi %2 ==0) System.out.println("Cift");
        else if(sayi %2 ==1) System.out.println("Tek");
    }
    static void cevap3(){
        System.out.println("Lutfen yasinizi giriniz..");
        int yas = new Scanner(System.in).nextInt();
        if(yas<=16) System.out.println("Cocuk");
        else if(yas>16 && yas<24) System.out.println("Genc");
        else if(yas>24) System.out.println("Yetiskin");
        else System.out.println("Lutfen gecerli bir yas giriniz...");

    }
    static void cevap4(){
        System.out.println("Lutfen bir karakter giriniz.");
        char karakter = new Scanner(System.in).next().charAt(0);
        char[] charList = {'a','e','i','o','u'};
        for (int i = 0; i < charList.length; i++) {
            if(karakter == charList[i]) System.out.println("Unlu harf");
            else System.out.println("Unsuz");
        }
    }
    static void cevap5(){
        System.out.println("Lutfen notunuzu giriniz...");
        int not = new Scanner(System.in).nextInt();
        if(not<50 && not>0) System.out.println("Kaldiniz!! :( ");
        else if(not>=50 && not<=100) System.out.println("Gectiniz.. :)");
        else System.out.println("Lutfen gecerli bir not giriniz...");
    }
    static void cevap6(){
        System.out.println("Lutfen gun adini giriniz");
        String gun= new Scanner(System.in).nextLine();
        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Bu bir hafta sonu günüdür.");
        } else if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba")
                || gun.equals("perşembe") || gun.equals("cuma")) {
            System.out.println("Bu bir hafta içi günüdür.");
        } else {
            System.out.println("Geçersiz bir gün adı girdiniz.");
        }


    }
    static void cevap7(){
        System.out.print("Bir sayı girin: ");
        int sayi = new Scanner(System.in).nextInt();

        if (sayi == 0) {
            System.out.println("Sayı 0'dır.");
        } else if (sayi == 1) {
            System.out.println("Sayı 1'dir.");
        } else {
            System.out.println("Sayı 0 veya 1 değildir.");
        }
    }
    static void cevap8(){
        System.out.println("lutfen bir rakam giriniz..");
        int rakam = new Scanner(System.in).nextInt();
        String[] karsilik = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.println(karsilik[rakam]);
    }
    static void cevap9(){
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = new Scanner(System.in).nextInt();
        if(sayi%3==0) System.out.println("Bu sayi 3 ile bolunebiliyor.");
        if(sayi%5==0) System.out.println("Bu sayi 5 ile bolunebiliyor.");
        if(sayi%3==0 && sayi%5==0) System.out.println("Bu sayi hem 3 ile bölünebiliyor hem de 5 ile..");
    }
    static void cevap10(){
        System.out.println("Lutfen bir ay numarasi giriniz.");
        int ay = new Scanner(System.in).nextInt();
        String[] gunSayilari = { "31", "28/29", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31" };
        System.out.println(gunSayilari[ay-1]);
    }
}
