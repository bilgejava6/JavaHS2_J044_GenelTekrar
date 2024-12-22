package com.onur.collections.zor;
import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // Custom sorting logic: sort in descending order
        return o2 - o1;
    }
}
