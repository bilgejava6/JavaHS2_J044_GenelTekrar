package com.bekircan.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

/**
 *  *            * Stream API - Kolay
 *  1.	Bir List<Integer> oluşturun ve forEach kullanarak tüm elemanları yazdırın.
 *  2.	Bir List<String>’i Stream API ile alfabetik olarak sıralayıp yazdırın.
 *  3.	Bir List<Integer>’deki tüm elemanların karesini hesaplayan bir Stream işlemi yazın.
 *  4.	Bir List<String> içinde belirli bir kelimenin (örneğin, “Java”) var olup olmadığını kontrol edin.
 *  5.	Bir List<Integer>’deki yalnızca çift sayıları filtreleyip yazdıran bir kod yazın.
 *  6.	Bir List<Integer>’deki elemanların toplamını Stream API kullanarak hesaplayın.
 *  7.	Bir List<String> içindeki tüm elemanları büyük harfe çevirip yazdıran bir Stream işlemi yazın.
 *  8.	Bir Stream kullanarak belirli bir aralıkta (örneğin, 1 ile 10 arasında) bir sayı listesi oluşturun.
 *  9.	Bir List<String> içindeki boş olmayan elemanları filtreleyip yazdırın.
 *  10.	Bir List<Integer> içindeki en küçük sayıyı Stream API kullanarak bulun.
 */

public class StreamKolay {

    public static void main(String[] args) {

        ///
        System.out.println("*** 1. Soru ***");
        List<Integer> sayilar1 = Arrays.asList(1, 2, 3, 4, 5);
        sayilar1.stream().forEach(System.out::println);

        ///
        System.out.println("*** 2. Soru ***");
        List<String> kelimeler1 = Arrays.asList("Merhaba", "Stream", "API", "Kolay");
        kelimeler1.stream().sorted().forEach(System.out::println);

        ///
        System.out.println("*** 3. Soru ***");
        List<Integer> sayilar2 = Arrays.asList(1, 2, 3, 4, 5);
        sayilar2.stream().map(sayi -> sayi * sayi).forEach(System.out::println);

        ///
        System.out.println("*** 4. Soru ***");
        List<String> kelimeler2 = Arrays.asList("Java", "Stream", "API");
        boolean varMi = kelimeler2.stream().anyMatch("Java"::equals);
        System.out.println("Java kelimesi var mı? " + varMi);

        ///
        System.out.println("*** 5. Soru ***");
        List<Integer> sayilar3 = Arrays.asList(1, 2, 3, 4, 5, 6);
        sayilar3.stream().filter(sayi -> sayi % 2 == 0).forEach(System.out::println);

        ///
        System.out.println("*** 6. Soru ***");
        List<Integer> sayilar4 = Arrays.asList(1, 2, 3, 4, 5);
        int toplam = sayilar4.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Toplam: " + toplam);

        ///
        System.out.println("*** 7. Soru ***");
        List<String> kelimeler3 = Arrays.asList("java", "stream", "api");
        kelimeler3.stream().map(String::toUpperCase).forEach(System.out::println);

        ///
        System.out.println("*** 8. Soru ***");
        IntStream.rangeClosed(1, 10).forEach(System.out::println);

        ///
        System.out.println("*** 9. Soru ***");
        List<String> kelimeler4 = Arrays.asList("Java", "", "Stream", "API", "");
        kelimeler4.stream().filter(kelime -> !kelime.isEmpty()).forEach(System.out::println);

        ///
        System.out.println("*** 10. Soru ***");
        List<Integer> sayilar5 = Arrays.asList(10, 5, 3, 8, 2);
        int enKucuk = sayilar5.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
