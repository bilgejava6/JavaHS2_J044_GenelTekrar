package com.onur.stream.zor;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZorRunner {
    public static void main(String[] args) {

        //1. Bir List<Employee> oluşturun ve çalışanların maaşlarına göre sıralanmış bir liste döndürün.
        List<Employee> employees = List.of(
                new Employee("Onur", 40, 50.000),
                new Employee("Ali", 50, 80.000),
                new Employee("Veli", 30, 60.000),
                new Employee("Mehmet", 20, 30.000),
                new Employee("Ahmet", 25, 70.000)
        );
        List<Employee> sortedList = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
        System.out.println(sortedList);

        //2. Bir List<Employee> içindeki tüm çalışanları departmanlarına göre gruplamak için Stream API kullanın.
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((departman, calisanlar) -> System.out.println(departman + " : " + calisanlar));

        //3. Bir Map<String, Integer>’deki tüm çift değerleri filtreleyip yeni bir Map döndürün.
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);

        Map<String, Integer> evenValuesMap = map.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 == 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(evenValuesMap);

        //4. Bir List<String>’i alfabeye göre sıralayın ve sadece ilk 3 elemanı alın (limit kullanarak).
        List<String> kelimeler = List.of("Java", "Python", "C++", "JavaScript", "Ruby");
        List<String> ilkUc = kelimeler.stream().sorted().limit(3).toList();
        System.out.println(ilkUc);


        //5. Bir List<Integer> içindeki elemanları küçükten büyüğe sıralayın ve ardından 5’ten büyük olanları yazdırın.
        List<Integer> sayilar = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sayilar.stream().sorted().filter(sayi -> sayi > 5).forEach(System.out::println);

        //6. Bir Stream ile Fibonacci dizisi oluşturan bir kod yazın.
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(n -> n[0])
                .forEach(System.out::println);

        //7. Bir List<Integer> içindeki elemanların frekansını hesaplayarak bir Map oluşturun.
        List<Integer> sayilar2 = List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3);
        Map<Integer, Long> frekanslar = sayilar2.stream().collect(Collectors.groupingBy(sayi -> sayi, Collectors.counting()));
        System.out.println(frekanslar);

        //8. Bir List<String> içinde uzunlukları aynı olan kelimeleri bir grupta toplayın.
        List<String> kelimeler2 = List.of("Java", "Python", "C++", "JavaScript", "Ruby", "Go", "C#");
        Map<Integer, List<String>> uzunlukGruplari = kelimeler2.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(uzunlukGruplari);

        //9. Bir Stream kullanarak belirli bir koşula göre (örneğin, belirli bir harf içeren kelimeler) bir listeyi iki alt listeye ayırın (partitioningBy kullanarak).
        Map<Boolean, List<String>> gruplar = kelimeler2.stream().collect(Collectors.partitioningBy(kelime -> kelime.contains("a")));
        gruplar.forEach((harfVarMi, kelimeListesi) -> System.out.println(harfVarMi + " : " + kelimeListesi));

        //10. Sonsuz bir Stream oluşturun (Stream.generate kullanarak) ve belirli bir koşula göre bu akışı sınırlandırıp elemanları yazdırın.
        Stream.generate(() -> (int) (Math.random() * 100))
                .limit(10)
                .forEach(System.out::println);

    }
}
