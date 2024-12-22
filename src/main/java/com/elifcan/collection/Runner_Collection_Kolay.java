package com.elifcan.collection;

import java.util.*;

public class Runner_Collection_Kolay {
    public static void main(String[] args) {
        cevap10();
    }
    private static void cevap1(){
        ArrayList<Integer> sayiListe = new ArrayList<>();
        sayiListe.add(1);
        sayiListe.add(2);
        sayiListe.add(3);
        sayiListe.add(4);
        sayiListe.add(5);
        System.out.println(sayiListe);
    }
    private static void cevap2(){
        HashSet<String> sayiSet = new HashSet<>();
        sayiSet.add("Ankara");
        sayiSet.add("İstanbul");
        sayiSet.add("Ankara");
        System.out.println(sayiSet); // [�stanbul, Ankara]
    }
    private static void cevap3(){
        LinkedList<Integer> sayiListe = new LinkedList<>();
        sayiListe.add(1);
        sayiListe.add(2);
        sayiListe.add(3);
        sayiListe.add(4);
        System.out.println(sayiListe);
        sayiListe.remove(0);
        System.out.println(sayiListe);
    }
    private static void cevap4(){
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Ankara");
        treeSet.add("Trabzon");
        treeSet.add("Antalya");
        treeSet.add("Zonguldak");
        System.out.println(treeSet); //[Ankara, Antalya, Trabzon, Zonguldak]
    }
    private static void cevap5(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ankara", 1);
        map.put("Trabzon", 2);
        map.put("Antalya", 3);
        map.put("Zonguldak", 4);
        System.out.println(map);
    }
    private static void cevap6(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(121);
        priorityQueue.add(25);
        priorityQueue.add(302);
        priorityQueue.add(45);
        priorityQueue.add(5);
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
    private static void cevap7(){
        ArrayList<Integer> sayiListe = new ArrayList<>();
        sayiListe.add(1);
        sayiListe.add(2);
        sayiListe.add(3);
        sayiListe.add(4);
        sayiListe.add(5);
        System.out.println(sayiListe.size());
    }
    private static void cevap8(){
        HashSet<String> sayiSet = new HashSet<>();
        sayiSet.add("Ankara");
        sayiSet.add("İzmir");
        sayiSet.add("Amsterdam");
        sayiSet.add("Tokyo");
        System.out.println(sayiSet.contains("Tokyo"));
    }
    private static void cevap9(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ankara", 1);
        map.put("Trabzon", 2);
        map.put("Antalya", 3);
        map.put("Zonguldak", 4);
        map.replace("Ankara",1,0);
        System.out.println(map);
    }
    private static void cevap10(){
        LinkedList<Integer> sayiListe = new LinkedList<>();
        sayiListe.add(1);
        sayiListe.add(2);
        sayiListe.add(3);
        sayiListe.add(4);
        sayiListe.addFirst(0);
        sayiListe.addLast(5);
        System.out.println(sayiListe);
    }
}
