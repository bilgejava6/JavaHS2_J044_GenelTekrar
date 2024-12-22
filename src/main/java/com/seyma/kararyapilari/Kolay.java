package com.seyma.kararyapilari;

import java.util.Scanner;

public class Kolay {
    /**
     * 	1.	Kullanıcıdan bir sayı alın ve pozitif mi negatif mi olduğunu kontrol edin.
     *  2.	Kullanıcıdan bir sayı alın ve bu sayının çift mi tek mi olduğunu yazdıran bir program yazın.
     * 	3.	Kullanıcıdan bir yaş değeri alın ve bu yaşa göre “Çocuk”, “Genç”, veya “Yetişkin” yazdırın.
     *  4.	Bir karakter alın ve bu karakterin sesli harf olup olmadığını kontrol eden bir kod yazın.
     *  5.	Kullanıcıdan bir not girilmesini isteyin ve bu nota göre “Geçti” veya “Kaldı” yazdırın.
     *  6.	Kullanıcıdan bir gün adı alın ve bu günün hafta içi mi hafta sonu mu olduğunu kontrol edin.
     *  7.	Bir sayının 0, 1 veya diğer durumlarını kontrol eden bir if yapısı yazın.
     *  8.	Kullanıcıdan bir rakam girilmesini isteyin ve bu rakamın İngilizce karşılığını yazdırın.
     *  9.	Kullanıcıdan bir sayı alın ve bu sayının 3 ve 5 ile bölünebilirliğini kontrol edin.
     *  10.	Kullanıcıdan bir ay numarası alın ve bu ayın kaç gün olduğunu yazdırın.
     *
     */

    public static void main(String[] args) {
        soru10();


    }


    public static void soru1(){
        System.out.println("Bir sayı giriniz ( + veya - )");
        int sayi = new Scanner(System.in).nextInt();

        if(sayi > 0){
            System.out.println("Sayınız pozitif sayı");
        }else
            System.out.println("Sayınız negatif bir sayı");

    }

    public static void soru2(){
        System.out.println("Bir sayı giriniz...:");
        int sayi1 = new Scanner(System.in).nextInt();

        if(sayi1%2==0){
            System.out.println("çift sayı");
        }else
            System.out.println("Tek sayı");

    }

    public static void soru3(){
        System.out.println("Yaşınızı giriniz...:");;
        int yas = new Scanner(System.in).nextInt();
        if(yas>0 && yas<16){
            System.out.println("Çocuk");
        } else if (yas>=16 && yas<35) {
            System.out.println("Genç");
        }else if (yas>=35 && yas<45) {
            System.out.println("Yetişkin");
        }else
            System.out.println("Diğer yaş grupları");
    }

    public static void soru4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir karakter giriniz...:");
        char karakter = scanner.next().toLowerCase().charAt(0);
        if(karakter=='a' || karakter=='e' || karakter=='i'|| karakter=='o' || karakter=='u'||karakter=='ı'|| karakter=='ö'){
            System.out.println("Sesli harf girdiniz..");

        }else
            System.out.println("Sesli harf değildir..");

    }

    public static void soru5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunu giriniz...:");
        int exam = new Scanner(System.in).nextInt();
        if(exam>0 && exam<45){
            System.out.println("Kaldı");
        } else if (exam>=45 && exam<=100) {
            System.out.println("Geçti");
        }else
            System.out.println("Geçerli not girinzi");
    }

    public static void soru6() {

        System.out.println("Haftanın bir gününü yazınız...:");
        String gun = new Scanner(System.in).nextLine().toLowerCase();

        switch (gun){
            case "pazartesi":
            case "salı":
            case "çarsamba":
            case "persembe":
            case "cuma":
                System.out.println("Haftaiçi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                  System.out.println("geçersiz gün");

        }

    }

    public static void soru7(){

    }

    public static void soru8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir rakam giriniz(0-9)..:");
        int rakam = new Scanner(System.in).nextInt();

        switch (rakam){
            case 0: System.out.println("Zero");break;
            case 1: System.out.println("One");break;
            case 2: System.out.println("Two");break;
            case 3: System.out.println("Three");break;
            case 4: System.out.println("Four");break;
            case 5: System.out.println("Five");break;
            case 6: System.out.println("Six");break;
            case 7: System.out.println("Seven");break;
            case 8: System.out.println("Eight");break;
            case 9: System.out.println("Nine");break;
            default:
                System.out.println("Rakam girmeniz gerekmektedir..");

        }

    }

    public static void soru9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...:");
        int sayi2 = new Scanner(System.in).nextInt();
        if(sayi2%3==0 && sayi2%5==0){
            System.out.println("Bu sayı 3 ve 5 e tam bölünür");
        }else
            System.out.println("tam bölünmez");
    }

    public static void soru10(){
        System.out.println("""
                *******AYLAR****
                1-OCAK
                2-ŞUBAT
                3-MART
                4-NİSAN
                5-MAYIS
                6-HAZİRAN
                7-TEMMUZ
                8-AĞUSTOS
                9-EYLÜL
                10-EKİM
                11-KASIM
                12-ARALIK
                0-ÇIKIŞ""");
        System.out.print("AY SEÇİNİZ.....:");
        int ay = new Scanner(System.in).nextInt();
        switch (ay){
            case 1,3,5,7,8,10,12: System.out.println("31 gün sürer");break;
            case 4,6,9,11: System.out.println("30 gün sürer");break;
            case 2: System.out.println("28 gün sürer");break;
            default:
                System.out.println("Geçerli giriş yapınız..:");

        }
    }







}
