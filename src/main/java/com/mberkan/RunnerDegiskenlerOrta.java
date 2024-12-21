package com.mberkan;

import java.util.Scanner;

public class RunnerDegiskenlerOrta {
    public static void main(String[] args) {
        // 1. soru
            Scanner sc = new Scanner(System.in);
            System.out.println("Lutfen yasinizi giriniz.");
            int yas = sc.nextInt();
            System.out.println(yas);

            // 2.Soru
        final int sayi1 = 5;
        // sayi1 = 3; hata veriyor nedeni de final değişkenler değiştirilemez!

        // 3.soru
        String ad = "Berkan";
        String soyad = "Akbulut";
        System.out.println(ad.concat(" "+soyad));
        //4. soru
        int sayi2 = 5;
        double sayi3 = 3.4;
        System.out.println(sayi2 + sayi3); // double değeri geliyor..
        //5. soru
        String donusumSayi = "123";
        int donusenSayi = Integer.parseInt(donusumSayi);
        System.out.println(sayi2 + donusenSayi);
        //6.Soru
        long birMilyar = 1_000_000_000L;
        System.out.println(birMilyar);
        //7.soru
        int d1 = 5;
        float d2 = d1;
        String d3 = String.valueOf(d2);
        System.out.println(d3);
        // 8. soru
        System.out.println("Lutfen Bir kelime giriniz ");
        String kelime = new Scanner(System.in).nextLine();
        System.out.println(kelime.length());
        // 9. soru
        short d5 = 10;
        int d6 = d5;
        System.out.println(d6);




    }


}
