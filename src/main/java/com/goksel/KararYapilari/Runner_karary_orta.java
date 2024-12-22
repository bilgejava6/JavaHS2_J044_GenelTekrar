package com.goksel.KararYapilari;

import java.util.Scanner;

public class Runner_karary_orta {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1.

        System.out.println("\n--- 1. Soru: Büyük Sayıyı Bulma ---");

        System.out.print("İlk sayıyı girin: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = input.nextInt();
        if (sayi1 > sayi2) {
            System.out.println("Büyük sayı: " + sayi1);
        } else if (sayi2 > sayi1) {
            System.out.println("Büyük sayı: " + sayi2);
        } else {
            System.out.println("Sayılar eşit.");
        }

        // 2.
        System.out.println("\n--- 2. Soru: Harf Notu Hesaplama ---");

        System.out.print("Notunuzu girin: ");
        int not = input.nextInt();
        String harfNotu = "";
        if (not >= 90) {
            harfNotu = "A";
        } else if (not >= 80) {
            harfNotu = "B";
        } else if (not >= 70) {
            harfNotu = "C";
        } else if (not >= 60) {
            harfNotu = "D";
        } else {
            harfNotu = "F";
        }
        System.out.println("Harf notunuz: " + harfNotu);

        // 3.

        System.out.println("\n--- 3. Soru: Artık Yıl Kontrolü ---");

        System.out.print("Bir yıl girin: ");
        int yil = input.nextInt();
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0))
        {
            System.out.println(yil + " artık yıldır.");
        } else {
            System.out.println(yil + " artık yıl değildir.");
        }

        // 4.
        System.out.println("\n--- 4. Soru: Karakter Türü Kontrolü ---");

        System.out.print("Bir karakter girin: ");
        char karakter = input.next().charAt(0);
        if (Character.isUpperCase(karakter)) {
            System.out.println("Büyük harf.");
        } else if (Character.isLowerCase(karakter)) {
            System.out.println("Küçük harf.");
        } else if (Character.isDigit(karakter)) {
            System.out.println("Sayı.");
        } else {
            System.out.println("Diğer bir karakter.");
        }

        // 5.
        System.out.println("\n--- 5. Soru: En Büyük Sayıyı Bulma ---");

        System.out.print("İlk sayıyı girin: ");
        int sayi3_1 = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi3_2 = input.nextInt();
        System.out.print("Üçüncü sayıyı girin: ");
        int sayi3_3 = input.nextInt();
        int enBuyuk = sayi3_1;
        if (sayi3_2 > enBuyuk) {
            enBuyuk = sayi3_2;
        }
        if (sayi3_3 > enBuyuk) {
            enBuyuk = sayi3_3;
        }
        System.out.println("En büyük sayı: " + enBuyuk);

        // 6.

        System.out.println("\n--- 6. Soru: Sayının Çeyreğini Belirleme ---");

        System.out.print("Bir sayı girin: ");
        int sayi4 = input.nextInt();
        if (sayi4 >= 0 && sayi4 <= 25) {
            System.out.println("Sayı 1. çeyrekte (0-25).");
        } else if (sayi4 >= 26 && sayi4 <= 50) {
            System.out.println("Sayı 2. çeyrekte (26-50).");
        } else if (sayi4 >= 51 && sayi4 <= 75) {
            System.out.println("Sayı 3. çeyrekte (51-75).");
        } else if (sayi4 >= 76 && sayi4 <= 100) {
            System.out.println("Sayı 4. çeyrekte (76-100).");
        } else {
            System.out.println("Sayı geçerli bir aralıkta değil.");
        }

        // 7.

        // 8.
        System.out.println("\n--- 8. Soru: Gün Önerisi ---");

        System.out.print("Bir gün adı girin: ");
        String gun = input.next().toLowerCase();
        switch (gun) {
            case "pazartesi":
                System.out.println("Pazartesi: Yeni haftaya başlıyoruz!");
                break;
            case "salı":
                System.out.println("Salı: İşlere devam!");
                break;
            case "çarşamba":
                System.out.println("Çarşamba: Haftanın ortasına geldik!");
                break;
            case "perşembe":
                System.out.println("Perşembe: Hafta sonuna yaklaşıyoruz!");
                break;
            case "cuma":
                System.out.println("Cuma: İşte haftanın son günü!");
                break;
            case "cumartesi":
                System.out.println("Cumartesi: Dinlenme zamanı!");
                break;
            case "pazar":
                System.out.println("Pazar: Yeni haftaya hazırlan!");
                break;
            default:
                System.out.println("Geçersiz gün adı.");
        }

        // 9.

        System.out.println("\n--- 9. Soru: Hesap Makinesi ---");

        System.out.print("İlk sayıyı girin: ");
        double sayi6_1 = input.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi6_2 = input.nextDouble();
        System.out.print("Yapılacak işlemi girin (+, -, *, /): ");

        char islem = input.next().charAt(0);
        double sonuc = 0;
        switch (islem) {
            case '+':
                sonuc = sayi6_1 + sayi6_2;
                break;
            case '-':
                sonuc = sayi6_1 - sayi6_2;
                break;
            case '*':
                sonuc = sayi6_1 * sayi6_2;
                break;
            case '/':
                if (sayi6_2 != 0) {
                    sonuc = sayi6_1 / sayi6_2;
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }
        System.out.println("Sonuç: " + sonuc);


        // 10.

        System.out.println("\n--- 10. Soru: Kelime Uzunluğu Mesajı ---");

        System.out.print("Bir kelime girin: ");
        String kelime = input.next();
        int uzunluk = kelime.length();
        if (uzunluk < 5) {
            System.out.println("Kelime kısa.");
        } else if (uzunluk < 10) {
            System.out.println("Kelime orta uzunlukta.");
        } else {
            System.out.println("Kelime uzun.");


        }
    }
}