package com.sercan.String;

import java.util.Scanner;

public class Runner_Orta {
    public static void main(String[] args) {
        /*** Orta
         * 	1.	Bir metni tersine çeviren bir program yazın ve ters metni ekrana yazdırın.
         * 	2.	Kullanıcıdan bir cümle girmesini isteyin ve bu cümledeki kelime sayısını ekrana yazdırın.
         * 	3.	“Bugün hava çok güzel” cümlesindeki tüm “a” harflerini “e” ile değiştiren bir kod yazın.
         * 	4.	Bir metin oluşturun ve içindeki tüm rakamları kaldırarak yeni metni yazdırın.
         * 	5.	Kullanıcıdan bir cümle isteyin ve cümlenin palindrome olup olmadığını kontrol eden bir kod yazın.
         * 	6.	Kullanıcıdan bir kelime alın ve bu kelimenin her harfini alt alta yazdıran bir kod yazın.
         * 	7.	Bir String oluşturun ve ilk 3 karakterini tekrar eden bir metin oluşturun (örneğin: abc → abcabcabc).
         * 	8.	“programlama” kelimesindeki tüm sesli harfleri sayan bir program yazın.
         * 	10.	Kullanıcıdan bir cümle alın ve her kelimenin ilk harfini büyük yaparak yeni bir cümle oluşturun.
         *
         **/
        cevap1();
    }

    public static void cevap1(){
        String metin="Java çok eğlenceli";
        String tersMetin="";
        for (int i=metin.length()-1;i>=0;i--){
            tersMetin+=metin.charAt(i);
        }
        System.out.println(tersMetin);
    }

    public static void cevap2(){
        Scanner sc=new Scanner(System.in);

    }
}
