package com.seyma.collection;

import java.util.*;

public class kolay {
    /**
     *   1.	Bir ArrayList oluşturun ve içine 5 adet sayı ekleyip konsola yazdırın.
     *    2.	Bir HashSet oluşturun ve içine birkaç aynı değeri ekleyin. HashSet’in tekrar eden değerleri kabul edip etmediğini gözlemleyin.
     *    3.	Bir LinkedList oluşturun ve bu listeye eleman ekleyip çıkararak listeyi yazdırın.
     *   4.	Bir TreeSet kullanarak elemanların doğal sıralamasını kontrol edin.
     *   5.	Bir HashMap oluşturun ve içine anahtar-değer çiftleri ekleyip yazdırın.
     *   6.	Bir PriorityQueue oluşturun ve elemanları ekledikten sonra sırayla çıkartarak yazdırın.
     *   7.	Bir ArrayList’in boyutunu öğrenmek için hangi metodu kullanacağınızı gösterin.
     *   8.	Bir HashSet içinde bir elemanın var olup olmadığını kontrol eden bir program yazın.
     *   9.	Bir HashMap’te bir anahtarın değeri nasıl güncellenir? Örnekle açıklayın.
     *   10.	Bir LinkedList’te bir elemanın başa ve sona eklenmesini sağlayan metotları kullanarak bir örnek yazın.
     */


    public static void main(String[] args) {

//Soru1
        ArrayList<Integer>Sayilar=new ArrayList<>();
        Sayilar.add(1);
        Sayilar.add(2);
        Sayilar.add(3);
        Sayilar.add(4);
        Sayilar.add(5);
        System.out.println("ARRAYLİST..:"+Sayilar);

//Soru2

        HashSet<String> deger =new HashSet<>();
        deger.add("a");
        deger.add("b");
        deger.add("c");
        deger.add("a");
        deger.add("b");
        System.out.println("HASHSET..:"+deger);
        //Tekrar eden değerleri yazmaz

//Soru3

        LinkedList <String> linkedList =new LinkedList();
        linkedList.add("ahmet");
        linkedList.add("ali");
        linkedList.add("ayse");
        linkedList.add("asya");
        linkedList.add("aras");
        System.out.println("LINKEDLIST..:"+linkedList);
        linkedList.remove("asya");
        System.out.println("LINKEDLIST..:"+linkedList);

//soru4

        Set<String> kelimeListesi = new TreeSet<>();
        kelimeListesi.add("Okul");
        kelimeListesi.add("Karpuz");
        kelimeListesi.add("Kitap");
        kelimeListesi.add("Bavul");
        kelimeListesi.add("Tarak");

        System.out.println("KELIMELIST..:"+kelimeListesi); //yan yana

        for (String kelime : kelimeListesi) { //liste şeklinde
            System.out.println(kelime);
        }

//soru5

        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");
        hashMap.put(4,"d");
        hashMap.put(5,"e");
        System.out.println("HASHMAP..:"+hashMap);

//Soru6

        Queue<String> queue=new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        System.out.println("QUEUE..:"+queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


 //Soru 7
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");

        System.out.println("LIST BOYUT..:"+list.size());

//Soru 8

        HashSet<String> hashsetListe=new HashSet<>();
        hashsetListe.add("ali");
        hashsetListe.add("beril");
        hashsetListe.add("cengiz");

        String kontrol="beril";
        if (hashsetListe.contains(kontrol)) {
            System.out.println("Var");
        }else
            System.out.println("yok");

//Soru 9
        HashMap<Integer,String> hashMap2=new HashMap<>();
        hashMap2.put(1,"a");
        hashMap2.put(2,"b");
        hashMap2.put(3,"c");
        hashMap2.put(4,"d");
        hashMap2.put(5,"e");
        System.out.println("HASHMAP2..:"+hashMap2);

        //Doğrudan bir yolu yok

        int key=1;
        int yenikey=6;

        hashMap2.remove(key);
        hashMap2.put(yenikey,"a");
        System.out.println(hashMap2);
//Soru 10
        LinkedList <String> linkedList2 =new LinkedList();
        linkedList2.add("ahmet");
        linkedList2.add("ali");
        linkedList2.add("ayse");
        linkedList2.addFirst("Şeyma");
        linkedList2.addLast("Faruk");
        for (String isim : linkedList2) {
            System.out.println(isim);
        }






























    }


}

