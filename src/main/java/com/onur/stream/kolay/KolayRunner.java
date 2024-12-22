package com.onur.stream.kolay;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KolayRunner {

    public static void main(String[] args) {

        //1. Bir List<Integer> oluşturun ve forEach kullanarak tüm elemanları yazdırın.
        List<Integer> sayilar = List.of(1, 2, 3, 4, 5);
        sayilar.forEach(System.out::println);

        //2. Bir List<String>’i Stream API ile alfabetik olarak sıralayıp yazdırın.
        List<String> kelimeler = List.of("Java", "Python", "C++", "JavaScript", "Ruby");
        kelimeler.stream().sorted().forEach(System.out::println);

        //3. Bir List<Integer>’deki tüm elemanların karesini hesaplayan bir Stream işlemi yazın.
        List<Integer> sayilar2 = List.of(1, 2, 3, 4, 5);
        sayilar2.stream().map(sayi -> sayi * sayi).forEach(System.out::println);

        //4. Bir List<String> içinde belirli bir kelimenin (örneğin, “Java”) var olup olmadığını kontrol edin.
        List<String> kelimeler2 = List.of("Java", "Python", "C++", "JavaScript", "Ruby");
        boolean javaVarMi = kelimeler2.stream().anyMatch(kelime -> kelime.equals("Java"));
        System.out.println(javaVarMi);

        //5. Bir List<Integer>’deki yalnızca çift sayıları filtreleyip yazdıran bir kod yazın.
        List<Integer> sayilar3 = List.of(1, 2, 3, 4, 5);
        sayilar3.stream().filter(sayi -> sayi % 2 == 0).forEach(System.out::println);

        //6. Bir List<Integer>’deki elemanların toplamını Stream API kullanarak hesaplayın.
        List<Integer> sayilar4 = List.of(1, 2, 3, 4, 5);
        int toplam = sayilar4.stream().reduce(0, Integer::sum);
        System.out.println(toplam);

        //7. Bir List<String> içindeki tüm elemanları büyük harfe çevirip yazdıran bir Stream işlemi yazın.
        List<String> kelimeler3 = List.of("Java", "Python", "C++", "JavaScript", "Ruby");
        kelimeler3.stream().map(String::toUpperCase).forEach(System.out::println);

        //8. Bir Stream kullanarak belirli bir aralıkta (örneğin, 1 ile 10 arasında) bir sayı listesi oluşturun.
        List<Integer> sayilar5 = IntStream.rangeClosed(1, 10).boxed().toList();
        sayilar5.forEach(System.out::println);

        //9. Bir List<String> içindeki boş olmayan elemanları filtreleyip yazdırın.
        List<String> kelimeler4 = List.of("Java", "", "C++", "JavaScript", "Ruby", "");
        kelimeler4.stream().filter(kelime -> !kelime.isEmpty()).forEach(System.out::println);

        //10. Bir List<Integer> içindeki en küçük sayıyı Stream API kullanarak bulun.
        List<Integer> sayilar6 = List.of(5, 8, 2, 1, 9, 4, 6, 3);
        int enKucuk = sayilar6.stream().min(Integer::compareTo).get();
        System.out.println(enKucuk);

    }

}
