package com.mberkan;

import java.util.*;

public class RunnerCollectionsOrtaa {
    public static void main(String[] args) {
    cevap10();
    }
    static void cevap1(){
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Ali",1);
        hashMap.put("Baha",2);
        hashMap.put("Ceyda",3);
        for (String list : hashMap.keySet()) {
            System.out.println(list);
        }
        for (Integer values : hashMap.values()) {
            System.out.println(values);
        }
    }
    static void cevap2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Deniz");
        list.add("Rabia");
        list.add("Ceyda");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    static void cevap3(){
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"Ali");
        treeMap.put(4,"Deniz");
        treeMap.put(3,"Rabia");
        treeMap.put(2,"Ceyda");
        System.out.println(treeMap);
    }
    static void cevap4(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Ahmet");
        queue.add("Mehmet");
        queue.add("Ayse");

        System.out.println(queue);
        System.out.println("Bastaki eleman: " + queue.peek());
        System.out.println("Cikarilan: " + queue.poll());
        System.out.println(queue);
    }
    void cevap5(){
        /**
         * HashSet tekrarsız elemanlarla işlem yapmak istediğimizde kullanırız ve sıralamanın da önemsiz oldugu durumlarda.
         * ArrayList sıralı bir yapı istediğinizde ve tekrar eden elemanlara izin verdiğimizde kullanırız.
         */
    }
    static void cevap6() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(4);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
    static void cevap7(){
        HashMap<String, Integer> map = new HashMap<>();

        if(map.keySet().isEmpty()|| map.values().isEmpty()) {
            System.out.println("Map bos");
        }else System.out.println("Doludur");

    }
    static void cevap8(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(list);
        System.out.println(hashSet);
    }
    static void cevap9(){
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(4);
        System.out.println(treeSet);
    }
    static void cevap10(){
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Ali");
        linkedHashMap.put(4, "Deniz");
        linkedHashMap.put(3, "Rabia");
        System.out.println(linkedHashMap);
        linkedHashMap.put(2,"Ahmet");
        System.out.println(linkedHashMap);


    }
}
