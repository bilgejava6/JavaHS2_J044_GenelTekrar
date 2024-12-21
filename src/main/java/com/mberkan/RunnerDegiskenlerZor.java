package com.mberkan;

import java.util.Scanner;

public class RunnerDegiskenlerZor {
    public static void main(String[] args) {
    cevap10();
     Cevap8 cv = new Cevap8();
    }
    public static void cevap1(){
        System.out.println("Lutfen bir String girisi yapiniz");
        String str = new Scanner(System.in).nextLine();
        try {
            int number =Integer.parseInt(str);
            System.out.println(number);

        }catch (Exception e){
            System.out.println("Girdiginiz sayi integer degildir.");
        }

        }

        class cevap2{
        int intdegisken = 1;
        float floatdegisken = 2;
        double doubledegisken = 3;
        char chardegisken = 'A';

            public int getIntdegisken() {
                return intdegisken;
            }

            public void setIntdegisken(int intdegisken) {
                this.intdegisken = intdegisken;
            }

            public float getFloatdegisken() {
                return floatdegisken;
            }

            public void setFloatdegisken(float floatdegisken) {
                this.floatdegisken = floatdegisken;
            }

            public double getDoubledegisken() {
                return doubledegisken;
            }

            public void setDoubledegisken(double doubledegisken) {
                this.doubledegisken = doubledegisken;
            }

            public char getChardegisken() {
                return chardegisken;
            }

            public void setChardegisken(char chardegisken) {
                this.chardegisken = chardegisken;
            }
        }
        public static void cevap3(){
        final double PI = 3.14;
            int daireninYariCapi = 4;

            Double daireninAlani = daireninYariCapi* daireninYariCapi*PI;
            System.out.println(daireninAlani);
            // burda pi sabittir degeri final atanmıştır değiştirelemez.

        }
        public static void cevap4(){
        int degisken = -5;

        if(degisken<0){
            degisken =-degisken;
        }
            System.out.println(degisken);

        }
        public static void cevap5(){
        int s1 = 5;
        float s2 = 6;
        short s3 = 7;
        long s4 = 66;
        long max = s4;
        if(s3>s4 && s3>s2 && s3>s1){
            max = s3;
        } else if (s2>s4 && s2>s3 && s2>s1) {
            max = (long) s2;
        }else if(s1>s4 && s1>s3 && s1>s2){
            max = (long) s1;
        }
        System.out.println(max);
        }
        public static void cevap6(){
            System.out.println("Lutfen 1. degeri giriniz");
            int s1 = new Scanner(System.in).nextInt();
            System.out.println("Lutfen 2. degeri giriniz");
            int s2 = new Scanner(System.in).nextInt();
            if(s1==s2) {
                System.out.println(s1 + s2);
            }
        }
        public static void cevap7(){
        int sayi = 5;
        String sayi1 = String.valueOf((int)sayi);
        System.out.println(sayi1);
        }
        public static void cevap9(){
            int sayi=1;
            sayi += 50;
            sayi +=15;
            System.out.println(sayi);
        }
        public static void cevap10(){
            System.out.println("String bir ifade giriniz..");
            String str = new Scanner(System.in).nextLine();
            System.out.println("Sayi giriniz");
            int sayi = new Scanner(System.in).nextInt();
            String ifade = str + " "+String.valueOf(sayi);
            System.out.println(ifade);
        }

}
class Cevap8{
    public static void main(String[] args) {
        staticOrnek();
        // noStatic methodu main methodda çalismaz.


    }
    public static void staticOrnek(){
        System.out.println("Gitti");
    }
    public void noStatic(){
        System.out.println("geldi");
    }
}
