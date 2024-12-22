package com.sercan.KararYapilari;

import java.util.Scanner;

public class Runner_Orta {
    public static void main(String[] args) {
        /*** Orta
         * 	1.	Kullanıcıdan iki sayı alın ve büyüğünü ekrana yazdıran bir kod yazın.
         * 	2.	Kullanıcıdan bir not alın ve bu nota göre harf notu (A, B, C, vb.) yazdırın.
         * 	3.	Kullanıcıdan bir yıl alın ve bu yılın artık yıl olup olmadığını kontrol edin.
         * 	4.	Bir karakter alın ve bu karakterin büyük harf, küçük harf veya sayı olup olmadığını kontrol eden bir program yazın.
         * 	5.	Kullanıcıdan üç sayı alın ve en büyüğünü bulan bir kod yazın.
         * 	6.	Kullanıcıdan bir sayı alın ve bu sayının hangi çeyreğe (0-25, 26-50, vb.) düştüğünü kontrol edin.
         * 	7.	Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisinde olup olmadığını kontrol edin.
         * 	8.	Kullanıcıdan bir gün adı alın ve bu güne göre bir öneri yazdırın (örneğin: “Pazartesi: Yeni haftaya başlıyoruz!”).
         * 	9.	Bir switch ifadesi kullanarak bir hesap makinesi yazın (toplama, çıkarma, çarpma, bölme).
         * 	10.	Kullanıcıdan bir kelime alın ve bu kelimenin uzunluğuna göre farklı mesajlar yazdırın.
         *
         */
        cevap1();
    }

    public static void cevap1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz : ");
        int sayi1=sc.nextInt();
        System.out.print("İkinci sayiyi giriniz : ");
        int sayi2=sc.nextInt();
        if (sayi1>sayi2){
            System.out.println("Büyük sayi : "+sayi1);
        }else {
            System.out.println("Büyük sayi : "+sayi2);
        }

    }

    public static void cevap2(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Notunuzu giriniz : ");
        int not=sc.nextInt();
        if (not<0 && not >100){
            System.out.println("Girilen not değeri yanlıştır.");
        } else if (not>=0 && not<45) {
            System.out.println("E");

        } else if (not>=45 && not< 60) {
            System.out.println("D");
        } else if (not>=60 && not<70) {
            System.out.println("C");
        }else if (not>=70 && not<85){
            System.out.println("B");
        }else
            System.out.println("A");

    }

    public static void cevap3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz : ");
        int yil=sc.nextInt();
        if ( yil%4==0 ){
            System.out.println("Artık yıldır");
        }else System.out.println("Artık yıl değildir.");
    }

    public static void cevap4(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir karakter giriniz : ");
        char karakter=sc.next().charAt(0);

        if (Character.isUpperCase(karakter)){
            System.out.println("Büyük harftir.");
        } else if (Character.isLowerCase(karakter)) {
            System.out.println("Küçük harftir.");
        }else if (Character.isDigit(karakter)){
            System.out.println("Bir sayıdır");
        }else
            System.out.println("Bir harf veya sayı değildir.");

    }

    public static void cevap5(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz : ");
        int sayi1=sc.nextInt();
        System.out.print("İkinci sayiyi giriniz : ");
        int sayi2=sc.nextInt();
        System.out.println("Üçüncü sayıyı giriniz : ");
        int sayi3=sc.nextInt();
        int enb=sayi1;

        if (sayi2>enb){
            enb=sayi2;
        }else if (sayi3>enb){
            enb=sayi3;
        }
        System.out.println("En büyük sayi :"+enb);
    }
    
    public static void cevap6(){
        Scanner sc=new Scanner(System.in);
        System.out.println("0-100 arasında bir sayı giriniz : ");
        int sayi=sc.nextInt();
        if (sayi<0 && sayi>100){
            System.out.println("Girilen değer yanlıştır.");
        } else if (sayi>=0 && sayi< 25) {
            System.out.println("Birinci çeyrek");
        } else if (sayi>=25 && sayi<50) {
            System.out.println("İkinci çeyrek");
        } else if (sayi>=50 && sayi<75) {
            System.out.println("Üçüncü çeyrek");
        } else if (sayi>=75 &&sayi<100) {
            System.out.println("Dördüncü çeyrek");
        }
    }

    public static void cevap7(){

    }

    public static void cevap8(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir günadı giriniz :");
        String gunAdi=sc.nextLine().toLowerCase().trim();
        switch (gunAdi){
            case "pazartesi":
                System.out.println(gunAdi+": Yeni bir haftaya başlıyoruz"); break;
            case "salı":
                System.out.println(gunAdi+": haftanın ikinci günüdür.");
            case "çarşamba":
                System.out.println(gunAdi+": haftanın ortası ");
            case "perşembe":
                System.out.println(gunAdi+": hafta bitimine yaklaştık.");
            case "cuma":
                System.out.println(gunAdi+": tatil için son gün ");
            case "cumartesi":
                System.out.println(gunAdi+": dinlenme zamanı");
            case "pazar":
                System.out.println(gunAdi+": haftanın son günü");
            default:
                System.out.println("Geçersiz bir gün adı girdiniz.");
        }
    }
}
