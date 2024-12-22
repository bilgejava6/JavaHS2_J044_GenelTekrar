package com.goksel.KararYapilari;


import java.util.Scanner;

public class Runner_karary_kolay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1.

        System.out.println("\n--- 1. Soru: Pozitif/Negatif Kontrolü ---");

        System.out.print("Bir sayı girin: ");
        int sayi1 = input.nextInt();
        if (sayi1 > 0) {
            System.out.println("Sayı pozitif.");
        } else if (sayi1 < 0) {
            System.out.println("Sayı negatif.");
        } else {
            System.out.println("Sayı sıfır.");
        }

        // 2.

        System.out.println("\n--- 2. Soru: Çift/Tek Kontrolü ---");

        System.out.print("Bir sayı girin: ");
        int sayi2 = input.nextInt();
        if (sayi2 % 2 == 0) {
            System.out.println("Sayı çift.");
        } else {
            System.out.println("Sayı tek.");
        }

        // 3.

        System.out.println("\n--- 3. Soru: Yaş Kategorisi ---");

        System.out.print("Yaşınızı girin: ");
        int yas = input.nextInt();
        if (yas < 13) {
            System.out.println("Çocuk");
        } else if (yas < 19) {
            System.out.println("Genç");
        } else {
            System.out.println("Yetişkin");
        }

        // 4.

        System.out.println("\n--- 4. Soru: Sesli Harf Kontrolü ---");

        System.out.print("Bir karakter girin: ");
        char karakter = input.next().charAt(0);
        karakter = Character.toLowerCase(karakter);

        if (karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u') {
            System.out.println("Sesli harf.");
        } else {

            System.out.println("Sesli harf değil.");
        }

        // 5.

        System.out.println("\n--- 5. Soru: Geçti/Kaldı Durumu ---");

        System.out.print("Notunuzu girin: ");
        int not = input.nextInt();
        if (not >= 50) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }

        // 6.

        System.out.println("\n--- 6. Soru: Hafta İçi/Hafta Sonu Kontrolü ---");

        System.out.print("Bir gün adı girin: ");
        String gun = input.next().toLowerCase();
        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Hafta sonu.");

        } else if(gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")){
            System.out.println("Hafta içi.");

        } else{
            System.out.println("Geçersiz gün adı girdiniz.");
        }

        // 7.

        System.out.println("\n--- 7. Soru: Sayı Durumu ---");

        System.out.print("Bir sayı girin: ");

        int sayi7 = input.nextInt();
        if (sayi7 == 0) {
            System.out.println("Sayı 0.");
        } else if (sayi7 == 1) {
            System.out.println("Sayı 1.");
        } else {
            System.out.println("Sayı 0 veya 1 değil.");
        }

        // 8.

        System.out.println("\n--- 8. Soru: Rakamın İngilizce Karşılığı ---");

        System.out.print("Bir rakam girin (0-9): ");
        int rakam = input.nextInt();
        // TODO: String ifade = switch(VALUE) 0 -> "zero";
        switch (rakam) {
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
            default:
                System.out.println("Geçersiz rakam.");
        }

        // 9.

        System.out.println("\n--- 9. Soru: Bölünebilirlik Kontrolü ---");

        System.out.print("Bir sayı girin: ");
        int sayi9 = input.nextInt();
        if (sayi9 % 3 == 0 && sayi9 % 5 == 0) {
            System.out.println("Sayı hem 3'e hem de 5'e bölünebilir.");

        } else if (sayi9 % 3 == 0){
            System.out.println("Sayı 3'e bölünebilir.");

        }else if(sayi9 % 5 == 0){
            System.out.println("Sayı 5'e bölünebilir.");

        } else {
            System.out.println("Sayı 3'e ve 5'e bölünemez.");
        }

        // 10.

        System.out.println("\n--- 10. Soru: Ayın Gün Sayısı ---");

        System.out.print("Bir ay numarası girin (1-12): ");
        int ay = input.nextInt();
        switch (ay) {
            // case 1,3,5,7,8,10,12
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println("Bu ay 31 gündür.");

                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Bu ay 30 gündür.");
                break;
            case 2:
                System.out.println("Bu ay 28 veya 29 gündür.");
                break;

            default:
                System.out.println("Geçersiz ay numarası.");


        }
    }
}