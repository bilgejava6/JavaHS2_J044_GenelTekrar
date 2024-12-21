package com.onur.str.zor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ZorRunner {

    public static void main(String[] args) {

        // 1. Kullanıcıdan bir String alın ve içindeki kelimelerin sırasını ters çevirerek konsola yazdırın.
        System.out.println("Bir cümle girin: ");
        String cumle = new Scanner(System.in).nextLine();
        String tersCumle = new StringBuilder(cumle).reverse().toString();
        System.out.println("Ters çevrilmiş cümle: " + tersCumle);

        // 2. Kullanıcıdan bir cümle alarak her kelimenin karakterlerini ters çeviren bir program yazın.
        System.out.println("Bir cümle girin: ");
        String cumle2 = new Scanner(System.in).nextLine();
        String[] kelimeler = cumle2.split(" ");
        StringBuilder yeniCumle = new StringBuilder();
        for (String kelime : kelimeler) {
            yeniCumle.append(new StringBuilder(kelime).reverse()).append(" ");
        }
        System.out.println("Ters çevrilmiş cümle: " + yeniCumle.toString().trim());

        // 3. “Merhaba Dünya” metnindeki tüm harflerin ASCII değerlerini ekrana yazdıran bir kod yazın.
        String metin = "Merhaba Dünya";
        for (int i = 0; i < metin.length(); i++) {
            System.out.println(metin.charAt(i) + " -> " + (int) metin.charAt(i));
        }

        // 4. Kullanıcıdan bir kelime alın ve içinde tekrarlanan karakterleri çıkararak yeni bir kelime oluşturun.
        System.out.println("Bir kelime girin: ");
        String kelime = new Scanner(System.in).nextLine();
        StringBuilder yeniKelime = new StringBuilder();
        kelime.chars().distinct().forEach(c -> yeniKelime.append((char) c));
        System.out.println("Tekrarlanan karakterler çıkarılmış hali: " + yeniKelime);

        // 5. Kullanıcıdan bir cümle alın ve cümledeki en uzun kelimeyi ekrana yazdırın.
        System.out.println("Bir cümle girin: ");
        String cumle3 = new Scanner(System.in).nextLine();
        String[] kelimeler2 = cumle3.split(" ");
        String enUzunKelime = "";
        for (String kelime2 : kelimeler2) {
            if (kelime2.length() > enUzunKelime.length()) {
                enUzunKelime = kelime2;
            }
        }
        System.out.println("En uzun kelime: " + enUzunKelime);

        // 6. Kullanıcıdan bir String alın ve bu metni şifrelemek için her harfi alfabede 3 karakter öteye taşıyan bir program yazın. stream api
        System.out.println("Bir metin girin: ");
        String metin2 = new Scanner(System.in).nextLine();
        String sifreliMetin = metin2.chars().map(c -> c + 3).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        System.out.println("Şifreli metin: " + sifreliMetin);

        // 7. Bir String’in anagram olup olmadığını kontrol eden bir kod yazın.
        System.out.println("İlk kelimeyi girin: ");
        String kelime1 = new Scanner(System.in).nextLine();
        System.out.println("İkinci kelimeyi girin: ");
        String kelime2 = new Scanner(System.in).nextLine();
        boolean anagram = kelime1.chars().sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()
                .contentEquals(kelime2.chars().sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append));
        System.out.println("Anagram mı: " + anagram);

        // 8. Kullanıcıdan bir kelime alın ve kelimenin tüm olası permütasyonlarını konsola yazdırın.


        // 9. Kullanıcıdan bir cümle alın ve bu cümledeki kelimelerin uzunluğuna göre sıralama yapan bir program yazın.
        System.out.println("Bir cümle girin: ");
        String cumle4 = new Scanner(System.in).nextLine();
        String[] kelimeler3 = cumle4.split(" ");
        String siraliCumle = String.join(" ", Arrays.stream(kelimeler3)
                .sorted(Comparator.comparingInt(String::length)).toArray(String[]::new));
        System.out.println("Sıralı cümle: " + siraliCumle);

        // 10. Kullanıcıdan iki metin alın ve ilk metnin ikinci metnin içinde kaç kez geçtiğini bulan bir kod yazın.
        System.out.println("İlk metni girin: ");
        String metin3 = new Scanner(System.in).nextLine();
        System.out.println("İkinci metni girin: ");
        String metin4 = new Scanner(System.in).nextLine();
        long sayac = metin4.split(metin3, -1).length - 1;
        System.out.println("Metin 1, metin 2 içinde " + sayac + " kez geçiyor.");


    }

}
