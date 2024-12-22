package com.serkankilicdere.string.orta;

import java.util.Scanner;

public class Orta {

    /*
                        Orta
                  * 	1.	Bir metni tersine çeviren bir program yazın ve ters metni ekrana yazdırın.
                  * 	2.	Kullanıcıdan bir cümle girmesini isteyin ve bu cümledeki kelime sayısını ekrana yazdırın.
                  * 	3.	“Bugün hava çok güzel” cümlesindeki tüm “a” harflerini “e” ile değiştiren bir kod yazın.
                  * 	4.	Bir metin oluşturun ve içindeki tüm rakamları kaldırarak yeni metni yazdırın.
                  * 	5.	Kullanıcıdan bir cümle isteyin ve cümlenin palindrome olup olmadığını kontrol eden bir kod yazın.
                  * 	6.	Kullanıcıdan bir kelime alın ve bu kelimenin her harfini alt alta yazdıran bir kod yazın.
                  * 	7.	Bir String oluşturun ve ilk 3 karakterini tekrar eden bir metin oluşturun (örneğin: abc → abcabcabc).
                  * 	8.	“programlama” kelimesindeki tüm sesli harfleri sayan bir program yazın.
                  * 	10.	Kullanıcıdan bir cümle alın ve her kelimenin ilk harfini büyük yaparak yeni bir cümle oluşturun.
     */

    public static void main(String[] args) {

        //1.	Bir metni tersine çeviren bir program yazın ve ters metni ekrana yazdırın.
        Scanner sc = new Scanner(System.in);
        System.out.print("Metni giriniz: ");
        String metin = sc.nextLine();
        String tersMetin="";

        for (int i = metin.length()-1; i >=0; i--) {
            tersMetin+=metin.charAt(i);
        }
        System.out.println(tersMetin);

        System.out.println("""
                ---------------------------------------------
                """);

        //2.	Kullanıcıdan bir cümle girmesini isteyin ve bu cümledeki kelime sayısını ekrana yazdırın.

        System.out.println("cumleyi giriniz:  ");
        String cumle = sc.nextLine();

        String[] cumleArray = cumle.split(" ");
        System.out.println(cumleArray.length);

        System.out.println("""
                ---------------------------------------------
                """);

        //3.	“Bugün hava çok güzel” cümlesindeki tüm “a” harflerini “e” ile değiştiren bir kod yazın.

        String str1="Bugün hava çok güzel";
        System.out.println(str1.replace("a","e"));

        System.out.println("""
                ---------------------------------------------
                """);

        //4.	Bir metin oluşturun ve içindeki tüm rakamları kaldırarak yeni metni yazdırın.

        String str2="5 kere 4 esittir 20";
        String yeni=str2.replaceAll("[0-9]","");
        System.out.println(yeni);


    }





}
