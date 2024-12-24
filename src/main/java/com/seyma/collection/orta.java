package com.seyma.collection;

import java.util.*;

public class orta {
    /**
     * 	1.	Bir HashMap’te tüm anahtarları ve değerleri döngü ile yazdıran bir program yazın.
     * 2.	Bir ArrayList’i sıralamak için Collections.sort() yöntemini kullanın.
     * 3.	Bir TreeMap kullanarak anahtarların doğal sıralandığını gözlemleyin.
     * 4.	Bir LinkedList’i bir kuyruk (queue) gibi kullanarak eleman ekleme ve çıkarma işlemleri yapın.
     * 5.	Bir HashSet ile ArrayList arasındaki farkları örneklerle açıklayın.
     * 6.	Bir PriorityQueue kullanarak elemanları öncelik sırasına göre yazdıran bir program yazın.
     * 7.	Bir HashMap içinde belirli bir anahtarın veya değerin olup olmadığını kontrol eden bir kod yazın.
     * 8.	Bir ArrayList içindeki tekrarlayan elemanları bir HashSet kullanarak kaldırın.
     *  9.	Bir TreeSet kullanarak bir dizi sayıyı sıralayın ve sıralamanın nasıl çalıştığını açıklayın.
     *   10.	Bir LinkedHashMap kullanarak ekleme sırasının korunduğunu gösteren bir program yazın.
     *
     *
     */
    public static void main(String[] args) {


        //Soru 1

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
            for (Integer key : map.keySet()) {
                System.out.println(map.get(key) + " " + key);

            }

     //   Soru2

        ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(25);
            list1.add(3);
            list1.add(43);
            Collections.sort(list1);
            System.out.println("Liste1.....:"+list1);

    //Soru3

        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(1, "a");
        map2.put(4, "b");
        map2.put(6, "c");
        map2.put(3, "d");
        map2.put(9, "e");
        System.out.println("TREE MAP2....:"+map2);
        for (Integer key : map2.keySet()) {
            System.out.println(map2.get(key) + " " + key);
        }

    //Soru 4

       Queue<String> queue1 = new LinkedList<>();
        queue1.add("a");
        queue1.add("b");
        queue1.add("c");
        queue1.add("d");

        System.out.println("QUEUE1....:"+queue1);
        queue1.poll();
        System.out.println("QUEUE2....:"+queue1);













    }
}
