package com.goksel.degiskenler;

public class Runner_Degiskenler {
    public static void main(String[] args) {
        // 1.
        int number = 10;
        System.out.println("1. Tamsayı değeri: " + number);

        // 2.
        double pi = 3.14;
        System.out.println("2. Double değeri: " + pi);

        // 3.
        String name = "Ahmet";
        System.out.println("3. Merhaba, " + name + "!");

        // 4.
        boolean isActive = true;
        System.out.println("4. Boolean değeri: " + isActive);

        // 5.
        char firstLetter = 'A';
        System.out.println("5. İlk harf: " + firstLetter);

        // 6.
        int x = 5;
        int y = 7;
        System.out.println("6. Toplam: " + (x + y));

        // 7.
        Integer nullableNumber = null;
        System.out.println("7. Null değer: " + nullableNumber);
        nullableNumber = 100;
        System.out.println("7. Yeni değer: " + nullableNumber);

        // 8.
        // int denemesayi;
        // System.out.println(denemesayi);

        // 9.
        float decimal = 2.5f; // f son eki float olduğunu belirtir
        System.out.println("9. Float değeri: " + decimal);

        // 10.
        byte maxByte = 127;
        System.out.println("10. Byte değeri: " + maxByte);
    }
}