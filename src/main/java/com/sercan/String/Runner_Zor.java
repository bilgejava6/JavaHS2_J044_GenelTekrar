package com.sercan.String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Runner_Zor {
    public static void main(String[] args) {
        /*** Zor (ÖDEV OLARAK KALSIN)
         * 	1.	Kullanıcıdan bir String alın ve içindeki kelimelerin sırasını ters çevirerek konsola yazdırın.
         * 	2.	Kullanıcıdan bir cümle alarak her kelimenin karakterlerini ters çeviren bir program yazın.
         * 	3.	“Merhaba Dünya” metnindeki tüm harflerin ASCII değerlerini ekrana yazdıran bir kod yazın.
         * 	4.	Kullanıcıdan bir kelime alın ve içinde tekrarlanan karakterleri çıkararak yeni bir kelime oluşturun.
         * 	5.	Kullanıcıdan bir cümle alın ve cümledeki en uzun kelimeyi ekrana yazdırın.
         * 	6.	Kullanıcıdan bir String alın ve bu metni şifrelemek için her harfi alfabede 3 karakter öteye taşıyan bir program yazın.
         * 	7.	Bir String’in anagram olup olmadığını kontrol eden bir kod yazın.
         * 	8.	Kullanıcıdan bir kelime alın ve kelimenin tüm olası permütasyonlarını konsola yazdırın.
         * 	9.	Kullanıcıdan bir cümle alın ve bu cümledeki kelimelerin uzunluğuna göre sıralama yapan bir program yazın.
         * 	10.	Kullanıcıdan iki metin alın ve ilk metnin ikinci metnin içinde kaç kez geçtiğini bulan bir kod yazın.
         *
         **/
        cevap6();
    }

    public static void cevap1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String cumle=sc.nextLine();
        String[] kelimeler=cumle.split(" ");
        String tersCumle="";
        for (int i= kelimeler.length-1;i>=0;i--){
            tersCumle+=kelimeler[i]+" ";
        }
        System.out.println(tersCumle.trim());
    }

    public static void cevap2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz:");        // java çok eğlenceli
        String cumle=sc.nextLine();
        String[] kelimeler=cumle.split(" ");
//        String terstenCumle="";
//        /**
//         * java
//         * çok
//         * eğlenceli
//         */
//        for (int i= kelimeler.length-1;i>=0;i--){
//            String kelime=kelimeler[i];
//            String tersKelime="";
//            for (int j= kelimeler.length-1;j>=0;j--){
//                tersKelime+=kelime.charAt(j);
//
//            }
//            terstenCumle+=tersKelime;
//        }
//        System.out.println(terstenCumle.trim());

        StringBuilder terstenCumle=new StringBuilder();

        for (String kelime:kelimeler){
            StringBuilder tersKelime=new StringBuilder(kelime);
            terstenCumle.append(tersKelime.reverse()).append(" ");

        }
        System.out.println(terstenCumle.toString().trim());
    }

    public static void cevap3(){
        String cumle="Merhaba Dünya";
        //String[] kelimeler=cumle.split(" ");

       for (int i=0;i<cumle.length();i++){
           char karakter=cumle.charAt(i);

           System.out.println(cumle.charAt(i)+" ------ "+(int)karakter);
       }


    }

    public static void cevap4(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime yazınız :");
        String kelime=sc.next();
        //mehmet
        LinkedHashSet<Character> karakterler=new LinkedHashSet<>();
        for (char c:kelime.toCharArray()){
            karakterler.add(c);
        }
        StringBuilder sonuc=new StringBuilder();
        for (char c:karakterler){
            sonuc.append(c);
        }
        System.out.println(sonuc);

        }

    public static void cevap5(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz:");
        String cumle=sc.nextLine();
        String[] kelimeler=cumle.split(" ");
        String enUzunKelime="";
        for (String kelime:kelimeler){
            if (kelime.length()>enUzunKelime.length()){
                enUzunKelime=kelime;
            }
        }
        System.out.println("En uzun kelime :" +enUzunKelime);
    }

    public static void cevap6(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz:");
        String cumle=sc.nextLine();
        char[] karakter=cumle.toCharArray();

        for (int i=0;i< karakter.length;i++){
            char c=karakter[i];
            if (c>='a'&& c<='z'){
                karakter[i]=(char)((c-'a'+3)%26+'a');
            }else if (c>='A'&& c<='Z'){
                karakter[i]=(char)((c-'A'+3)%26+'A');
            }


        }
        System.out.println("şifrelenmiş metin : "+new String(karakter));


    }

    public static void cevap7(){

    }

}
