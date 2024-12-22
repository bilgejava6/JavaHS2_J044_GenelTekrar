package com.mberkan;

import java.util.*;

class RunnerCollectionsKolayy {
    public static void main(String[] args) {
        cevap10();
    }
     static void cevap1(){
         List<Integer> arrayLists = new ArrayList<>();
         arrayLists.add(5);
         arrayLists.add(6);
         arrayLists.add(7);
         arrayLists.add(8);
         arrayLists.add(9);
         System.out.println(arrayLists);
     }
     static void cevap2(){
         HashSet<Integer> hashSet = new HashSet<>();
         hashSet.add(5);
         hashSet.add(5);
         hashSet.add(7);
         hashSet.add(8);
         hashSet.add(8);
         System.out.println(hashSet);
     }
     static void cevap3(){
         LinkedList<String> linkedList = new LinkedList<>();
         linkedList.add("Elma");
         linkedList.add("Kiraz");
         linkedList.add("Muz");
         linkedList.add("Kivi");
         System.out.println(linkedList);
         linkedList.poll();
         System.out.println(linkedList);

     }
     static void cevap4(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(1);
        treeSet.add(9);
        System.out.println(treeSet);
         /**
          * Doğru sekilde siralanmistir A-Z,0-9
          */

     }
     static void cevap5(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Elma");
        hashMap.put(2, "Kiraz");
        hashMap.put(3, "Muz");
        hashMap.put(4, "Kivi");
        System.out.println(hashMap);
         System.out.println(hashMap.get(1));
     }
     static void cevap6(){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Ali");
        priorityQueue.add("Veli");
        priorityQueue.add("Tarik");
        priorityQueue.add("Soner");
         System.out.println(priorityQueue);
        priorityQueue.poll();
         System.out.println(priorityQueue);
         System.out.println(priorityQueue.peek());

     }
     static void cevap7(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Elma");
        arrayList.add("Kiraz");
        arrayList.add("Muz");
        int boyut = arrayList.size();
        System.out.println(boyut);
     }
     static void cevap8(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(6);
        Boolean bosMu = hashSet.isEmpty();
        System.out.println(bosMu);
     }
     static void cevap9(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Elma");
        hashMap.put(2,"Kiraz");
        hashMap.put(3,"Muz");
        hashMap.put(1,"Ayva");
        System.out.println(hashMap);
         /**
          * Javada yukarıdan aşağı şekilde kod yazarız burda da en son yazdığımız key listeyi günceller.
          *
          */
     }
     static void cevap10(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Elma");
        linkedList.add("Kiraz");
        linkedList.add("Muz");
        linkedList.add("Kivi");
        System.out.println(linkedList);
        linkedList.addFirst("Ejder meyvesi");
        System.out.println(linkedList);
        linkedList.addLast("Portakal");
        System.out.println(linkedList);
     }
 }
