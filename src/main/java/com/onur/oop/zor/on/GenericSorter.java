package com.onur.oop.zor.on;


import java.util.Collections;
import java.util.List;

public class GenericSorter {
    // Generic method to sort a list
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }
}
