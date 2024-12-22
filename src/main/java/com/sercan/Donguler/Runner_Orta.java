package com.sercan.Donguler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner_Orta {
    public static void main(String[] args) {
        /*** Orta
         * 	1.	Kullanıcıdan bir sayı alın ve bu sayıya kadar olan tüm asal sayıları ekrana yazdırın.
         * 	2.	Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisini konsola yazdıran bir program yazın.
         * 	3.	İç içe döngüler kullanarak bir çarpım tablosu oluşturun.
         * 	4.	Kullanıcıdan bir sayı alın ve bu sayıyı tersten yazdıran bir program yazın.
         * 	5.	Kullanıcıdan bir kelime alın ve kelimenin her karakterini bir satıra yazdıran bir kod yazın.
         * 	6.	Bir for döngüsüyle 1’den 100’e kadar olan sayıların toplamını hesaplayın.
         * 	7.	Bir sayı dizisindeki en büyük ve en küçük sayıyı bulan bir döngü yazın.
         * 	8.	Bir while döngüsüyle bir sayının basamaklarının toplamını hesaplayan bir program yazın.
         * 	9.	İç içe döngülerle bir yıldız desen çizdirin (örneğin, piramit).
         * 	10.	1 ile 100 arasındaki sayıları kontrol ederek sadece 3 ve 5’e tam bölünebilenleri ekrana yazdırın.
         *
         */
    }
    public static void cevap1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi=sc.nextInt();



    }

    // 0 1 1 2 3 5 8 13 21 34 55
    public static void cevap2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi=sc.nextInt();
        int ilk=0,ikinci=1;

        for (int i=0;i<=sayi;i++){
            int sonraki=ilk+ikinci;
            System.out.println(sonraki);

        }

    }


}
