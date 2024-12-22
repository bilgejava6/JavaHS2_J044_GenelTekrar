package com.sercan.String;

import java.sql.SQLOutput;
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
        cevap10();
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
        System.out.println("Lütfen bir metin giriniz : ");
        String metin=sc.nextLine();

        String[] kelimeler=metin.split(" ");
        System.out.println(kelimeler.length);

    }

    public static void cevap3(){
        String metin="Bugün hava çok güzel";
        metin=metin.replaceAll("a","e");
        System.out.println(metin);
    }

    public static void cevap4(){
     //TODO: :Çözümü yapan regex ile çözen arkadaşlarının çözümlerini incele
    }

    public static void cevap5(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");
        String kelime=sc.next();
        String yeniKelime="";
        for (int i=kelime.length()-1;i>=0;i--){
            yeniKelime+=kelime.charAt(i);
        }
        if (yeniKelime.equals(kelime)){
            System.out.println("palindrome bir kelimedir");
        }else System.out.println("palindrome bir kelime değildir.");

    }

    public static void cevap6(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime yazınız : ");
        String kelime=sc.next();
        for (int i=0;i<kelime.length();i++){
            System.out.println(kelime.charAt(i));
        }

    }

    public static void cevap7(){
        String ifade="metin";
        String yeniIfade=ifade.substring(0,3);
        String son=yeniIfade+yeniIfade+yeniIfade;
        System.out.println(son);



    }

    public static void cevap8(){
        String ifade="programlama";
        String sesliHarfler="aeuıiüoö";
        int sesliHarfSay=0;
        for (int i=0;i<ifade.length();i++){
           char karakter= ifade.charAt(i);
           if (sesliHarfler.indexOf(karakter)!=-1){
               sesliHarfSay++;

           }
        }
        System.out.println(sesliHarfSay);

    }

    public static void cevap10(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir cümle yazınız : ");
        String cumle=sc.nextLine();
        String[] kelimeler=cumle.split(" ");
        String yeniCumle="";
        for (String kelime:kelimeler){
            yeniCumle+=kelime.substring(0,1).toUpperCase()+kelime.substring(1).toLowerCase()+" ";
        }
        System.out.println(yeniCumle.trim());

    }
}
