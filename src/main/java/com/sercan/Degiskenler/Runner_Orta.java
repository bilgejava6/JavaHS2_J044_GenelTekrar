package com.sercan.Degiskenler;

import java.util.Scanner;

public class Runner_Orta {
    public static void main(String[] args) {
        /**
         * 	-- ORTA
         * 	1.	Kullanıcıdan yaşını isteyin ve bunu bir değişkende saklayarak konsola yazdırın.
         * 	2.	Bir final değişken oluşturun ve ona bir sabit değer atayın. Daha sonra bu değeri değiştirmeye çalışın ve ne olduğunu açıklayın.
         * 	3.	İki String değişkeni tanımlayın, birine adınızı, diğerine soyadınızı atayın. Bu değişkenleri birleştirerek tam adınızı konsola yazdırın.
         * 	4.	Bir double ve bir int değişken oluşturup bunları topladığınızda çıkan sonucun türü nedir? Test ederek gösterin.
         * 	5.	Bir String değişkenine bir sayısal değer ("123") atayın ve bunu bir int değişkenine dönüştürerek toplama işlemi yapın.
         * 	6.	long türünde bir değişken tanımlayın ve 1 milyar gibi büyük bir sayı atayın. Sonuçta bir hata alır mısınız?
         * 	7.	Bir değişken tanımlayın ve önce int, sonra float, ardından String türüne dönüştürerek konsola yazdırın.
         * 	8.	Kullanıcıdan bir kelime girmesini isteyin ve bu kelimenin uzunluğunu hesaplayan bir program yazın.
         * 	9.	Bir short değişken oluşturup bir int değişkenine atayın. Bu işlem sırasında bir hata alır mısınız?
         * 	*/

    }
    public static void cevap1(){
        System.out.print("Yasınız  :");
        int yas=new Scanner(System.in).nextInt();
        System.out.println("Yas : "+yas );

    }

    public static void  cevap2(){
        final int deger=5;
        System.out.println(deger);
        //  deger=15;
        System.out.println("cannot assign a value to final variable deger");
       /** System.out.println("""
                final kullanıldığında o değişkenin degeri bir dahadeğiştirilemez.
                Sabit olanlarda kullanılır.
                """);
        */
    }

    public static void cevap3(){
        String ad="Sercan";
        String soyad="İmir";
        System.out.println(ad.concat(" "+soyad));
    }

    public static void cevap4(){
        double sayi=3.14;
        int sayi2=5;
        System.out.println(sayi+sayi2);
    }

    public static void cevap5(){
        String deger="123";
        int deger2= Integer.parseInt(deger);
        int deger3=5;
        int toplam=deger2+deger3;
        System.out.println("Toplam : "+toplam);
    }

    public static void cevap6(){
        long    sayi=9_999_999_999L;
        System.out.println(sayi);
        // hata almayız
    }

    public static void cevap7(){
        int sayi=5;
        float sayi2=(float)sayi;
        String sayi3=String.valueOf(sayi2);

    }

    public static void cevap8(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz ...:");
        String kelime=sc.nextLine();
        int kelimeUzunlugu=kelime.length();
        System.out.println(kelimeUzunlugu);


    }

    public static void  cevap9(){
        short sayi=15;
        int sayi2=sayi;
        System.out.println(sayi2);
        /**
         *  short 16 bit ,int 32 bit yani daha geniş olduğundan bir problem olmaz
         */
    }
}
