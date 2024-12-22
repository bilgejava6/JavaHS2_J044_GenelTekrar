package com.goksel.degiskenler;

import java.util.Scanner;

public class Runner_degisken_zor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // 1)

        System.out.println("(1) Lütfen bir metin girin: ");
        String girilenMetin = scanner.nextLine();

        try {
            int sayi1 = Integer.parseInt(girilenMetin);
            System.out.println("Girilen değer bir tamsayıdır: " + sayi1);
        } catch (NumberFormatException e) {
            System.out.println("Girilen değer bir tamsayı DEĞİL!");
        }

        // 2)

        VeriTasiyici vt = new VeriTasiyici();

        vt.setMyInt(10);
        vt.setMyFloat(3.14f);
        vt.setMyDouble(42.999);
        vt.setMyChar('X');

        System.out.println("(2) VeriTasiyici içerikleri:");
        System.out.println("    myInt    = " + vt.getMyInt());
        System.out.println("    myFloat  = " + vt.getMyFloat());
        System.out.println("    myDouble = " + vt.getMyDouble());
        System.out.println("    myChar   = " + vt.getMyChar());


        // 3)

        final int SABIT_SAYI = 10;
        System.out.println("(3) final değişkenin ilk değeri: " + SABIT_SAYI);
        // SABIT_SAYI = 20;  // hatalı sonuç
        System.out.println("    final değişkenler yeniden atanamaz!");


        // 4)

        int negatifSayi = -35;
        System.out.println("(4) Negatif sayı = " + negatifSayi);
        int pozitifSayi = Math.abs(negatifSayi);
        System.out.println("    Pozitif sayı = " + pozitifSayi);


        // 5)

        System.out.println("(5) Veri tiplerinin MAX değerleri:");
        System.out.println("    byte  max: " + Byte.MAX_VALUE);
        System.out.println("    short max: " + Short.MAX_VALUE);
        System.out.println("    int   max: " + Integer.MAX_VALUE);
        System.out.println("    long  max: " + Long.MAX_VALUE);


        // 6)

        System.out.print("(6) İlk sayıyı girin: ");
        String num1 = scanner.nextLine();
        System.out.print("    İkinci sayıyı girin: ");
        String num2 = scanner.nextLine();

        try {
            double sayi6_1 = Double.parseDouble(num1);
            double sayi6_2 = Double.parseDouble(num2);
            System.out.println("    Toplam: " + (sayi6_1 + sayi6_2));
        } catch (NumberFormatException e) {
            System.out.println("    Geçersiz sayı formatı!");
        }


        // 7)

        int sayi7 = 1234;
        String s1 = String.valueOf(sayi7);
        String s2 = Integer.toString(sayi7);

        System.out.println("(7) Dönüşümler:");
        System.out.println("    Orijinal int: " + sayi7);
        System.out.println("    String.valueOf: " + s1);
        System.out.println("    Integer.toString: " + s2);


        // 8) static ve  non-static

        StaticExample se1 = new StaticExample();
        StaticExample se2 = new StaticExample();

        System.out.println("(8) staticSayi: " + StaticExample.staticSayi);
        System.out.println("    se1.nonStaticSayi: " + se1.nonStaticSayi);
        System.out.println("    se2.nonStaticSayi: " + se2.nonStaticSayi);


        // 9)

        int sayi9 = 10;
        sayi9 += 5;
        System.out.println("(9) sayi += 5 -> " + sayi9);


        // 10)

        scanner.nextLine();
        System.out.print("(10) Bir metin girin: ");
        String metin = scanner.nextLine();
        System.out.print("     Bir sayı girin: ");
        int kullaniciSayisi = scanner.nextInt();

        System.out.println("     Birleştirilmiş çıktı: " + metin + " " + kullaniciSayisi);
    }


    // 2) get set
    static class VeriTasiyici {
        private int myInt;
        private float myFloat;
        private double myDouble;
        private char myChar;



        public int getMyInt() {
            return myInt;
        }

        public void setMyInt(int myInt) {
            this.myInt = myInt;
        }

        public float getMyFloat() {
            return myFloat;
        }

        public void setMyFloat(float myFloat) {
            this.myFloat = myFloat;
        }

        public double getMyDouble() {
            return myDouble;
        }

        public void setMyDouble(double myDouble) {
            this.myDouble = myDouble;
        }

        public char getMyChar() {
            return myChar;
        }

        public void setMyChar(char myChar) {
            this.myChar = myChar;
        }
    }


    // 8) nest
    static class StaticExample {
        static int staticSayi = 0;
        int nonStaticSayi = 0;

        StaticExample() {
            staticSayi++;
            nonStaticSayi++;
        }
    }
}
