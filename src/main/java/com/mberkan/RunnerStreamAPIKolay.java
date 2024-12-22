package com.mberkan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RunnerStreamAPIKolay {
    public static void main(String[] args) {
        cevap4();
    }
    static void cevap1(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.forEach(System.out::println);
    }
    static void cevap2(){
        List<String> isim = new ArrayList<>();
        isim.add("Ahmet");
        isim.add("Mehmmet");
        isim.add("Azra");
        isim.add("Berke");


        isim.stream()
                .sorted()
                .forEach(System.out::println);
    }
    static void cevap3(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }
    static void cevap4() {
        List<String> kelimeler = new ArrayList<>();
        kelimeler.add("Python");
        kelimeler.add("Java");
        kelimeler.add("C++");


        boolean containsJava = kelimeler.stream().anyMatch("Java"::equals);
        System.out.println("Listede 'Java' var mı? : " + containsJava);
    }
    static void cevap5() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
    static void cevap6() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int toplam = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Toplam: " + toplam);
    }
    static void cevap7() {
        List<String> kelime = new ArrayList<>();
        kelime.add("ahmet");
        kelime.add("mehmet");
        kelime.add("veli");


        kelime.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
    static void cevap8() {
        List<Integer> numbers = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("1 ile 10 arasındaki sayılar: " + numbers);
    }
    static void cevap9(){
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("");
        strings.add("Python");
        strings.add(" ");
        strings.add("C++");

        strings.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .forEach(System.out::println);
    }
    static void cevap10(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        Integer min = numbers.stream()
                .min(Integer::compareTo)
                .orElse(null); // Liste boşsa null döner

        System.out.println("En küçük sayı: " + min);
    }

}
