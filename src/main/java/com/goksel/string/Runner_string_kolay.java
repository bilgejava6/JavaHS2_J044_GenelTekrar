package com.goksel.string;

import java.util.Scanner;

public class Runner_string_kolay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1)

        String metin1 = "Merhaba!";
        System.out.println("(1) Metin: " + metin1);
        System.out.println("    Uzunluğu: " + metin1.length());

        // 2)

        String metin2 = "Java Programlama";
        System.out.println("(2) Büyük harflerle: " + metin2.toUpperCase());

        // 3)

        System.out.print("(3) Bir metin giriniz: ");
        String kullaniciMetini = scanner.nextLine();
        if (kullaniciMetini.isEmpty()) {
            System.out.println("    Metin boş, ilk harf yok!");
        } else {
            System.out.println("    İlk harf: " + kullaniciMetini.charAt(0));
        }

        // 4)

        String metin4 = "Merhaba Dünya";
        int indexDunya = metin4.indexOf("Dünya");
        System.out.println("(4) \"Merhaba Dünya\" ifadesinde \"Dünya\" başlangıç indeksi: " + indexDunya);

        // 5)

        String metin5 = "GSxyz";

        StringBuilder sb = new StringBuilder(metin5);
        String tersMetin = sb.reverse().toString();
        System.out.println("(5) Orijinal: " + metin5 + " | Ters: " + tersMetin);

        // 6)
        String strA = "DEne";
        String strB = "Dene";
        boolean esitMi = strA.equals(strB);
        System.out.println("(6) \"" + strA + "\" ve \"" + strB + "\" eşit mi? " + esitMi);

        // 7)
        String metin35 = "";
        System.out.println("(7) metin35 boş mu? " + metin35.isEmpty());

        // 8)

        String metin36 = "Java çok eğlenceli!";
        String bosluksuzMetin = metin36.replace(" ", "");
        System.out.println("(8) Boşluklar kaldırıldı: " + bosluksuzMetin);

        // 9)

        System.out.print("(9) Bir kelime giriniz: ");
        String girilenKelime = scanner.nextLine();
        if (girilenKelime.contains("a")) {
            System.out.println("    Kelimenin içinde 'a' harfi var.");
        } else {
            System.out.println("    Kelimenin içinde 'a' harfi YOK.");
        }

        // 10)

        String hello = "Hello";
        String world = "World";
        String birlesmis = hello + " " + world;
        System.out.println("(10) Birleştirilmiş metin: " + birlesmis);
    }
}
