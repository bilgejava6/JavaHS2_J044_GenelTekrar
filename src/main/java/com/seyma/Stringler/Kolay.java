package com.seyma.Stringler;

import java.util.Scanner;

public class Kolay {
    /**
     * 1.	Bir String oluşturun ve uzunluğunu konsola yazdırın.
     * *  2.	“Java Programlama” metnini büyük harflerle ekrana yazdıran bir kod yazın.
     * * 3.	Kullanıcıdan bir metin girmesini isteyin ve metnin ilk harfini konsola yazdırın.
     * *   4.	“Merhaba Dünya” ifadesinde “Dünya” kelimesinin başlangıç indeksini bulun.
     * *  5. Bir String oluşturun ve ters çevirerek konsola yazdırın.
     * *  6.	İki String değişken tanımlayın ve bu değişkenlerin eşit olup olmadığını kontrol edin.
     * *    7.	Bir String oluşturun ve boş olup olmadığını kontrol eden bir kod yazın.
     * *    8.	“Java çok eğlenceli!” ifadesindeki tüm boşlukları kaldırarak yeni metni yazdırın.
     * *   9.	Kullanıcıdan bir kelime girmesini isteyin ve kelimenin içinde “a” harfinin olup olmadığını kontrol edin.
     * *   10.	“Hello” ve “World” metinlerini birleştirerek konsola yazdırın.
     */

    public static void main(String[] args) {
        soru1();
        soru2();
        soru3();
        soru4();
        soru5();
        soru6();
        soru7();
        soru8();


    }


    public static void soru1() {
        String kelime = "deneme için yazıyorum";
        System.out.println("Karakter sayısı..:" + kelime.length());
    }

    public static void soru2() {
        String kelime1 = "Java Programlama";
        System.out.println(kelime1.toUpperCase());
    }

    public static void soru3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz..:");
        String kelime = scanner.nextLine();
        System.out.println("İlk harf.." + kelime.charAt(0));


    }

    public static void soru4() {

        String kelime2 = "Merhaba Dünya";
        int dunyaindex;
        dunyaindex = kelime2.indexOf("D");
        System.out.println("indexsin yeri..:" + dunyaindex);


    }

    public static void soru5() {


    }

    public static void soru6() {
        String deger = "Ayse";
        String deger2 = "Ayse2";
        if (deger == deger2) {
            System.out.println("İki değer eşit");
        } else
            System.out.println("Eşit değil");


    }

    public static void soru7() {

    }

    public static void soru8() {
        String kelime4 ="Java çok eğlenceli";
        String  kelime5= kelime4.replaceAll(" ","");
        System.out.println(kelime5);


    }


}
