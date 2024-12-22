package com.bekircan.kararYapilari;

import java.util.Scanner;

/**
 *          * 	1.	Kullanıcıdan bir sayı alın ve pozitif mi negatif mi olduğunu kontrol edin.
 *          * 	2.	Kullanıcıdan bir sayı alın ve bu sayının çift mi tek mi olduğunu yazdıran bir program yazın.
 *          * 	3.	Kullanıcıdan bir yaş değeri alın ve bu yaşa göre “Çocuk”, “Genç”, veya “Yetişkin” yazdırın.
 *          * 	4.	Bir karakter alın ve bu karakterin sesli harf olup olmadığını kontrol eden bir kod yazın.
 *          * 	5.	Kullanıcıdan bir not girilmesini isteyin ve bu nota göre “Geçti” veya “Kaldı” yazdırın.
 *          * 	6.	Kullanıcıdan bir gün adı alın ve bu günün hafta içi mi hafta sonu mu olduğunu kontrol edin.
 *          * 	7.	Bir sayının 0, 1 veya diğer durumlarını kontrol eden bir if yapısı yazın.
 *          * 	8.	Kullanıcıdan bir rakam girilmesini isteyin ve bu rakamın İngilizce karşılığını yazdırın.
 *          * 	9.	Kullanıcıdan bir sayı alın ve bu sayının 3 ve 5 ile bölünebilirliğini kontrol edin.
 *          * 	10.	Kullanıcıdan bir ay numarası alın ve bu ayın kaç gün olduğunu yazdırın.
 */


public class Karar_Yapilari_Kolay {
    public static void main(String[] args) {

        System.out.println("""
                *** 1. Soru ***
                """);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int soru1sayi1 = scanner.nextInt();

        if (soru1sayi1>0){
            System.out.println("Girilen sayi pozitif! -> " + soru1sayi1);
        }else if(soru1sayi1<0){
            System.out.println("Girilen sayi negatif! -> " + soru1sayi1);
        }else {
            System.out.println("Girilen sayi sıfır! -> " + soru1sayi1);
        }
        System.out.println("");
        System.out.println("""
                *** 2. Soru ***
                """);
        System.out.println("Bir sayı giriniz: ");
        int soru2sayi1 = scanner.nextInt();

        if (soru2sayi1 % 2 == 0){
            System.out.println("Girilen sayı çift! -> " + soru2sayi1);
        }else{
            System.out.println("Girilen sayı tek! -> " + soru2sayi1);
        }
        System.out.println("");
        System.out.println("""
                *** 3. Soru ***
                """);
        System.out.println("Bir yaşınızı giriniz: ");
        int soru3sayi1 = scanner.nextInt();

        if (soru3sayi1 >= 18){
            System.out.println("Yaşınız " + soru3sayi1 + " Yetişkin.");
        } else if (soru3sayi1 >= 12 && soru3sayi1 < 18 ) {
            System.out.println("Yaşınız " + soru3sayi1 + " Genç.");
        } else if (soru3sayi1 > 0 && soru3sayi1<12){
            System.out.println("Yaşınız " + soru3sayi1 + " Çocuk.");
        } else {
            System.out.println("Lütfen geçerli bir yaş giriniz!");
        }

        scanner.nextLine(); // bunu buraya koymadan 4. soru harf isteme çalışmıyor. Neden?

        System.out.println("");
        System.out.println("""
                *** 4. Soru ***
                """);
        System.out.println("Bir harf giriniz: ");
        String soru4 = scanner.nextLine().toLowerCase();

        if (soru4.equals("a") || soru4.equals("e") || soru4.equals("i") || soru4.equals("o") || soru4.equals("u")) {
            System.out.println("Sesli harf girdiniz!");
        } else {
            System.out.println("Sessiz harf girdiniz!");
        }

        System.out.println("");
        System.out.println("""
                *** 5. Soru ***
                """);
        System.out.println("Bir notunuzu giriniz: ");
        int soru5sayi1 = scanner.nextInt();

        if (soru5sayi1 >= 60 && soru5sayi1 < 101){
            System.out.println("GEÇTİ!");
        }else if (soru5sayi1>=0 && soru5sayi1<60 ){
            System.out.println("KALDI!");
        }else {
            System.out.println("Geçerli bir not giriniz!");
        }

        scanner.nextLine();
        System.out.println("");
        System.out.println("""
                *** 6. Soru ***
                """);
        // Kullanıcıdan bir gün adı alın ve bu günün hafta içi mi hafta sonu mu olduğunu kontrol edin.
        System.out.println("Bir gün giriniz: ");
        String soru6 = scanner.nextLine().toLowerCase();

        switch (soru6){
            case "cumartesi": case "pazar":
                    System.out.println("Hafta sonu");
                    break;
            case "pazartesi": case "salı": case "çarşamba": case "perşembe": case "cuma":
                System.out.println("Hafta içi");
                break;
            default:
                System.out.println("Geçersiz giriş");
        }
        // Bir sayının 0, 1 veya diğer durumlarını kontrol eden bir if yapısı yazın.
        System.out.println("");
        System.out.println("""
                *** 7. Soru ***
                """);
        System.out.println("Bir değer giriniz: ");
        int soru7sayi1 = scanner.nextInt();
        if (soru7sayi1 == 0) {
            System.out.println("Sayı sıfırdır");
        } else if (soru7sayi1 == 1) {
            System.out.println("Sayı birdir");
        } else {
            System.out.println("Sayı diğer bir değerdir");
        }
        // Kullanıcıdan bir rakam girilmesini isteyin ve bu rakamın İngilizce karşılığını yazdırın.
        System.out.println("");
        System.out.println("""
                *** 8. Soru ***
                """);
        System.out.println("Bir değer giriniz: ");
        int soru8sayi1 = scanner.nextInt();

        switch (soru8sayi1) {
            case 0:
                System.out.println("zero");
                break;
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
            default:
                System.out.println("diğer sayılar");
        }
        // 9.	Kullanıcıdan bir sayı alın ve bu sayının 3 ve 5 ile bölünebilirliğini kontrol edin.
        System.out.println("");
        System.out.println("""
                *** 9. Soru ***
                """);
        System.out.println("Bir değer giriniz: ");
        int soru9sayi1 = scanner.nextInt();
        if (soru9sayi1 % 3 == 0 && soru9sayi1 % 5 == 0) {
            System.out.println("bu sayı 3 ve 5 ile tam bölünür");
        } else {
            System.out.println("bu sayı 3 ve 5 ile tam bölünmez");
        //  10.	Kullanıcıdan bir ay numarası alın ve bu ayın kaç gün olduğunu yazdırın.
            System.out.println("");
            System.out.println("""
                *** 10. Soru ***
                """);

            System.out.println("Bir ay değeri giriniz (1-12): ");
            int soru10sayi1 = scanner.nextInt();

            switch (soru10sayi1) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("31 gün");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 gün");
                    break;
                case 2:
                    System.out.println("28 veya 29 gün");
                    break;
                default:
                    System.out.println("Geçersiz ay numarası");
            }
        }
    }
}
