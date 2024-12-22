package com.serkankilicdere.kararYapilari.kolay;

import java.util.Scanner;

public class Kolay {


    /*
    Kolay
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

    public static void main(String[] args) {

        //1.	Kullanıcıdan bir sayı alın ve pozitif mi negatif mi olduğunu kontrol edin.

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi giriniz ");
        int sayi1 = sc.nextInt();
        if(sayi1<0){
            System.out.println("negatif");
        }else if(sayi1>0){
            System.out.println("pozitif");
        }else{
            System.out.println("syaı degeri sifir");
        }

        System.out.println("""
                ------------------------------------------
                """);

        //2.	Kullanıcıdan bir sayı alın ve bu sayının çift mi tek mi olduğunu yazdıran bir program yazın.

        System.out.println("bir sayi giriniz ");
        int sayi2 = sc.nextInt();
        if(sayi2%2==0){
            System.out.println("cifttir");
        }
        if(sayi2%2==1){
            System.out.println("tektir");
        }

        System.out.println("""
                ------------------------------------------
                """);

        //3.	Kullanıcıdan bir yaş değeri alın ve bu yaşa göre “Çocuk”, “Genç”, veya “Yetişkin” yazdırın.

        System.out.println("yasiniz giriniz");
        int yas= sc.nextInt();

        if(yas>0 && yas<18){
            System.out.println("cocuksun");
        }
        if(yas>18 && yas<29){
            System.out.println("gencsin");
        }
        if(yas>29){
            System.out.println("yetiskinsin");
        }

        System.out.println("""
                ------------------------------------------
                """);

        //4.	Bir karakter alın ve bu karakterin sesli harf olup olmadığını kontrol eden bir kod yazın.

        System.out.println("karakter giriniz ");
        char karakter=sc.next().toLowerCase().charAt(0);

        if(karakter=='a' || karakter=='e' || karakter=='i'||karakter=='o'||karakter=='u'||karakter=='ö'||karakter=='ü'||karakter=='ı'){
            System.out.println("seslidir");
        }else{
            System.out.println("sesli degildir");
        }

        System.out.println("""
                ------------------------------------------
                """);

        //* 	5.	Kullanıcıdan bir not girilmesini isteyin ve bu nota göre “Geçti” veya “Kaldı” yazdırın.

        System.out.println("notunuzu giriniz");
        int not= sc.nextInt();
        if(not<45 && not>0 ){
            System.out.println("kaldiniz");
        }
        if(not>45 && not<100){
             System.out.println("gectiniz");
        }

        System.out.println("""
                ------------------------------------------
                """);

        //6.	Kullanıcıdan bir gün adı alın ve bu günün hafta içi mi hafta sonu mu olduğunu kontrol edin.
        System.out.println("gunu giriniz");
        String gun= sc.nextLine();
        switch (gun){
            case "cumartesi","pazar": System.out.println("hafta sonu");
            break;
            default: System.out.println("hafta icidir");

        }

        System.out.println("""
                ------------------------------------------
                """);

        //7.	Bir sayının 0, 1 veya diğer durumlarını kontrol eden bir if yapısı yazın.

        System.out.println("sayi giriniz");
        int girilenSayi= sc.nextInt();
        if(girilenSayi==0 || girilenSayi>1){
            System.out.println("sayi sifir veya birdir");
        }else{
            System.out.println("sayi sifir veya birden farklidir");
        }

        //8.	Kullanıcıdan bir rakam girilmesini isteyin ve bu rakamın İngilizce karşılığını yazdırın.

        System.out.println("rakam giriniz");
        int rakam= sc.nextInt();

        switch (rakam){
            case 0: System.out.println("zero");
            break;
            case 1: System.out.println("one");
            break;
            case 2: System.out.println("two");
            break;
            case 3: System.out.println("three");
            break;
            case 4: System.out.println("four");
            break;
            case 5: System.out.println("five");
            break;
            case 6: System.out.println("six");
            break;
            case 7: System.out.println("seven");
            break;
            case 8: System.out.println("eight");
            break;
            case 9: System.out.println("nine");
            break;
            default: System.out.println("rakam giriniz");
        }

        System.out.println("""
                ------------------------------------------
                """);

        //9.	Kullanıcıdan bir sayı alın ve bu sayının 3 ve 5 ile bölünebilirliğini kontrol edin.

        System.out.println("sayi giriniz");
        int sayi= sc.nextInt();

        if(sayi%3==0){
            System.out.println("3e bolunen");
        }
        if(sayi%5==0){
            System.out.println("5e bolunen");
        }
        if(sayi%3==0 && sayi%5==0){
            System.out.println("3e ve 5e bolunen");
        }

        //10.	Kullanıcıdan bir ay numarası alın ve bu ayın kaç gün olduğunu yazdırın.

        System.out.println("kacinci ay?");
        int kacAy= sc.nextInt();

        switch (kacAy){
            case 1,3,5,7,8,10,12: System.out.println("31");
            break;
            case 2,4,6,9,11: System.out.println("30");
            break;
            default: System.out.println("kacinci ay?");

        }

    }
}
