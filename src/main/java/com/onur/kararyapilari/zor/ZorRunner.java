package com.onur.kararyapilari.zor;

import java.util.Scanner;

public class ZorRunner {

    public static void main(String[] args) {

        // 1.	Kullanıcıdan bir sayı alın ve bu sayının mükemmel kare olup olmadığını kontrol eden bir program yazın.
        System.out.println("Bir sayı girin: ");
        int sayi = new Scanner(System.in).nextInt();
        int kareKok = (int) Math.sqrt(sayi);
        if (kareKok * kareKok == sayi) {
            System.out.println("Mükemmel kare");
        } else {
            System.out.println("Mükemmel kare değil");
        }

        // 2.	Kullanıcıdan bir sıcaklık değeri alın ve bu sıcaklığa göre “Soğuk”, “Ilık”, veya “Sıcak” yazdırın.
        System.out.println("Sıcaklık girin: ");
        int sicaklik = new Scanner(System.in).nextInt();
        if (sicaklik < 15) {
            System.out.println("Soğuk");
        } else if (sicaklik < 25) {
            System.out.println("Ilık");
        } else {
            System.out.println("Sıcak");
        }

        // 3.	Kullanıcıdan bir tarih alın ve bu tarihin geçerli bir tarih olup olmadığını kontrol eden bir kod yazın.
        System.out.println("Tarih girin: ");
        String tarih = new Scanner(System.in).next();
        String[] tarihParcalari = tarih.split("/");
        int gun = Integer.parseInt(tarihParcalari[0]);
        int ay = Integer.parseInt(tarihParcalari[1]);
        int yil = Integer.parseInt(tarihParcalari[2]);
        if (gun > 0 && gun <= 31 && ay > 0 && ay <= 12 && yil > 0) {
            System.out.println("Geçerli tarih");
        } else {
            System.out.println("Geçersiz tarih");
        }

        // 4.	Kullanıcıdan bir sayı alın ve bu sayının asal olup olmadığını kontrol eden bir program yazın.
        System.out.println("Bir sayı girin: ");
        int sayi2 = new Scanner(System.in).nextInt();
        boolean asalMi = true;
        for (int i = 2; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                asalMi = false;
                break;
            }
        }
        if (asalMi) {
            System.out.println("Asal");
        } else {
            System.out.println("Asal değil");
        }

        // 5.	Kullanıcıdan bir dizi sayı alın ve bu sayıların ortalamasını, medyanını ve modunu hesaplayan bir kod yazın.

        // 6.	Kullanıcıdan bir sayı alın ve bu sayıyı 1’den 5’e kadar karşılaştırarak farklı mesajlar yazdırın.
        System.out.println("Bir sayı girin: ");
        int sayi3 = new Scanner(System.in).nextInt();
        switch (sayi3) {
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            default:
                System.out.println("Bilinmeyen sayı");
        }

        // 7. Bir kelimenin String içindeki en sık tekrar eden harfini bulan bir program yazın.

        // 8.	Kullanıcıdan bir sayı alın ve bu sayının tam kare, tam küp veya başka bir duruma uygun olup olmadığını yazdırın.
        System.out.println("Bir sayı girin: ");
        int sayi4 = new Scanner(System.in).nextInt();
        int kareKok2 = (int) Math.sqrt(sayi4);
        int kupKok = (int) Math.cbrt(sayi4);
        boolean diger = true;

        if (kareKok2 * kareKok2 == sayi4) {
            System.out.println("Tam kare");
            diger = false;
        }
        if (kupKok * kupKok * kupKok == sayi4) {
            System.out.println("Tam küp");
            diger = false;
        }

        if (diger) {
            System.out.println("Ne tam kare ne de tam küp");
        }

        // 9.	Bir yıl alın ve o yılın Çin Zodyak burcunu hesaplayan bir program yazın.
        System.out.println("Yıl girin: ");
        int yil2 = new Scanner(System.in).nextInt();
        String[] zodyaklar = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        System.out.println(zodyaklar[yil2 % 12]);


    }

}
