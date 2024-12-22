package com.gonca.collectionornekler;

import java.util.*;

public class Run3 {
    public static void main(String[] args) {
        //	Bir TreeMap oluşturun ve sıralama düzenini tersine çevirmek için bir Comparator kullanın.
        TreeMap<Integer,String> tmap=new TreeMap<>(Comparator.reverseOrder());
        tmap.put(1,"A");
        tmap.put(2,"B");
        tmap.put(3,"C");
        tmap.put(4,"D");

        System.out.println("Ters sıralı TreeMap:");
        for (var entry : tmap.entrySet()) {
            System.out.println("Anahtar: " + entry.getKey() + ", Değer: " + entry.getValue());
        }

        // ***	2.	Bir HashMap’i değerlerine göre sıralayıp sonucu yazdıran bir program yazın.
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "elma");
        hashMap.put(2, "muz");
        hashMap.put(3, "armut");
        hashMap.put(4, "çilek");
        hashMap.put(5, "ayva");

        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(hashMap.entrySet());

        entryList.sort(Map.Entry.comparingByValue());

        System.out.println("Değerlerine göre sıralanmış sonuç:");
        for (Map.Entry<Integer, String> entry : entryList) {
            System.out.println("Anahtar: " + entry.getKey() + ", Değer: " + entry.getValue());
        }


        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("LinkedHashMap (değerlerine göre sıralı): " + sortedMap);

        //	3.	Bir LinkedList’i bir yığın (stack) gibi kullanarak eleman ekleme ve çıkarma işlemleri yapın.

        LinkedList<String> stack = new LinkedList<>();


        stack.push("ali");
        stack.push("veli");
        stack.push("ayşe");
        stack.push("canan");

        System.out.println("Çıkarılan eleman: " + stack.pop());
        System.out.println("Çıkarılan eleman: " + stack.pop());


        // 	4.	Bir ArrayList’i bir HashSet’e ve daha sonra tekrar bir ArrayList’e dönüştüren bir program yazın.
        List<Integer> list= List.of(1,5,4,8,7,9);
        Set<Integer> set=new HashSet<>(list);
        List<Integer> list2=new ArrayList<>(set);

        // 	6.	Bir PriorityQueue oluşturun ve özelleştirilmiş bir sıralama düzeni için bir Comparator kullanın.


        //	7.	Bir HashMap ve TreeMap arasındaki performans farklarını analiz etmek için bir zaman ölçüm programı yazın.

        long start=System.currentTimeMillis();
        Map<Integer,String> map1=new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");
        map1.put(4,"D");
        map1.put(5,"E");
        map1.put(6,"F");
        map1.put(7,"G");

        for(Map.Entry<Integer,String> entry : map1.entrySet()) {
            System.out.println(map1);
        }
        long end=System.currentTimeMillis();

        System.out.println("Geçen süre " + (end-start) + " ms");

        long baslangic=System.currentTimeMillis();
        Map<Integer,String> map2=new TreeMap<>();
        map2.put(1,"A");
        map2.put(2,"B");
        map2.put(3,"C");
        map2.put(4,"C");
        map2.put(5,"E");
        map2.put(6,"F");
        map2.put(7,"G");

        for(Map.Entry<Integer,String> entry : map2.entrySet()) {
            System.out.println(map2);
        }

        long bitis=System.currentTimeMillis();
        System.out.println("Geçen süre " + (bitis-baslangic) + " ms");


        // 	9.	Bir Deque (çift taraflı kuyruk) kullanarak elemanların hem baştan hem sondan
        // 	eklenip çıkarılmasını sağlayan bir program yazın.

        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);

        arrayDeque.removeFirst();
        arrayDeque.addFirst(0);
        arrayDeque.removeLast();

        // 	10.	Bir ArrayDeque kullanarak bir kelimeyi tersine çeviren bir program yazın.

        ArrayDeque<Character> stack1 = new ArrayDeque<>();

        stack1.push('E');
        stack1.push('L');
        stack1.push('M');
        stack1.push('A');

        StringBuilder reversedWord = new StringBuilder();
        while (!stack1.isEmpty()) {
            reversedWord.append(stack.pop());
        }

        System.out.println("Ters çevrilmiş kelime: " + reversedWord);


    }
}
