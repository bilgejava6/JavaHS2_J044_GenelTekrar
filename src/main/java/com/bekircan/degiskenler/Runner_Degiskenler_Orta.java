package com.bekircan.degiskenler;

import java.util.Scanner;

/**
 * *    	-- ORTA
 *          * 	1.	Kullanıcıdan yaşını isteyin ve bunu bir değişkende saklayarak konsola yazdırın.
 *          * 	2.	Bir final değişken oluşturun ve ona bir sabit değer atayın. Daha sonra bu değeri değiştirmeye çalışın ve ne olduğunu açıklayın.
 *          * 	3.	İki String değişkeni tanımlayın, birine adınızı, diğerine soyadınızı atayın. Bu değişkenleri birleştirerek tam adınızı konsola yazdırın.
 *          * 	4.	Bir double ve bir int değişken oluşturup bunları topladığınızda çıkan sonucun türü nedir? Test ederek gösterin.
 *          * 	5.	Bir String değişkenine bir sayısal değer ("123") atayın ve bunu bir int değişkenine dönüştürerek toplama işlemi yapın.
 *          * 	6.	long türünde bir değişken tanımlayın ve 1 milyar gibi büyük bir sayı atayın. Sonuçta bir hata alır mısınız?
 *          * 	7.	Bir değişken tanımlayın ve önce int, sonra float, ardından String türüne dönüştürerek konsola yazdırın.
 *          * 	8.	Kullanıcıdan bir kelime girmesini isteyin ve bu kelimenin uzunluğunu hesaplayan bir program yazın.
 *          * 	9.	Bir short değişken oluşturup bir int değişkenine atayın. Bu işlem sırasında bir hata alır mısınız?
 */
public class Runner_Degiskenler_Orta {
    public static void main(String[] args) {
        System.out.println("*** 1. soru ***");

        int yas;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = sc.nextInt();
        System.out.println("1. soru; kullanıcıdan alınan yaş: " + yas);

        System.out.println("*** 2. soru ***");

        final int sabitDeger = 42;
        System.out.println("Başlangıç değeri: " + sabitDeger);
        // sabitDeger = 100; // error: cannot assign a value to final variable sabitDeger .
        // final olarak işaretlenmiş değişkenler yalnızca bir kez atanır.
        System.out.println("Güncellenmiş değer: " + sabitDeger);

        System.out.println("*** 3. soru ***");

        String adiniz = "Bekir Can";
        String soyadiniz = "Yumrutepe";
        System.out.println("3. soru; " + adiniz + " " + soyadiniz);

        System.out.println("*** 4. soru ***");

        double soru4sayi1 = 2.3;
        int soru4sayi2 = 5;
        double topla = soru4sayi1 + soru4sayi2;
        System.out.println("4. soru; " + topla);

        System.out.println("*** 5. soru ***");
        // Bir String değişkenine bir sayısal değer ("123") atayın ve bunu bir int değişkenine dönüştürerek toplama işlemi yapın.

        String soru5sayi1 = "123";
        int soru5sayi2 = Integer.valueOf(soru5sayi1);
        System.out.println("5. soru; " + soru5sayi2);

        System.out.println("*** 6. soru ***");
        // long türünde bir değişken tanımlayın ve 1 milyar gibi büyük bir sayı atayın. Sonuçta bir hata alır mısınız?

        long soru6sayi1 = 1_000_000_000L;
        System.out.println(soru6sayi1);

        System.out.println("*** 7. soru ***");
        // Bir değişken tanımlayın ve önce int, sonra float, ardından String türüne dönüştürerek konsola yazdırın.

        int sayi = 42;
        System.out.println("int türünde: " + sayi);
        System.out.println("float türünde: " + (float) sayi);
        System.out.println("String türünde: " + String.valueOf((float) sayi));

        System.out.println("*** 8. soru ***");
        // 8.	Kullanıcıdan bir kelime girmesini isteyin ve bu kelimenin uzunluğunu hesaplayan bir program yazın.



    }
}
