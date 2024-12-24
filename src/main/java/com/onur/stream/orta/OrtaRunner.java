package com.onur.stream.orta;

import java.util.*;
import java.util.stream.Collectors;

public class OrtaRunner {
    public static void main(String[] args) {

        /** 	1.	Bir List<String> içindeki elemanları Stream kullanarak uzunluklarına göre sıralayın ve yazdırın.
            * 	2.	Bir List<Integer>’deki benzersiz elemanları distinct kullanarak yazdırın.
            * 	3.	Bir List<String>’de belirli bir uzunluktan (örneğin, 5 karakter) uzun olan elemanları filtreleyin.
            * 	4.	Bir Stream’den Map oluşturmak için collect(Collectors.toMap()) kullanarak bir kod yazın.
            * 	5.	Bir List<Integer> içindeki elemanların ortalamasını Stream API ile hesaplayın.
            * 	6.	Bir List<String>’deki elemanları birleştirip (concatenate) tek bir String oluşturun (Collectors.joining kullanarak).
            * 	7.	Bir List<Integer> içindeki tüm elemanların çarpımını reduce kullanarak hesaplayın.
            * 	8.	Bir Map<String, Integer>’deki anahtarları Stream olarak elde edin ve yazdırın.
            * 	9.	Bir List<Integer>’deki elemanları önce filtreleyip (örneğin, çift sayılar), sonra sıralayın ve yazdırın.
            * 	10.	Bir List<String> içindeki elemanları gruplamak için Collectors.groupingBy kullanın (örneğin, eleman uzunluğuna göre).*/

        //1. Bir List<String> içindeki elemanları Stream kullanarak uzunluklarına göre sıralayın ve yazdırın.
        List<String> kelimeler = List.of("Java", "Python", "C++", "JavaScript", "Ruby");
        kelimeler.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        //2. Bir List<Integer>’deki benzersiz elemanları distinct kullanarak yazdırın.
        List<Integer> sayilar = List.of(1, 2, 3, 4, 5, 5, 5, 5);
        sayilar.stream().distinct().forEach(System.out::println);

        //3. Bir List<String>’de belirli bir uzunluktan (örneğin, 5 karakter) uzun olan elemanları filtreleyin.
        kelimeler.stream().filter(kelime -> kelime.length() > 5).forEach(System.out::println);

        //4. Bir Stream’den Map oluşturmak için collect(Collectors.toMap()) kullanarak bir kod yazın.
        kelimeler.stream().collect(Collectors.toMap(kelime -> kelime, String::length)).forEach((kelime, uzunluk) -> System.out.println(kelime + " : " + uzunluk));

        //5. Bir List<Integer> içindeki elemanların ortalamasını Stream API ile hesaplayın.
        OptionalDouble ortalama = sayilar.stream().mapToInt(Integer::intValue).average();
        if (ortalama.isPresent()) {
            System.out.println(ortalama.getAsDouble());
        }

        //6. Bir List<String>’deki elemanları birleştirip (concatenate) tek bir String oluşturun (Collectors.joining kullanarak).
        String birlesikKelime = kelimeler.stream().collect(Collectors.joining(", "));
        System.out.println(birlesikKelime);

        //7. Bir List<Integer> içindeki tüm elemanların çarpımını reduce kullanarak hesaplayın.
        int carpim = sayilar.stream().reduce(1, (a, b) -> a * b);
        System.out.println(carpim);

        //8. Bir Map<String, Integer>’deki anahtarları Stream olarak elde edin ve yazdırın.
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);
        map.put("JavaScript", 4);
        map.keySet().forEach(System.out::println);

        //9. Bir List<Integer>’deki elemanları önce filtreleyip (örneğin, çift sayılar), sonra sıralayın ve yazdırın.
        sayilar.stream().filter(sayi -> sayi % 2 == 0).sorted().forEach(System.out::println);

        //10. Bir List<String> içindeki elemanları gruplamak için Collectors.groupingBy kullanın (örneğin, eleman uzunluğuna göre).
        Map<Integer, List<String>> gruplar = kelimeler.stream().collect(Collectors.groupingBy(String::length));
        gruplar.forEach((uzunluk, kelimeListesi) -> System.out.println(uzunluk + " : " + kelimeListesi));


    }
}
