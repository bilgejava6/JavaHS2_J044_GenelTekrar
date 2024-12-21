package com.serkankilicdere.degiskenler.orta;

import java.util.Scanner;

public class Orta {
    /*
    	    1.	Kullanıcıdan yaşını isteyin ve bunu bir değişkende saklayarak konsola yazdırın.
         * 	2.	Bir final değişken oluşturun ve ona bir sabit değer atayın. Daha sonra bu değeri değiştirmeye çalışın ve ne olduğunu açıklayın.
         * 	3.	İki String değişkeni tanımlayın, birine adınızı, diğerine soyadınızı atayın. Bu değişkenleri birleştirerek tam adınızı konsola yazdırın.
         * 	4.	Bir double ve bir int değişken oluşturup bunları topladığınızda çıkan sonucun türü nedir? Test ederek gösterin.
         * 	5.	Bir String değişkenine bir sayısal değer ("123") atayın ve bunu bir int değişkenine dönüştürerek toplama işlemi yapın.
         * 	6.	long türünde bir değişken tanımlayın ve 1 milyar gibi büyük bir sayı atayın. Sonuçta bir hata alır mısınız?
         * 	7.	Bir değişken tanımlayın ve önce int, sonra float, ardından String türüne dönüştürerek konsola yazdırın.
         * 	8.	Kullanıcıdan bir kelime girmesini isteyin ve bu kelimenin uzunluğunu hesaplayan bir program yazın.
         * 	9.	Bir short değişken oluşturup bir int değişkenine atayın. Bu işlem sırasında bir hata alır mısınız?
     */
    public static void main(String[] args) {

        //1.	Kullanıcıdan yaşını isteyin ve bunu bir değişkende saklayarak konsola yazdırın.

        Scanner sc = new Scanner(System.in);
        System.out.println("yasinizi giriniz: ");
        int yas = sc.nextInt();
        System.out.println(yas);

        System.out.println("""
                --------------------------------------------
                """);

        //2.	Bir final değişken oluşturun ve ona bir sabit değer atayın. Daha sonra bu değeri değiştirmeye çalışın ve ne olduğunu açıklayın.

       final float PI=3.14f;
        // PI=5; -->error: cannot assign a value to final variable PI --> FİNAL KEYWORDU bir kere değer atanabileceğini ve bir daha değiştirilemeyeceğini belirtir

        System.out.println("""
                --------------------------------------------
                """);

        //3.	İki String değişkeni tanımlayın, birine adınızı, diğerine soyadınızı atayın. Bu değişkenleri birleştirerek tam adınızı konsola yazdırın.

        String ad="serkan";
        String soyad=" kilicdere";
        System.out.println(ad.concat(soyad));

        System.out.println("""
                --------------------------------------------
                """);

        //4.	Bir double ve bir int değişken oluşturup bunları topladığınızda çıkan sonucun türü nedir? Test ederek gösterin.

        double d=3.14;
        String s="serkan";
        System.out.println(s+d);// cevap String olarak döner

        System.out.println("""
                --------------------------------------------
                """);

        //5.	Bir String değişkenine bir sayısal değer ("123") atayın ve bunu bir int değişkenine dönüştürerek toplama işlemi yapın.

        String s1="123";
        int a=1;
        int toplam=a+Integer.parseInt(s1);
        System.out.println(toplam);

        System.out.println("""
                --------------------------------------------
                """);

        //	6.	long türünde bir değişken tanımlayın ve 1 milyar gibi büyük bir sayı atayın. Sonuçta bir hata alır mısınız?

        long sayi1=1_000_000_000L;
        System.out.println(sayi1);

        System.out.println("""
                --------------------------------------------
                """);

        //7.	Bir değişken tanımlayın ve önce int, sonra float, ardından String türüne dönüştürerek konsola yazdırın.

        int x=500;
        System.out.println(x);
        float y=x;
        System.out.println(y);
        String c=String.valueOf(y);
        System.out.println(c);

        System.out.println("""
                --------------------------------------------
                """);

        //8.	Kullanıcıdan bir kelime girmesini isteyin ve bu kelimenin uzunluğunu hesaplayan bir program yazın.

        Scanner input = new Scanner(System.in);
        System.out.println("kelime girirniz  ");
        String kelime=input.nextLine();
        int harfSayisi=0;
        for (int i = 0; i < kelime.length(); i++) {

            harfSayisi++;
        }
        System.out.println(harfSayisi);

        System.out.println("""
                --------------------------------------------
                """);

        //9.	Bir short değişken oluşturup bir int değişkenine atayın. Bu işlem sırasında bir hata alır mısınız?

        short sh=24000;
        int in=(int)sh;// int kapsar short dolayısıyla sorun olmaz
        System.out.println(in);

        System.out.println("""
                --------------------------------------------
                """);


    }
}
