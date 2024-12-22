package com.goksel.streamApi;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Runner_streamApi_kolay {
    public static void main(String[] args) {

        // 1.

        System.out.println("\n--- 1. Soru: List<Integer> ve forEach ---");
        List<Integer> sayilar1 = Arrays.asList(15, 52, 37, 454, 554);
        System.out.println("List elemanları (forEach ile):");
        sayilar1.forEach(System.out::println);

        // 2.

        System.out.println("\n--- 2. Soru: List<String> Alfabetik Sıralama ---");
        List<String> isimler = Arrays.asList("Goksel", "Ali", "Ayşe", "Zeynep");
        System.out.println("List elemanları (alfabetik sıralı):");
        isimler.stream()
                .sorted()
                .forEach(System.out::println);


        // 3.

        System.out.println("\n--- 3. Soru: List<Integer> Kare Alma ---");
        List<Integer> sayilar2 = Arrays.asList(44, 43, 3, 13, 35);
        System.out.println("List elemanlarının kareleri:");
        sayilar2.stream()
                .map(sayi -> sayi * sayi)
                .forEach(System.out::println);

        // 4.

        System.out.println("\n--- 4. Soru: List<String> Kelime Kontrol ---");
        List<String> kelimeler = Arrays.asList("Java", "Python", "JavaScript", "C++");
        boolean javaVarMi = kelimeler.stream()
                .anyMatch(kelime -> kelime.equals("Java"));
        System.out.println("Listede 'Java' var mı: " + javaVarMi);


        // 5.

        System.out.println("\n--- 5. Soru: List<Integer> Çift Sayılar ---");
        List<Integer> sayilar3 = Arrays.asList(13, 42, 73, 84, 25, 67);
        System.out.println("Listeki çift sayılar:");
        sayilar3.stream()
                .filter(sayi -> sayi % 2 == 0)
                .forEach(System.out::println);

        // 6.

        System.out.println("\n--- 6. Soru: List<Integer> Toplam Hesaplama ---");
        List<Integer> sayilar4 = Arrays.asList(1, 2, 3, 4, 5);
        int toplam = sayilar4.stream()
                .reduce(0, Integer::sum);
        System.out.println("List elemanlarının toplamı: " + toplam);

        // 7.

        System.out.println("\n--- 7. Soru: List<String> Büyük Harfe Çevirme ---");
        List<String> kelimeler2 = Arrays.asList("java", "python", "javascript");
        System.out.println("List elemanlarının büyük harfli hali:");
        kelimeler2.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // 8.

        System.out.println("\n--- 8. Soru: Stream ile Sayı Listesi Oluşturma ---");
        System.out.println("1 ile 10 arasındaki sayılar:");
        IntStream.rangeClosed(1, 11)
                .forEach(System.out::println);


        // 9.

        System.out.println("\n--- 9. Soru: List<String> Boş Olmayan Elemanlar ---");
        List<String> kelimeler3 = Arrays.asList("Java", "", "Python", " ", "JavaScript");
        System.out.println("Listteki boş olmayan elemanlar:");
        kelimeler3.stream()
                .filter(kelime -> !kelime.trim().isEmpty())
                .forEach(System.out::println);

        // 10.

        System.out.println("\n--- 10. Soru: List<Integer> En Küçük Sayı Bulma ---");
        List<Integer> sayilar5 = Arrays.asList(5, 2, 8, 1, 9);
        sayilar5.stream()
                .min(Integer::compare)
                .ifPresent(min -> System.out.println("Listedeki en küçük sayı: "+ min));

    }
}