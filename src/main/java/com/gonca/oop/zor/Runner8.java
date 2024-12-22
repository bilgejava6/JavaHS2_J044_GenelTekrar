package com.gonca.oop.zor;

import java.util.Collections;
import java.util.List;

public class Runner8 {

    //Bir sınıfta generics kullanarak, farklı türlerde çalışan bir metot tanımlayın (örneğin, bir listeyi sıralayan metot)
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);  // Sort the list using the natural ordering of the elements
    }

    public static void main(String[] args) {

        List<Integer> sayıListesi = List.of(10, 5, 7, 1, 3);
        System.out.println("lİSTE  " + sayıListesi);
        sortList(sayıListesi);  // Sorting the list of integers
        System.out.println("SIRALI LİSTE ): " + sayıListesi);
    }
}
