package com.elifcan.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Runner_StreamAPI_Kolay {
    public static void main(String[] args) {
        cevap10();
    }
    private static void cevap1(){
        List<Integer> sayiListe = new ArrayList<>();
        sayiListe.add(188);
        sayiListe.add(2);
        sayiListe.add(30);
        sayiListe.add(48);
        sayiListe.add(5);
        sayiListe.stream().forEach(System.out::println);
    }
    private static void cevap2(){
        List<String> strListe = new ArrayList<>();
        strListe.add("Fizik");
        strListe.add("Kimya");
        strListe.add("Matematik");
        strListe.add("Biyoloji");
        strListe.stream().sorted().forEach(System.out::println);
    }
    private static void cevap3(){
        List<Integer> sayiListe = new ArrayList<>();
        sayiListe.add(188);
        sayiListe.add(2);
        sayiListe.add(30);
        sayiListe.add(48);
        sayiListe.add(5);
        sayiListe.stream().map(x->x * x).forEach(System.out::println);
    }
    private static void cevap4(){
        List<String> strListe = new ArrayList<>();
        strListe.add("Fizik");
        strListe.add("Kimya");
        strListe.add("Matematik");
        strListe.add("Biyoloji");
        strListe.stream().filter(x->x.contains("Kimya")).forEach(System.out::println);
    }
    private static void cevap5(){
        List<Integer> sayiListe = new ArrayList<>();
        sayiListe.add(188);
        sayiListe.add(2);
        sayiListe.add(30);
        sayiListe.add(48);
        sayiListe.add(5);
        sayiListe.stream().filter(x->x % 2 == 0).forEach(System.out::println);
    }
    private static void cevap6(){
        List<Integer> sayiListe = new ArrayList<>();
        sayiListe.add(188);
        sayiListe.add(2);
        sayiListe.add(30);
        sayiListe.add(48);
        sayiListe.add(5);
        sayiListe.stream().reduce((x, y)-> x +y ).ifPresent(System.out::println);
    }
    private static void cevap7(){
        List<String> strListe = new ArrayList<>();
        strListe.add("Fizik");
        strListe.add("Kimya");
        strListe.add("Matematik");
        strListe.add("Biyoloji");
        strListe.stream().map(x->x.toUpperCase()).forEach(System.out::println);
    }
    private static void cevap8(){
        Stream <Integer> checkList =Stream.iterate(1, n -> n < 10 , c -> c + 1);
        checkList.forEach(System.out::println);
    }
    private static void cevap9(){
        List<String> strListe = new ArrayList<>();
        strListe.add("Fizik");
        strListe.add("Kimya");
        strListe.add("Matematik");
        strListe.add("Biyoloji");
        strListe.add("");
        strListe.stream().filter(x->x != "").forEach(System.out::println);
    }
    private static void cevap10(){
        List<Integer> sayiListe = new ArrayList<>();
        sayiListe.add(188);
        sayiListe.add(2);
        sayiListe.add(30);
        sayiListe.add(48);
        sayiListe.add(5);
        System.out.println(sayiListe.stream().min(Integer::compareTo).get());
    }
}
