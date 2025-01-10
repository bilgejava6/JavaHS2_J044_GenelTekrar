package com.elifcan.donguler;

public class Runner_Donguler_Orta {
    public static void main(String[] args) {
        cevap1(8);
    }

    public static void cevap1 (int number){
        for(int j = 0; j < number; j++){
            boolean state = true;
            if (j == 0 | j == 1){
                state = false;

            }
            for (int i = 2; i < j; i++) {
                if (j % i == 0){
                    state = false;
                    break;
                }
            }
            if (state){
                System.out.println(j + " is prime number.");
            }
            else{
                System.out.println(j + " is not prime number.");
            }
        }

    }
    private static void cevap2(int sayi){

    }
    private static void cevap3(){
        System.out.println("******* Carpim Tablosu *******");
        System.out.println("   1  2  3  4  5  6  7  8  9  10");
        for (int i = 1; i <= 10; i++) {
            if ( i < 10){
                System.out.print(i + "  ");
            }
            else{
                System.out.print(i + " ");
            }

            for ( int j = 1 ; j <= 10 ; j++){
                if ( i*j < 10){
                    System.out.print(i*j + "  ");
                }
                else if (i*j <= 100){
                    System.out.print(i*j + " ");
                }


            }
            System.out.println();
        }
    }
    private static void cevap4(long sayi){
        String str = String.valueOf(sayi);
        StringBuilder stringBuilder = new StringBuilder(str);
        String newString = stringBuilder.reverse().toString();
        long newLong = Long.parseLong(newString);
        System.out.println(newLong);
    }
    private static void cevap5(String kelime){
        String [] strlist = kelime.split("");
        for(String harf : strlist) {
            System.out.println(harf);
        }
    }
    private static void cevap6(){
        int toplam = 0;
        for(int i = 0; i < 100; i++){
            toplam += i;
        }
        System.out.println(toplam);
    }
    private static void cevap7(){
        int[] liste = {1,2,3,4,5,43,1,246,78};
        int min = liste[0];
        int max = liste[0];
        for(int i : liste){
            if(i < min) min = i;
            if(i > max) max = i;
        }
        System.out.println("En küçük sayı : " + min);
        System.out.println("En büyük sayı : " + max);
    }
    private static void cevap8(int sayi){

        while(sayi % 10 == 0){
            int kalan = 0;
            int us = 1;
            if(sayi % 10 != 0){
                kalan += sayi % 10;
                sayi -= kalan;
                us++;
            }
        }
    }
}
