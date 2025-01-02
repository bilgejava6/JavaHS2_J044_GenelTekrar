package com.sercan.Collections;

import java.util.*;

public class Runner_Orta {
    public static void main(String[] args) {
        /*** Collections - Orta
         * 	1.	Bir HashMap’te tüm anahtarları ve değerleri döngü ile yazdıran bir program yazın.
         * 	2.	Bir ArrayList’i sıralamak için Collections.sort() yöntemini kullanın.
         * 	3.	Bir TreeMap kullanarak anahtarların doğal sıralandığını gözlemleyin.
         * 	4.	Bir LinkedList’i bir kuyruk (queue) gibi kullanarak eleman ekleme ve çıkarma işlemleri yapın.
         * 	5.	Bir HashSet ile ArrayList arasındaki farkları örneklerle açıklayın.
         * 	6.	Bir PriorityQueue kullanarak elemanları öncelik sırasına göre yazdıran bir program yazın.
         * 	7.	Bir HashMap içinde belirli bir anahtarın veya değerin olup olmadığını kontrol eden bir kod yazın.
         * 	8.	Bir ArrayList içindeki tekrarlayan elemanları bir HashSet kullanarak kaldırın.
         * 	9.	Bir TreeSet kullanarak bir dizi sayıyı sıralayın ve sıralamanın nasıl çalıştığını açıklayın.
         * 	10.	Bir LinkedHashMap kullanarak ekleme sırasının korunduğunu gösteren bir program yazın.
         *
         */
        cevap7();
    }
    public static void cevap1(){
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Ahmet");
        hashMap.put(2,"Volkan");
        hashMap.put(3,"Zeynep");
        hashMap.put(4,"Irmak");
        hashMap.put(5,"Deniz");



    }

    public static void cevap2(){
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Ahmet");
        arrayList.add("Volkan");
       arrayList.add("Zeynep");
        arrayList.add("Irmak");
        arrayList.add("Deniz");
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    public static void cevap3(){
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(2,"Fatih");
        treeMap.put(4,"Ahmet");
        treeMap.put(1,"Hatice");
        treeMap.put(5,"Selim");
        treeMap.put(3,"Deniz");
        System.out.println(treeMap);


    }

    public static void cevap4(){

    }

    public static void cevap5(){
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Ahmet");
        hashSet.add("Volkan");
        hashSet.add("Zeynep");
        hashSet.add("Irmak");
        hashSet.add("Deniz");
        hashSet.add("Volkan");
        hashSet.add("Zeynep");
        System.out.println(hashSet);

        ArrayList<String> arrayList=  new ArrayList<>();
        arrayList.add("Ahmet");
        arrayList.add("Volkan");
        arrayList.add("Zeynep");
        arrayList.add("Irmak");
        arrayList.add("Deniz");
        arrayList.add("Volkan");
        arrayList.add("Zeynep");
        System.out.println(arrayList);


    }

    public static void cevap6(){

    }

    public static void cevap7(){
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Ahmet");
        hashMap.put(2,"Volkan");
        hashMap.put(3,"Zeynep");
        hashMap.put(4,"Irmak");
        hashMap.put(5,"Deniz");
        int key=2;
        if (hashMap.containsKey(key)){
            System.out.println(hashMap.get(key));
        }else {
            System.out.println("Bulunamadı");
        }
        String value="Ahmet";
        if (hashMap.containsValue(value)){
            System.out.println(value+" değeri mevcut.");


        }else {
            System.out.println("Bulunamadı");
        }
    }

    public static void cevap8(){
        ArrayList<Integer> arrayList=  new ArrayList<>();
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(25);
        arrayList.add(35);
        arrayList.add(15);
        arrayList.add(5);
        arrayList.add(1055);
        arrayList.add(445);
        arrayList.add(1055);

        System.out.println(arrayList);
        HashSet<Integer>hashSet=new HashSet<>(arrayList);
        System.out.println(hashSet);

    }

    public static void cevap9(){

    }


}
