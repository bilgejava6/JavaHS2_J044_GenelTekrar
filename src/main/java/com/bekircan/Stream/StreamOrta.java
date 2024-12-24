package com.bekircan.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  1.	Bir List<String> içindeki elemanları Stream kullanarak uzunluklarına göre sıralayın ve yazdırın.
 *  2.	Bir List<Integer>’deki benzersiz elemanları distinct kullanarak yazdırın.
 *  3.	Bir List<String>’de belirli bir uzunluktan (örneğin, 5 karakter) uzun olan elemanları filtreleyin.
 *  4.	Bir Stream’den Map oluşturmak için collect(Collectors.toMap()) kullanarak bir kod yazın.
 *  5.	Bir List<Integer> içindeki elemanların ortalamasını Stream API ile hesaplayın.
 *  6.	Bir List<String>’deki elemanları birleştirip (concatenate) tek bir String oluşturun (Collectors.joining kullanarak).
 *  7.	Bir List<Integer> içindeki tüm elemanların çarpımını reduce kullanarak hesaplayın.
 *  8.	Bir Map<String, Integer>’deki anahtarları Stream olarak elde edin ve yazdırın.
 *  9.	Bir List<Integer>’deki elemanları önce filtreleyip (örneğin, çift sayılar), sonra sıralayın ve yazdırın.
 *  10.	Bir List<String> içindeki elemanları gruplamak için Collectors.groupingBy kullanın (örneğin, eleman uzunluğuna göre).
 */

public class StreamOrta {
    public static void main(String[] args) {
        ///Bir List<String> içindeki elemanları Stream kullanarak uzunluklarına göre sıralayın ve yazdırın.
        System.out.println("*** 1. Soru ***");
        List<String> kelimeler = Arrays.asList("Java", "Stream", "API", "Orta");

        kelimeler.stream()
                .sorted((a,b)-> Integer.compare(a.length(),b.length())).forEach(System.out::println);

        ///Bir List<Integer>’deki benzersiz elemanları distinct kullanarak yazdırın.
        System.out.println("*** 2. Soru ***");
        List<Integer> sayilar =Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        sayilar.stream().distinct().forEach(System.out::println);

        ///
        System.out.println("*** 3. Soru ***");



        ///
        System.out.println("*** 4. Soru ***");
        ///
        System.out.println("*** 5. Soru ***");
        ///
        System.out.println("*** 6. Soru ***");
        ///
        System.out.println("*** 7. Soru ***");
        ///
        System.out.println("*** 8. Soru ***");
        ///
        System.out.println("*** 9. Soru ***");





    }
}
