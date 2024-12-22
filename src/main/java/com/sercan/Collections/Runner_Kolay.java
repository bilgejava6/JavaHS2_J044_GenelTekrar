package com.sercan.Collections;

import java.util.*;

public class Runner_Kolay {
    public static void main(String[] args) {
        /*** Collections - Kolay
         * 	1.	Bir ArrayList oluşturun ve içine 5 adet sayı ekleyip konsola yazdırın.
         * 	2.	Bir HashSet oluşturun ve içine birkaç aynı değeri ekleyin. HashSet’in tekrar eden değerleri kabul edip etmediğini gözlemleyin.
         * 	3.	Bir LinkedList oluşturun ve bu listeye eleman ekleyip çıkararak listeyi yazdırın.
         * 	4.	Bir TreeSet kullanarak elemanların doğal sıralamasını kontrol edin.
         * 	5.	Bir HashMap oluşturun ve içine anahtar-değer çiftleri ekleyip yazdırın.
         * 	6.	Bir PriorityQueue oluşturun ve elemanları ekledikten sonra sırayla çıkartarak yazdırın.
         * 	7.	Bir ArrayList’in boyutunu öğrenmek için hangi metodu kullanacağınızı gösterin.
         * 	8.	Bir HashSet içinde bir elemanın var olup olmadığını kontrol eden bir program yazın.
         * 	9.	Bir HashMap’te bir anahtarın değeri nasıl güncellenir? Örnekle açıklayın.
         * 	10.	Bir LinkedList’te bir elemanın başa ve sona eklenmesini sağlayan metotları kullanarak bir örnek yazın.
         *
         */
       cevap9();
    }

    public static void cevap1(){
        ArrayList<Integer> arrayList=  new ArrayList<>();
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(25);
        arrayList.add(35);
        arrayList.add(445);

    }

    public static void cevap2(){
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(15);
        hashSet.add(25);
        hashSet.add(15);
        hashSet.add(35);
        hashSet.add(25);
        System.out.println(hashSet);


    }

    public static void cevap3(){
        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("Ahmet");
        linkedList.add("Mehmet");
        linkedList.add("Fatih");
        linkedList.add("Hatice");
        linkedList.remove(2);
        System.out.println(linkedList);
    }

    public static void cevap4(){
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Ahmet");
        treeSet.add("Zeynep");
        treeSet.add("Volkan");
        treeSet.add("Batuhan");
        treeSet.add("Hatice");
        treeSet.add("Mahmut");
        System.out.println(treeSet);
    }

    public static void  cevap5(){
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Ahmet");
        hashMap.put(2,"Volkan");
        hashMap.put(3,"Zeynep");
        hashMap.put(4,"Irmak");
        hashMap.put(5,"Deniz");
        System.out.println(hashMap);

    }

    public static void cevap6(){
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();
        priorityQueue.offer(5);
        priorityQueue.offer(15);
        priorityQueue.offer(335);
        priorityQueue.offer(455);
        priorityQueue.offer(125);
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }


    }

    public static void cevap7(){
        ArrayList<Integer> arrayList=  new ArrayList<>();
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(25);
        arrayList.add(35);
        arrayList.add(445);
        arrayList.add(1055);

        System.out.println(arrayList.size());
    }

    public static void cevap8(){
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Ahmet");
        hashSet.add("Volkan");
        hashSet.add("Zeynep");
        hashSet.add("Irmak");
        hashSet.add("Deniz");

        if (hashSet.isEmpty()){
            System.out.println("Boş");
        }else System.out.println("Dolu"+hashSet);
    }

    public static void cevap9(){
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Ahmet");
        hashMap.put(2,"Volkan");
        hashMap.put(3,"Zeynep");
        hashMap.put(4,"Irmak");
        hashMap.put(5,"Deniz");
        hashMap.replace(1,"Mehmet");
        System.out.println(hashMap);
    }

    public static void cevap10(){
        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("Ahmet");
        linkedList.add("Gürkan");
        linkedList.add("Samet");
        linkedList.add("Hatice");
        linkedList.add("Irmak");
        linkedList.addFirst("Deniz");
        linkedList.addLast("Zeynep");
        System.out.println(linkedList);
    }

}
