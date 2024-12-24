package com.goksel.collections;

import java.util.*;

public class Runner_collect_kolay {

    public static void main(String[] args) {

        // 1.

        System.out.println("\n--- 1. Soru: ArrayList Oluşturma ---");
        ArrayList<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(42);
        sayilar1.add(243);
        sayilar1.add(35);
        sayilar1.add(32);
        sayilar1.add(47);
        System.out.println("ArrayList elemanları: " + sayilar1);

        // 2.

        System.out.println("\n--- 2. Soru: HashSet Oluşturma ---");
        HashSet<String> isimler1 = new HashSet<>();
        isimler1.add("Hasan");
        isimler1.add("Kerem");
        isimler1.add("Ayşe");
        isimler1.add("Hasan");
        System.out.println("HashSet elemanları: " + isimler1);
        System.out.println("HashSet tekrar eden değerleri kabul etmez.");

        // 3.

        System.out.println("\n--- 3. Soru: LinkedList İşlemleri ---");
        LinkedList<String> sehirler = new LinkedList<>();
        sehirler.add("Adana");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        System.out.println("LinkedList (ekleme sonrası): " + sehirler);
        sehirler.remove("İstanbul");
        System.out.println("LinkedList (çıkarma sonrası): " + sehirler);

        // 4.

        System.out.println("\n--- 4. Soru: TreeSet Sıralama ---");
        TreeSet<Integer> sayilar2 = new TreeSet<>();
        sayilar2.add(52);
        sayilar2.add(21);
        sayilar2.add(35);
        sayilar2.add(12);
        sayilar2.add(44);
        System.out.println("TreeSet elemanları (doğal sıralama): " + sayilar2);

        // 5.

        System.out.println("\n--- 5. Soru: HashMap Oluşturma ---");
        HashMap<String, String> ogrenciler = new HashMap<>();
        ogrenciler.put("123", "Kerim");
        ogrenciler.put("456", "Veli");
        ogrenciler.put("789", "Fatma");
        System.out.println("HashMap elemanları: " + ogrenciler);

        // 6.

        System.out.println("\n--- 6. Soru: PriorityQueue Eleman Çıkarma ---");
        PriorityQueue<Integer> sayilar3 = new PriorityQueue<>();
        sayilar3.add(5);
        sayilar3.add(1);
        sayilar3.add(3);
        sayilar3.add(2);
        sayilar3.add(4);
        System.out.println("PriorityQueue elemanları (çıkarılmadan önce): " + sayilar3);
        while (!sayilar3.isEmpty()) {
            System.out.println("Çıkarılan eleman: " + sayilar3.poll() + ", Kalan: " + sayilar3);
        }


        // 7.

        System.out.println("\n--- 7. Soru: ArrayList Boyut Öğrenme ---");
        ArrayList<String> isimler2 = new ArrayList<>();
        isimler2.add("Deniz");
        isimler2.add("Derya");
        isimler2.add("Davut");
        int boyut = isimler2.size();
        System.out.println("ArrayList'in boyutu: " + boyut);

        // 8.

        System.out.println("\n--- 8. Soru: HashSet Eleman Kontrol ---");
        HashSet<String> isimler3 = new HashSet<>();
        isimler3.add("Huseyin");
        isimler3.add("Hasan");
        isimler3.add("Ahmet");
        boolean varMi = isimler3.contains("Veli");
        System.out.println("HashSet içinde 'Veli' var mı: " + varMi);

        // 9.

        System.out.println("\n--- 9. Soru: HashMap Değer Güncelleme ---");
        HashMap<String, String> telefonlar = new HashMap<>();
        telefonlar.put("Ahmet", "123-456-7890");
        telefonlar.put("Kerim", "987-654-3210");
        System.out.println("HashMap (güncelleme öncesi): " + telefonlar);
        telefonlar.put("Ahmet", "555-555-5555");
        System.out.println("HashMap (güncelleme sonrası): " + telefonlar);

        // 10.

        System.out.println("\n--- 10. Soru: LinkedList Başa/Sona Ekleme ---");
        LinkedList<String> renkler = new LinkedList<>();
        renkler.add("Kırmızı");
        renkler.add("Mavi");
        System.out.println("LinkedList (ekleme öncesi): " + renkler);
        renkler.addFirst("Sarı");
        renkler.addLast("Yeşil");
        System.out.println("LinkedList (ekleme sonrası): " + renkler);


    }
}