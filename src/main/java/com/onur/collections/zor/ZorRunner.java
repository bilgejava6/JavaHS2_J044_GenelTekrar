package com.onur.collections.zor;

import java.util.*;

public class ZorRunner {
    public static void main(String[] args) {

        //1. Bir TreeMap oluşturun ve sıralama düzenini tersine çevirmek için bir Comparator kullanın.
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("1", "Onur");
        treeMap.put("2", "Ali");
        treeMap.put("3", "Veli");
        treeMap.put("4", "Mehmet");
        treeMap.put("5", "Ahmet");
        System.out.println(treeMap);
        TreeMap<String, String> tersTreeMap = new TreeMap<>(Collections.reverseOrder());
        tersTreeMap.putAll(treeMap);
        System.out.println(tersTreeMap);

        //2. Bir HashMap’i değerlerine göre sıralayıp sonucu yazdıran bir program yazın.
        Map<String, Integer> map = Map.of("Bir", 1, "İki", 2, "Üç", 3, "Dört", 4, "Beş", 5);
        System.out.println(map);
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);

        //3. Bir LinkedList’i bir yığın (stack) gibi kullanarak eleman ekleme ve çıkarma işlemleri yapın.
        LinkedList<Integer> stack = new LinkedList<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack after pushes: " + stack);

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pops: " + stack);

        //4. Bir ArrayList’i bir HashSet’e ve daha sonra tekrar bir ArrayList’e dönüştüren bir program yazın.
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
        List<Integer> list2 = new ArrayList<>(set);
        System.out.println(list2);

        //6. Bir PriorityQueue oluşturun ve özelleştirilmiş bir sıralama düzeni için bir Comparator kullanın.
        PriorityQueue<Integer> pq = new PriorityQueue<>(new CustomComparator());

        pq.offer(10);
        pq.offer(3);
        pq.offer(7);
        pq.offer(1);
        pq.offer(9);

        System.out.println("Priority Queue (Custom Order):");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

        //7. Bir HashMap ve TreeMap arasındaki performans farklarını analiz etmek için bir zaman ölçüm programı yazın.
        int size = 1000000;
        long startTime, endTime;

        // HashMap performance
        Map<Integer, Integer> hashMap = new HashMap<>();
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.put(i, i);
        }
        endTime = System.nanoTime();
        System.out.println("HashMap insertion time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashMap retrieval time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashMap deletion time: " + (endTime - startTime) + " ns");

        // TreeMap performance
        Map<Integer, Integer> treeMap2 = new TreeMap<>();
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeMap2.put(i, i);
        }
        endTime = System.nanoTime();
        System.out.println("TreeMap insertion time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeMap2.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("TreeMap retrieval time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeMap2.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("TreeMap deletion time: " + (endTime - startTime) + " ns");

        //9. Bir Deque (çift taraflı kuyruk) kullanarak elemanların hem baştan hem sondan eklenip çıkarılmasını sağlayan bir program yazın.
        Deque<Integer> deque = new LinkedList<>();

        // Add elements to the front and back
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);

        System.out.println("Deque after additions: " + deque);

        // Remove elements from the front and back
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from back: " + deque.removeLast());

        System.out.println("Deque after removals: " + deque);

    }
}
