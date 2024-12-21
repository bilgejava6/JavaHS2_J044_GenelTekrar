package com.serkankilicdere.string.kolay;

import java.util.Scanner;

public class kolay {
    /*
                        Kolay
                  * 	1.	Bir String oluşturun ve uzunluğunu konsola yazdırın.
                  * 	2.	“Java Programlama” metnini büyük harflerle ekrana yazdıran bir kod yazın.
                  * 	3.	Kullanıcıdan bir metin girmesini isteyin ve metnin ilk harfini konsola yazdırın.
                  * 	4.	“Merhaba Dünya” ifadesinde “Dünya” kelimesinin başlangıç indeksini bulun.
                  * 	5.	Bir String oluşturun ve ters çevirerek konsola yazdırın.
                  * 	6.	İki String değişken tanımlayın ve bu değişkenlerin eşit olup olmadığını kontrol edin.
                  * 	7.	Bir String oluşturun ve boş olup olmadığını kontrol eden bir kod yazın.
                  * 	8.	“Java çok eğlenceli!” ifadesindeki tüm boşlukları kaldırarak yeni metni yazdırın.
                  * 	9.	Kullanıcıdan bir kelime girmesini isteyin ve kelimenin içinde “a” harfinin olup olmadığını kontrol edin.
                  * 	10.	“Hello” ve “World” metinlerini birleştirerek konsola yazdırın.
     */
    public static void main(String[] args) {
        //1.	Bir String oluşturun ve uzunluğunu konsola yazdırın.
        String str1="serkankilicdere";
        System.out.println(str1.length());

        //2.	“Java Programlama” metnini büyük harflerle ekrana yazdıran bir kod yazın.
        String str2="Java Programlama";
        System.out.println(str2.toUpperCase());

        //3.	Kullanıcıdan bir metin girmesini isteyin ve metnin ilk harfini konsola yazdırın.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String str3=sc.nextLine();
        System.out.println(str3.charAt(0));

        //4.	“Merhaba Dünya” ifadesinde “Dünya” kelimesinin başlangıç indeksini bulun.

        String str4="Merhaba Dunya";
        int index=str4.indexOf("Dunya");
        System.out.println(index);

        //5.	Bir String oluşturun ve ters çevirerek konsola yazdırın.

        String str5="Merhaba Dunya";
        String tersMetin="";
        for (int i = str5.length(); i > 0; i--) {
            tersMetin+=str5.charAt(i);
        }
        System.out.println(tersMetin);
    }
}
