package com.elifcan.degiskenler;

import java.util.Scanner;

public class Runner_Degiskenler_Zor {
    public static void main(String[] args) {
        cevap7();
        System.out.println(DegiskenFarkliliklari.y);
        System.out.println(DegiskenFarkliliklari.x);
    }
    private static void cevap1(String str){
        try{
            int sayi = Integer.parseInt((String) str);
            System.out.println("Sayi : " + sayi);
        }catch(NumberFormatException e){
            System.out.println("Bu String integera dönüştürülemez.");
        }

    }
    private static void cevap3(){
        final int son = 12;
    }
    private static int cevap4(int neg){
        int negative;
        negative = neg;
        if(neg < 0){
            int positive = negative*-1;
            return positive;
        }
        return negative;
    }
    private static void cevap5(){
        byte maxValueByte = Byte.MAX_VALUE;
        short maxValueShort = Short.MAX_VALUE;
        int maxValueInt = Integer.MAX_VALUE;
        long maxValueLong = Long.MAX_VALUE;
        System.out.println("Byte Max Value : " + maxValueByte);
        System.out.println("Short Max Value : " + maxValueShort);
        System.out.println("Int Max Value : " + maxValueInt);
        System.out.println("Long Max Value : " + maxValueLong);

    }
    private static void cevap6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        Long sayi1 = sc.nextLong();
        System.out.println("Lütfen ikinci bir sayı giriniz : ");
        Long sayi2 = sc.nextLong();
        byte maxValueByte = Byte.MAX_VALUE;
        short maxValueShort = Short.MAX_VALUE;
        int maxValueInt = Integer.MAX_VALUE;
        long maxValueLong = Long.MAX_VALUE;
        if(sayi1<=maxValueByte && sayi2<=maxValueShort){
            System.out.println(sayi1+sayi2);
        }
        else if(maxValueByte<sayi1 && sayi1<=maxValueShort && maxValueByte<sayi2 && sayi2<=maxValueShort){
            System.out.println(sayi1+sayi2);
        }
        else if(maxValueShort<sayi1 && sayi1<=maxValueInt && maxValueShort<sayi2 && sayi2<=maxValueInt){
            System.out.println(sayi1+sayi2);
        }
        else if(maxValueInt<sayi1 && sayi1<=maxValueLong && maxValueInt<sayi2 && sayi2<=maxValueLong){
            System.out.println(sayi1+sayi2);
        }
        else{
            System.out.println("türleri eşleşmemektedir.");
        }

    }
    private static void cevap7(){
        int sayi = 12;
        // 1. dönüşüm
        String donusum1 = String.valueOf(sayi);
        // 2. dönüşüm
        String donusum2 = Integer.toString(sayi);
        System.out.println(donusum1 + " ve " + donusum2);
    }

}
// 2. Soru
class Sayisinifi{
    private int x;
    private float y;
    private double z;
    private char c;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }
}

// 8. Soru
class DegiskenFarkliliklari{
    int x = 12; // psvm'de çağırıldığında çıkmıyor
    static float y = 3.14f; // psvm'de çağırıldığında çıkıyor
}
