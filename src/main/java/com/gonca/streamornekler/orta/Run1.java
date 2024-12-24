package com.gonca.streamornekler.orta;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Run1 {
    public static void main(String[] args) {

        //	1.	Bir List<String> içindeki elemanları Stream kullanarak uzunluklarına göre sıralayın ve yazdırın.
        List<String> listem= List.of("BİR ", "İKİ", "ÜÇ", "DÖRT", "BEŞ");
        listem.stream().mapToInt(x-> x.length()).sorted().forEach(System.out::println);

        //	2.	Bir List<Integer>’deki benzersiz elemanları distinct kullanarak yazdırın.
        List<String> listem1= List.of("BİR ", "İKİ", "ÜÇ", "DÖRT", "BEŞ","BİR","İKİ");
        listem1.stream().distinct().forEach(System.out::println);

        // 	3.	Bir List<String>’de belirli bir uzunluktan (örneğin, 5 karakter) uzun olan elemanları filtreleyin.
        List<String> listem3= List.of("BİR ", "İKİ", "ÜÇ", "DÖRT", "BEŞ");
        listem.stream().filter(x-> x.length()>5).forEach(System.out::println);

        //	4.	Bir Stream’den Map oluşturmak için collect(Collectors.toMap()) kullanarak bir kod yazın.

        List<Integer> listem4 = List.of(1, 2, 3, 4, 5);

        // Her sayıyı anahtar, karesini ise değer olarak alarak Map oluşturma
        Map<Integer, Integer> map = listem4.stream()
                .collect(Collectors.toMap(
                        num -> num,       // Anahtar olarak sayıyı alıyoruz
                        num -> num * num  // Değer olarak sayının karesini alıyoruz
                ));

        System.out.println(map);

        // 	5.	Bir List<Integer> içindeki elemanların ortalamasını Stream API ile hesaplayın.
        List<Integer> listem5 = List.of(1, 5, 7, 8, 2);
        double ortalama = listem5.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);  // Ortalama bulunamazsa 0 döner

        System.out.println("Ortalama: " + ortalama);
        // 	6.	Bir List<String>’deki elemanları birleştirip (concatenate) tek bir
        // 	String oluşturun (Collectors.joining kullanarak).

        // 	7.	Bir List<Integer> içindeki tüm elemanların çarpımını reduce kullanarak hesaplayın.
        List<Integer> listem7=List.of(1,5,7,8,2);

      int sonuc=  listem7.stream().reduce(1,(a,b)->a*b);

        //	8.	Bir Map<String, Integer>’deki anahtarları Stream olarak elde edin ve yazdırın.

        // 	9.	Bir List<Integer>’deki elemanları önce filtreleyip
        // 	(örneğin, çift sayılar), sonra sıralayın ve yazdırın.

        List<Integer> listem9=List.of(5,8,6,7,12,89,63,1);
        listem9.stream().filter(x-> x % 2 == 0).sorted().forEach(System.out::println);

        //	10.	Bir List<String> içindeki elemanları gruplamak için
        //	Collectors.groupingBy kullanın (örneğin, eleman uzunluğuna göre).*/

        List<String> listem10 = List.of("BİR", "İKİ", "ÜÇ", "DÖRT", "BEŞ", "BİR", "İKİ");

        Map<Integer, List<String>> groupedByLength = listem10.stream()
                .collect(Collectors.groupingBy(String::length));


        groupedByLength.forEach((key, value) -> System.out.println("Uzunluk " + key + ": " + value));

    }



}
