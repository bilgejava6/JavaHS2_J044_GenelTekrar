package com.gonca.collectionornekler;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        //	Bir ArrayList oluşturun ve içine 5 adet sayı ekleyip konsola yazdırın.
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);



        //	2.	Bir HashSet oluşturun ve içine birkaç aynı değeri ekleyin. HashSet’in tekrar
        //	eden değerleri kabul edip etmediğini gözlemleyin.

        Set<Integer> list1=new HashSet<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.add(2);

        System.out.println(list1);



        // 	3.	Bir LinkedList oluşturun ve bu listeye eleman ekleyip çıkararak listeyi yazdırın.
         List<Integer> list2=new LinkedList<>();
         list2.add(15);
         list2.add(20);
         list2.add(30);
         list2.add(4);
         list2.add(5);

        System.out.println(list2);
         list2.remove(2);
        System.out.println(list2);



        // 	4.	Bir TreeSet kullanarak elemanların doğal sıralamasını kontrol edin.

        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(4);
        System.out.println(treeSet);



        //	5.	Bir HashMap oluşturun ve içine anahtar-değer çiftleri ekleyip yazdırın.

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"elma");
        map.put(2,"armut");
        map.put(3,"ayva");
        map.put(4,"muz ");
        map.put(5,"kivi");
        System.out.println(map);


        //6.	Bir PriorityQueue oluşturun ve elemanları ekledikten sonra sırayla çıkartarak yazdırın.
           PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
           priorityQueue.add(1);
           priorityQueue.add(2);
           priorityQueue.add(3);
           priorityQueue.add(4);

           for(int i=0;i< priorityQueue.size();i++){
               System.out.println(priorityQueue.poll());
           }


        //	7.	Bir ArrayList’in boyutunu öğrenmek için hangi metodu kullanacağınızı gösterin.
        List<String> list3=new ArrayList<>();
        list3.add("elma");
        list3.add("armut");
        int boyut=list3.size();




        //	8.	Bir HashSet içinde bir elemanın var olup olmadığını kontrol eden bir program yazın.

              Set<Integer> set1=new HashSet<>();
              set1.add(1);
              set1.add(2);
              set1.add(3);
              set1.add(4);
            if(set1.contains(2))
            {
                System.out.println(" Liste içerinde 2 değeri bulunmaktadır");

            }
            else {
                System.out.println("Bulunmamaktadır ");
            }


        // 	9.	Bir HashMap’te bir anahtarın değeri nasıl güncellenir? Örnekle açıklayın.
        Map<Integer,String> map2=new HashMap<>();
        map2.put(1,"elma");
        map2.put(2,"armut");
        map2.put(3,"ayva");

        map2.put(2, "muz");// bu şekilde güncelenir



        // 	10.	Bir LinkedList’te bir elemanın başa ve sona eklenmesini sağlayan metotları kullanarak bir örnek yazın.
        List<Integer> list4=new LinkedList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        System.out.println(list4);
        list4.addFirst(0);
        list4.addLast(5);

        System.out.println(list4);

    }
}
