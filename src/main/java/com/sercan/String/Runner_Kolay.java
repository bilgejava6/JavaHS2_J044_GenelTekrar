package com.sercan.String;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Runner_Kolay {
    public static void main(String[] args) {
        /**
         * * Kolay
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
         **/
            cevap5();

    }
    public static void cevap1(){
        String kelime="kelime";
        System.out.println(kelime.length());
    }

    public static void cevap2(){
        String metin="Java Programlama";
        System.out.println(metin.toUpperCase());

    }

    public static void cevap3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir meti giriniz : ");
        String metin=sc.nextLine();
        System.out.println("Metnin ilk harfi : "+metin.charAt(0));

    }

    public static void cevap4(){
        String ifade="Merhaba Dünya";
        System.out.println("Dünya kelimesinin başlangıç indexi : "+ifade.indexOf("Dünya"));
    }

    //Tekrar bak
    public static void cevap5(){
        String ifade="kelime";
        String tersIfade="";
        for (int i=ifade.length()-1;i>=0;i--){
            tersIfade+=ifade.charAt(i);
        }
        System.out.println("Tersten : "+tersIfade);
    }

    public static void cevap6(){
        String ifade1="kelime";
        String ifade2="şişe";
        if (ifade2==ifade1){
            System.out.println("İki ifade birbirine eşittir");
        }else System.out.println("İki ifade birbirine eşit değildir.");
    }

    public static void cevap7(){
        String ifade="";
        System.out.println("Boş mu  : "+ifade.isBlank());
    }

    public static void cevap8(){
        String metin="Java çok eğlenceli";
        String bosluksuzMetin=metin.replaceAll(" ","");
        System.out.println(bosluksuzMetin);

    }

    public static void cevap9(){
      Scanner sc=new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
      String ifade=sc.next();
        System.out.println(ifade.contains("a"));
    }

    public static void cevap10(){
        String ifade="Hello";
        String ifade2="World";
        System.out.println(ifade.concat(" "+ifade2));

    }
}
