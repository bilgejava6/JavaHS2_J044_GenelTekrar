package com.onur.collections.orta;

import java.util.*;

public class OrtaRunner {

    public static void main(String[] args) {

        //1. Bir HashMap’te tüm anahtarları ve değerleri döngü ile yazdıran bir program yazın.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Bir", 1);
        map.put("İki", 2);
        map.put("Üç", 3);
        map.put("Dört", 4);
        map.put("Beş", 5);
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        //2. Bir ArrayList’i sıralamak için Collections.sort() yöntemini kullanın.
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(1);
        Collections.sort(sayilar);
        System.out.println(sayilar);

        //3. Bir TreeMap kullanarak anahtarların doğal sıralandığını gözlemleyin.
        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("Bir", 1);
        map2.put("İki", 2);
        map2.put("Üç", 3);
        map2.put("Dört", 4);
        map2.put("Beş", 5);
        System.out.println(map2);

        //4. Bir LinkedList’i bir kuyruk (queue) gibi kullanarak eleman ekleme ve çıkarma işlemleri yapın.
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("Kuyruktan çıkarılan eleman: " + queue.poll());
        System.out.println("Kuyruktan çıkarılan eleman: " + queue.poll());
        System.out.println("Kuyruktan çıkarılan eleman: " + queue.poll());

        System.out.println("Kuyruk: " + queue);

        //5. Bir HashSet ile ArrayList arasındaki farkları örneklerle açıklayın.
        // HashSet tekrar eden elemanları kabul etmezken, ArrayList tekrar eden elemanları kabul eder.
        List<Integer> sayilar2 = List.of(1, 2, 3, 4, 5, 5, 5, 5);
        System.out.println(sayilar2);
        Set<Integer> sayilar3 = new HashSet<>();

        sayilar3.add(1);
        sayilar3.add(2);
        sayilar3.add(3);
        sayilar3.add(4);
        sayilar3.add(5);
        sayilar3.add(5);
        sayilar3.add(5);
        sayilar3.add(5);
        System.out.println(sayilar3);

        //6. Bir PriorityQueue kullanarak elemanları öncelik sırasına göre yazdıran bir program yazın.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(3);
        pq.offer(7);
        pq.offer(1);
        pq.offer(9);

        System.out.println("Öncelik Kuyruğu (Doğal Sıralama):");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // poll() en küçük elemanı çıkarır
        }
        System.out.println();

        //7. Bir HashMap içinde belirli bir anahtarın veya değerin olup olmadığını kontrol eden bir kod yazın.
        HashMap<String, Integer> map3 = new HashMap<>();
        map3.put("Bir", 1);
        map3.put("İki", 2);
        map3.put("Üç", 3);
        map3.put("Dört", 4);
        map3.put("Beş", 5);
        System.out.println(map3.containsKey("Bir"));
        System.out.println(map3.containsValue(3));

        //8. Bir ArrayList içindeki tekrarlayan elemanları bir HashSet kullanarak kaldırın.
        List<Integer> sayilar4 = List.of(1, 2, 3, 4, 5, 5, 5, 5);
        Set<Integer> sayilar5 = new HashSet<>(sayilar4);
        System.out.println(sayilar5);

        //9. Bir TreeSet kullanarak bir dizi sayıyı sıralayın ve sıralamanın nasıl çalıştığını açıklayın.
        Set<Integer> sayilar6 = new TreeSet<>(sayilar4);
        System.out.println(sayilar6);
        // TreeSet elemanları sıralı bir şekilde tutar.

        //10. Bir LinkedHashMap kullanarak ekleme sırasının korunduğunu gösteren bir program yazın.
        Map<String, String> ulkeler = new LinkedHashMap<>();

        ulkeler.put("TR", "Türkiye");
        ulkeler.put("DE", "Almanya");
        ulkeler.put("FR", "Fransa");
        ulkeler.put("US", "Amerika Birleşik Devletleri");
        ulkeler.put("UK", "Birleşik Krallık");

        System.out.println("Ekleme Sırasına Göre Ülkeler:");
        for (Map.Entry<String, String> entry : ulkeler.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }




    }

}
