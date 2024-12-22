package com.mberkan;

import java.util.Comparator;
import java.util.TreeMap;

public class RunnerCollectionsZor {
    public static void main(String[] args) {
    cevap1();
    }
    static void cevap1() {
        Comparator<String> ters = Comparator.reverseOrder();

        TreeMap<String, Integer> treeMap = new TreeMap<>(ters);

        treeMap.put("A", 1);
        treeMap.put("B", 2);
        treeMap.put("C", 3);
        treeMap.put("D", 4);
        treeMap.put("E", 5);

        for (String key : treeMap.keySet()) {
            System.out.println("Anahtar: " + key + ", Deger: " + treeMap.get(key));
        }
        }
    }
