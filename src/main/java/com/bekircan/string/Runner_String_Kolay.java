package com.bekircan.string;

import java.util.Locale;
import java.util.Scanner;

/**
 ** Kolay
 *          * 	1.	Bir String oluşturun ve uzunluğunu konsola yazdırın.
 *          * 	2.	“Java Programlama” metnini büyük harflerle ekrana yazdıran bir kod yazın.
 *          * 	3.	Kullanıcıdan bir metin girmesini isteyin ve metnin ilk harfini konsola yazdırın.
 *          * 	4.	“Merhaba Dünya” ifadesinde “Dünya” kelimesinin başlangıç indeksini bulun.
 *          * 	5.	Bir String oluşturun ve ters çevirerek konsola yazdırın.
 *          * 	6.	İki String değişken tanımlayın ve bu değişkenlerin eşit olup olmadığını kontrol edin.
 *          * 	7.	Bir String oluşturun ve boş olup olmadığını kontrol eden bir kod yazın.
 *          * 	8.	“Java çok eğlenceli!” ifadesindeki tüm boşlukları kaldırarak yeni metni yazdırın.
 *          * 	9.	Kullanıcıdan bir kelime girmesini isteyin ve kelimenin içinde “a” harfinin olup olmadığını kontrol edin.
 *          * 	10.	“Hello” ve “World” metinlerini birleştirerek konsola yazdırın.
 */

public class Runner_String_Kolay {
    // soru 1
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Girilen kelimenin uzunluğu: " + str.length());
    // soru 2
        String str2 = "Java Programlama";
        System.out.println(str2 + " " + str2.toUpperCase());
    // soru 3
        String str3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir metin girin: ");
        str3 = sc.next();

        System.out.println("Metnin ilk harfi: " + (str3.isEmpty() ? "Boş metin" : str3.charAt(0)));
    // soru 4 “Merhaba Dünya” ifadesinde “Dünya” kelimesinin başlangıç indeksini bulun.
        String str4 = "Merhaba Dünya";
        int baslangicIndex = str4.indexOf("Dünya");
        System.out.println("Baslangic Index: " + baslangicIndex);
    // soru 5 Bir String oluşturun ve ters çevirerek konsola yazdırın.
        String str5 = "Bekir Can";
        String ters= "";
        for (int i = str5.length() - 1; i >= 0; i--) {
            ters += str5.charAt(i);
        }
        System.out.println("Orijinal metin: " + str5);
        System.out.println("Ters metin: " + ters);
    }
}
