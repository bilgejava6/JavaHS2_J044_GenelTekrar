package com.sercan.KararYapilari;


import java.util.Scanner;

import static com.serkankilicdere.degiskenler.zor.Zor.sayi;

public class Runner_Kolay {
    public static void main(String[] args) {
        /***Kolay
         * 	1.	Kullanıcıdan bir sayı alın ve pozitif mi negatif mi olduğunu kontrol edin.
         * 	2.	Kullanıcıdan bir sayı alın ve bu sayının çift mi tek mi olduğunu yazdıran bir program yazın.
         * 	3.	Kullanıcıdan bir yaş değeri alın ve bu yaşa göre “Çocuk”, “Genç”, veya “Yetişkin” yazdırın.
         * 	4.	Bir karakter alın ve bu karakterin sesli harf olup olmadığını kontrol eden bir kod yazın.
         * 	5.	Kullanıcıdan bir not girilmesini isteyin ve bu nota göre “Geçti” veya “Kaldı” yazdırın.
         * 	6.	Kullanıcıdan bir gün adı alın ve bu günün hafta içi mi hafta sonu mu olduğunu kontrol edin.
         * 	7.	Bir sayının 0, 1 veya diğer durumlarını kontrol eden bir if yapısı yazın.
         * 	8.	Kullanıcıdan bir rakam girilmesini isteyin ve bu rakamın İngilizce karşılığını yazdırın.
         * 	9.	Kullanıcıdan bir sayı alın ve bu sayının 3 ve 5 ile bölünebilirliğini kontrol edin.
         * 	10.	Kullanıcıdan bir ay numarası alın ve bu ayın kaç gün olduğunu yazdırın.
         *
         */
        cevap9();
    }

    public static void cevap1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi=sc.nextInt();
        if (sayi>0){
            System.out.println("Girdiğiniz sayı pozitiftir.");
        }else {
            System.out.println("Girdiğiniz sayı negatiftir.");
        }
    }

    public static void cevap2(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi=sc.nextInt();
        if (sayi %2 ==0){
            System.out.println("Girdiğiniz sayi çifttir.");
        }else {
            System.out.println("Girdiğiniz sayi tektir.");
        }
    }

    public static void cevap3(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir yas giriniz : ");
        int yas=sc.nextInt();
        if (yas<18 && yas>0){
            System.out.println("Çocuk");
        } else if (yas>=18 && yas <30) {
            System.out.println("Genç");

        }else if (yas>30){
            System.out.println("Yetişkin");
        }else {
            System.out.println("Girdiğiniz değeri kontrol edin.");
        }

    }

    public static void cevap4(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir karakter giriniz : ");
        char karakter=sc.next().toLowerCase().charAt(0);
        if (karakter =='a' || karakter=='e' || karakter=='ı' ||
            karakter=='i'  || karakter=='u' || karakter=='ü' ||
            karakter=='o'  || karakter=='ö'){
            System.out.println("Sesli harftir.");
        }else System.out.println("Sesli harf değildir.");


    }

    public static void cevap5(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir not giriniz : ");
        int not=sc.nextInt();
        if (not<0 && not >100 ){
            System.out.println("Girdiğiniz not geçerli değildir.");
        } else if (not>0 && not<50) {
            System.out.println("Kaldı");
        }else {
            System.out.println("Geçti");
        }
    }

    public static void cevap6(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir günadı giriniz : ");
        String gunAdi=sc.nextLine().toLowerCase();
        switch (gunAdi){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Hafta içi bir gündür"); break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu bir gündür"); break;
            default:
                System.out.println("Geçersiz bir günadı girdiniz");
        }

    }

    public static void cevap7(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi=sc.nextInt();
        if (sayi ==0){
            System.out.println(" Girdiğiniz sayi : "+sayi);

        } else if (sayi==1) {
            System.out.println("Girdiğiniz sayi : "+sayi );
        }else {
            System.out.println("Girdiğiniz sayi : "+sayi);
        }
    }

    public static void cevap8(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir rakam giriniz : ");
        int rakam=sc.nextInt();
        switch (rakam){
            case 0:
                System.out.println("Zero");break;
            case 1:
                System.out.println("One");break;
            case 2:
                System.out.println("Two");break;
            case 3 :
                System.out.println("Three");break;
            case 4:
                System.out.println("Four");break;
            case 5:
                System.out.println("Five");break;
            case 6:
                System.out.println("Six");break;
            case 7:
                System.out.println("Seven");break;
            case 8:
                System.out.println("Eight");break;
            case    9:
                System.out.println("Nine");break;
            default:
                System.out.println("Geçersiz giriş.Lütfen rakam giriniz");
        }
    }

    public static void cevap9(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi=sc.nextInt();
        if (sayi %3 ==0 && sayi%5==0){
            System.out.println("Girdiğiniz sayi 3 ve 5 e bölünebilir");
        }else System.out.println("Girdiğiniz sayi 3 ve 5 e bölünemez.");
    }

    public static void cevap10(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir ay numarası giriniz : ");
        int ayNo=sc.nextInt();
        int gunSayisi=0;
        switch (ayNo){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                gunSayisi=31; break;
            case 4: case 6: case 9: case 11:
                gunSayisi=30;break;
            case 2: gunSayisi=28;break;
            default:
                System.out.println("Geçersiz ay numarası girdiniz");

        }
        System.out.println(ayNo+". ay "+ gunSayisi+ " gündür.");

    }
}
