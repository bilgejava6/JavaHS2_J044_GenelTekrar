package com.gonca.collectionornekler;

import java.util.*;

public class Run2 {
    public static void main(String[] args) {
        //	Bir HashMap’te tüm anahtarları ve değerleri döngü ile yazdıran bir program yazın.

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        for(Map.Entry<Integer,String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        // 	2.	Bir ArrayList’i sıralamak için Collections.sort() yöntemini kullanın.

        List<Integer> list=List.of(1,5,78,6,7,50,69);
        Collections.sort(list);

        // 	3.	Bir TreeMap kullanarak anahtarların doğal sıralandığını gözlemleyin.
        TreeMap<Integer,String> map2=new TreeMap<>();
        map2.put(1,"Ankara");
        map2.put(3,"İSTANBUL ");
        map2.put(2,"RİZE ");
        map2.put(4,"ordu");
        System.out.println(map2);


        //	4.	Bir LinkedList’i bir kuyruk (queue) gibi kullanarak eleman ekleme ve çıkarma işlemleri yapın.

        List<Integer> list2=new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        list2.remove(2);
        list2.add(45);

        // 	5.	Bir HashSet ile ArrayList arasındaki farkları örneklerle açıklayın.
        Set<Integer> setornek=new HashSet<>();
        setornek.add(1);
        setornek.add(2);
        setornek.add(3);
        setornek.add(4);
        setornek.add(1);  // sette aynı elemanı eklesen bile elemanı ekranda bir defa gösterir
        System.out.println(setornek);

        List<Integer> list3=List.of(1,1,2,2,3,4);
        System.out.println(list3);


        // 	6.	Bir PriorityQueue kullanarak elemanları öncelik sırasına göre yazdıran bir program yazın.
        PriorityQueue<Integer> queue = new PriorityQueue<>();


        queue.add(10);
        queue.add(5);
        queue.add(20);
        queue.add(15);


        System.out.println("PriorityQueue elemanları:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


        // 	7.	Bir HashMap içinde belirli bir anahtarın veya değerin olup olmadığını
        // 	kontrol eden bir kod yazın.

        Map<Integer,String>  map3=new HashMap<>();
        map3.put(1,"Gemi");
        map3.put(2,"Uçak");
        map3.put(3,"Araba");


            if(map3.containsKey(1))
            {
                System.out.println("Liste içerisinde aradığınız anahtar bulunmaktadır ");
            }
            else
            {
                System.out.println("Liste içinde aranılan anahtar bulunmamaktadır ");
            }




        // 	8.	Bir ArrayList içindeki tekrarlayan elemanları bir HashSet kullanarak kaldırın.

        List<Integer> list4=List.of(1,1,2,2,2,3,5,8,9);
            Set<Integer> setornek4= new HashSet<>(list4);



        //	9.	Bir TreeSet kullanarak bir dizi sayıyı sıralayın ve sıralamanın nasıl çalıştığını açıklayın.
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(5); // Tekrarlı eleman

        System.out.println("TreeSet elemanları (sıralı): " + treeSet);


        //	10.	Bir LinkedHashMap kullanarak ekleme sırasının korunduğunu gösteren bir program yazın.
    }
}
