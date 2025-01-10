package com.elifcan.donguler;


import java.util.ArrayList;
import java.util.HashSet;

public class Runner_Donguler_Zor {
    public static void main(String[] args) {
       cevap9(1235);
    }

    public static void cevap1(int x) {
        ArrayList<Integer> primeFactor = new ArrayList<>();
        for (int number = 1; number < x+1; number++) {
            if (x % number == 0){
                boolean state = true;
                if (number == 1){
                    state = false;

                }
                for (int i = 2; i < number; i++) {
                    if (number % i == 0){
                        state = false;
                        break;
                    }
                }
                if (state){
                    primeFactor.add(number);
                }
            }
        }
        System.out.println(primeFactor);
    }
    public static void cevap2(int[] serial) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < serial.length; i++) {
            if (serial[i] % 2 == 0) {
                even.add(i);
            }
            else {
                odd.add(i);
            }
        }
        System.out.println("Even numbers : " + even);
        System.out.println("Odd numbers : " + odd);
    }
    public static void cevap3(int x) {
        int sum = 0;
        for ( int i = 1; i < x; i++){
            if ( x % i == 0){
                sum += i;
            }
        }
        if ( x == sum){
            System.out.println(x + " is perfect number.");
        }
        else{
            System.out.println(x + " is not perfect number.");
        }
    }
    public static void cevap4(String statement) {

    }
    public static void cevap5(int x) {
        ArrayList<Integer> binaryList = new ArrayList<>();
        while (x != 0 ) {
            int kalan = x % 2;
            x /= 2;
            binaryList.add(kalan);
        }
        for ( int i = binaryList.size()-1; i > -1 ; i--){
            System.out.print(binaryList.get(i));
        }
    }
    public static void cevap6(Object [] x) {
        int j = 0;
        HashSet<Object> set = new HashSet<>();
        while (j != x.length){
            Object obje = x[j];
            for ( int i = j+1 ; i < x.length ; i++){ // i = 1 , 2
                if (obje.equals(x[i])){
                    set.add(obje);
                }
            }
            j += 1;
        }
        for ( Object obje : set){
            System.out.println(obje);
        }
    }
    public static void cevap7() {
        for (int y = 1; y < 8; y++) {
            for ( int x = 1; x < 10; x++ ) {
                if ( (x == 1 && y != 3) || (x == 2 && y == 1) || (x == 2 && y == 5) || (x == 2 && y == 6) || (x == 2 && y == 7)
                || ( x == 3 && y == 6 ) || (x == 3 && y == 7 ) || (x == 4 && y == 7) || (x == 6 && y == 7) || ( x == 7 && y == 7)
                || ( x == 7 && y == 6)|| (x == 8 && y == 1) || (x == 8 && y == 5) || (x == 8 && y == 6) || (x == 8 && y == 7)
                || (x == 9 && y != 3) ) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
    public static void cevap8(int x) {
        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        System.out.println(reverse);
    }
    public static void cevap9(int x) {

    }
}
