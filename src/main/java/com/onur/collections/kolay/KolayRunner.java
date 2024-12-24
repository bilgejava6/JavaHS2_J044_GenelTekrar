package com.onur.collections.kolay;

import java.util.*;

public class KolayRunner {

    public static void main(String[] args) {

        //1. Bir ArrayList oluşturun ve içine 5 adet sayı ekleyip konsola yazdırın.
        List<Integer> sayilar = List.of(1, 2, 3, 4, 5);
        System.out.println(sayilar);

        //2. Bir HashSet oluşturun ve içine birkaç aynı değeri ekleyin. HashSet’in tekrar eden değerleri kabul edip etmediğini gözlemleyin.
        Set<Integer> sayilar2 = Set.of(1, 2, 3, 4, 5, 5, 5, 5);
        System.out.println(sayilar2);

        //3. Bir LinkedList oluşturun ve bu listeye eleman ekleyip çıkararak listeyi yazdırın.
        LinkedList<Integer> sayilar3 = new LinkedList<>();

        sayilar3.offer(1);
        sayilar3.offer(2);
        sayilar3.offer(3);
        sayilar3.offer(4);
        sayilar3.offer(5);

        System.out.println(sayilar3);

        sayilar3.poll();
        sayilar3.poll();

        System.out.println(sayilar3);

        //4. Bir TreeSet kullanarak elemanların doğal sıralamasını kontrol edin.
        Set<Integer> sayilar4 = Set.of(5, 4, 3, 2, 1);
        System.out.println(sayilar4);

        //5. Bir HashMap oluşturun ve içine anahtar-değer çiftleri ekleyip yazdırın.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Bir", 1);
        map.put("İki", 2);
        map.put("Üç", 3);
        map.put("Dört", 4);
        map.put("Beş", 5);
        System.out.println(map);

        //6. Bir PriorityQueue oluşturun ve elemanları ekledikten sonra sırayla çıkartarak yazdırın.
        PriorityQueue<Integer> sayilar5 = new PriorityQueue<>();

        sayilar5.offer(5);
        sayilar5.offer(4);
        sayilar5.offer(3);
        sayilar5.offer(2);
        sayilar5.offer(1);

        while (!sayilar5.isEmpty()) {
            System.out.println(sayilar5.poll());
        }


        //7. Bir ArrayList’in boyutunu öğrenmek için hangi metodu kullanacağınızı gösterin.
        List<Integer> sayilar6 = List.of(1, 2, 3, 4, 5);
        System.out.println(sayilar6.size());

        //8. Bir HashSet içinde bir elemanın var olup olmadığını kontrol eden bir program yazın.
        Set<Integer> sayilar7 = Set.of(1, 2, 3, 4, 5);
        System.out.println(sayilar7.contains(3));

        //9. Bir HashMap’te bir anahtarın değeri nasıl güncellenir? Örnekle açıklayın.
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Bir", 1);
        map2.put("İki", 2);
        map2.put("Üç", 3);
        map2.put("Dört", 4);
        map2.put("Beş", 5);
        map2.put("Bir", 10);
        System.out.println(map2);

        //10. Bir LinkedList’te bir elemanın başa ve sona eklenmesini sağlayan metotları kullanarak bir örnek yazın.
        LinkedList<Integer> sayilar8 = new LinkedList<>();
        sayilar8.offerFirst(1);
        sayilar8.offerLast(5);
        System.out.println(sayilar8);

    }

}
