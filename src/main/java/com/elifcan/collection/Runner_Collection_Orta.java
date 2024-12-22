package com.elifcan.collection;

import java.util.*;

public class Runner_Collection_Orta {
    public static void main(String[] args) {

    }
    private static void cevap1(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Merkür");
        map.put(2, "Venüs");
        map.put(3, "Dünya");
        map.put(4, "Mars");
        for(HashMap.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ". Gezegen " + entry.getValue());
        }
    }
    private static void cevap2(){
        ArrayList<Integer> sayiListe = new ArrayList<>();
        sayiListe.add(188);
        sayiListe.add(2);
        sayiListe.add(30);
        sayiListe.add(48);
        sayiListe.add(5);
        Collections.sort(sayiListe);
        System.out.println(sayiListe);
    }
    private static void cevap3(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Dünya");
        map.put(1, "Merkür");
        map.put(4, "Mars");
        map.put(2, "Venüs");
        System.out.println(map); // {1=Merk�r, 2=Ven�s, 3=D�nya, 4=Mars}
    }
    private static void cevap4(){
        Queue<Integer> sayiListe = new LinkedList<>();
        sayiListe.add(1);
        sayiListe.add(2);
        sayiListe.add(3);
        sayiListe.add(4);
        System.out.println(sayiListe);
        sayiListe.offer(5);
        sayiListe.offer(6);
        System.out.println(sayiListe);
        sayiListe.poll();
        System.out.println(sayiListe);
    }
    private static void cevap5(){
        ArrayList<Integer> sayiListe = new ArrayList<>();
        sayiListe.add(5);
        sayiListe.add(2);
        sayiListe.add(6);
        sayiListe.add(4);
        sayiListe.add(5);

        HashSet<Integer> sayiListeSet = new HashSet<>();
        sayiListeSet.add(5);
        sayiListeSet.add(2);
        sayiListeSet.add(6);
        sayiListeSet.add(4);
        sayiListeSet.add(5);

        System.out.println(sayiListe); // [5, 2, 6, 4, 5]
        System.out.println(sayiListeSet); // [2, 4, 5, 6] hem sıralamış hem de tekrar eden elemanları çıkarmış
    }

}
