package com.mberkan;

import java.util.Scanner;

public class RunnerKararYapilariOrta {
    public static void main(String[] args) {
        cevap10();
    }
    static void cevap1(){
        System.out.println("Birinci sayiyi giriniz.");
        int sayi1 = new Scanner(System.in).nextInt();
        System.out.println("İkinci sayiyi giriniz.");
        int sayi2 = new Scanner(System.in).nextInt();
        int max = sayi2;
        if(sayi1 > sayi2){
            max = sayi1;
            System.out.println("En buyuk sayi " + max);
        }
        System.out.println("En buyuk sayi " +max);
    }
    static void cevap2(){
        System.out.println("Lutfen notunuzu giriniz..");
        int not = new Scanner(System.in).nextInt();
        if(not<50) System.out.println("D");
        else if(not>=50 && not<60) System.out.println("C");
        else if (not>=60 && not<80) System.out.println("B");
        else if (not>=80 && not<=100) System.out.println("A");
        else System.out.println("Lutfen gecerli bir not giriniz");


    }
    static void cevap3(){
        System.out.println("Lutfen bir yil giriniz");
        int yil = new Scanner(System.in).nextInt();
        if(yil>=2024) System.out.println("Gecerli bir yil");
        else System.out.println("Gecersiz bir yil");
    }
    static void cevap4(){
        System.out.println("Lutfen bir karakter giriniz.");
        char karakter = new Scanner(System.in).next().charAt(0);
        if(Character.isUpperCase(karakter)) System.out.println("Buyuk harfi");
        else if (Character.isLowerCase(karakter)) System.out.println("Kucuk Harf");
        else if (Character.isDigit(karakter)) System.out.println("Numara");
        else System.out.println("Farkli bir sey");
    }
    static void cevap5(){
        System.out.println("Lutfen birinci sayiyi giriniz.");
        int s1= new Scanner(System.in).nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz.");
        int s2= new Scanner(System.in).nextInt();
        System.out.println("Lutfen ucuncu sayiyi giriniz.");
        int s3= new Scanner(System.in).nextInt();

        int max = s1;
        if(s2>s3 && s2>s1) {
            max = s2;
            System.out.println("En buyuk sayi " + max);
        }else if(s3>s2 && s3>s1) {
            max = s3;
            System.out.println("En buyuk sayi " + max);
        }else System.out.println("En buyuk sayi " +max);


    }
    static void cevap6(){
        System.out.println("Lutfen bir sayi giriniz.");
        int sayi = new Scanner(System.in).nextInt();
        if (sayi >= 0 && sayi <= 25) {
            System.out.println("Sayi 0-25 çeyreğine düşüyor.");
        } else if (sayi >= 26 && sayi <= 50) {
            System.out.println("Sayi 26-50 çeyreğine düşüyor.");
        } else if (sayi >= 51 && sayi <= 75) {
            System.out.println("Sayi 51-75 çeyreğine düşüyor.");
        } else if (sayi >= 76 && sayi <= 100) {
            System.out.println("Sayi 76-100 çeyreğine düşüyor.");
        } else {
            System.out.println("Sayi 0-100 aralığında değil.");
        }

    }
    static void cevap7(){
        // Bakacağım...
    }
    static void cevap8(){
        System.out.println("Lutfen bir gun giriniz");
        String gun = new Scanner(System.in).nextLine();
        String[] gunler = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};

        if(gun.equalsIgnoreCase(gunler[0])) System.out.println("Haftanin ilk gunu");
        else if(gun.equalsIgnoreCase(gunler[1])) System.out.println("Pazartesi'yi atlattın, sırada haftanın ritmini bulmak var!");
        else if(gun.equalsIgnoreCase(gunler[2])) System.out.println("Haftanın tam ortası");
        else if(gun.equalsIgnoreCase(gunler[3])) System.out.println("Hafta sonu yaklaşıyor");
        else if(gun.equalsIgnoreCase(gunler[4])) System.out.println("keyif moduna geçiş başlasın");
        else if(gun.equalsIgnoreCase(gunler[5])) System.out.println("Haftasonuuuu!!!!");
        else if(gun.equalsIgnoreCase(gunler[6])) System.out.println("Şarj günü! Yeni haftaya hazırlanmanın zamanı geldi");
        else System.out.println("Lutfen gecerli gun giriniz");




    }
    static void cevap9(){
        System.out.print("Birinci sayiyi giriniz : ");
        double sayi1 = new Scanner(System.in).nextDouble();

        System.out.print("Ikinci sayiyi giriniz  : ");
        double sayi2 = new Scanner(System.in).nextDouble();

        System.out.println("Islem seçin: ");
        System.out.println("1- Toplama");
        System.out.println("2- Cikarma");
        System.out.println("3- Carpma");
        System.out.println("4 - Bolme");
        int secim = new Scanner(System.in).nextInt();
        double sonuc = 0;

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuc : " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuc : " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuc : " + sonuc);
                break;
            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuc : " + sonuc);
                } else {
                    System.out.println("Sifira bolunemez");
                }
                break;
            default:
                System.out.println("Gecersiz islem");
                break;
        }

    }
    static void cevap10(){
        System.out.print("Bir kelime girin: ");
        String kelime = new Scanner(System.in).nextLine();

        int uzunluk = kelime.length();

        if (uzunluk == 0) {
            System.out.println("Girdiğiniz kelime boş.");
        } else if (uzunluk <= 4) {
            System.out.println("Kelime çok kısa.");
        } else if (uzunluk <= 6) {
            System.out.println("Kelime kısa.");
        } else if (uzunluk <= 10) {
            System.out.println("Kelime orta uzunlukta.");
        } else {
            System.out.println("Kelime uzun.");
        }
    }
}
