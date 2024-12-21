package com.seyma.degiskenler;

import java.util.Scanner;

public class Orta {
    public static void main(String[] args) {


        /**
         * 	1.	Kullanıcıdan yaşını isteyin ve bunu bir değişkende saklayarak konsola yazdırın.
         *  2.	Bir final değişken oluşturun ve ona bir sabit değer atayın. Daha sonra bu değeri değiştirmeye çalışın ve ne olduğunu açıklayın.
         *  3.	İki String değişkeni tanımlayın, birine adınızı, diğerine soyadınızı atayın. Bu değişkenleri birleştirerek tam adınızı konsola yazdırın.
         *  4.	Bir double ve bir int değişken oluşturup bunları topladığınızda çıkan sonucun türü nedir? Test ederek gösterin.
         *  5.	Bir String değişkenine bir sayısal değer ("123") atayın ve bunu bir int değişkenine dönüştürerek toplama işlemi yapın.
         *  6.	long türünde bir değişken tanımlayın ve 1 milyar gibi büyük bir sayı atayın. Sonuçta bir hata alır mısınız?
         *  7.	Bir değişken tanımlayın ve önce int, sonra float, ardından String türüne dönüştürerek konsola yazdırın.
         *  8.	Kullanıcıdan bir kelime girmesini isteyin ve bu kelimenin uzunluğunu hesaplayan bir program yazın.
         *  9.	Bir short değişken oluşturup bir int değişkenine atayın. Bu işlem sırasında bir hata alır mısınız?
         *
         *
         */

        soru1();
        soru2();
        soru3();
        soru4();
        soru5();
        soru6();
        soru7();
        soru8();
        soru9();







    }



    public static void soru1() {
        System.out.println("Yaşınızı giriniz...:");
        int yas = new Scanner(System.in).nextInt();

    }


    public static void soru2() {
        int fnal = 100;
        System.out.println("Final değeri"+fnal);



    }

    public static void soru3() {
        String name ="Şeyma";
        String surname="Karadere";
        System.out.println(name.concat(surname));

    }

    public static void soru4() {
        double sayi1 = 23.4d;
        int sayi2 = 456;
        int Toplam= (int) (sayi1+sayi2);
        System.out.println("Toplam Sonucu..:"+Toplam);

        // Cast etmeden çalışmıyor
    }

    public static void soru5() {
        String deger="123";
        int degerint=Integer.parseInt(deger);
        System.out.println("Deger..:"+deger);

    }


    public static void soru6() {

        long sayi1=100000000000L;
        System.out.println("Long sayı..:"+sayi1);
        System.out.println("Long sayı hata vermedii...");



    }

    public static void soru7() {
        String degisken ="123434";
        int degiskenint=Integer.parseInt(degisken);
        System.out.println("Degisken int hali..:"+degisken);

        float degiskenfloat=Float.parseFloat(degisken);
        System.out.println("Degisken float hali..:"+degiskenfloat);

        String degiskenString =String.valueOf(degiskenfloat);
        System.out.println("Degisken String hali..:"+degiskenString);



    }

    public static void soru8() {
        System.out.println("Bir kelime giriniz....");
        String kelime=new Scanner(System.in).nextLine();
        System.out.println("Kelime harf sayısı...:"+kelime.length());

    }

    public static void soru9() {
        short s=2000;
        int i=s;
        System.out.println("Short değeri"+s);
        System.out.println("Int feğeri"+i);
        //short inte sığdığı için hata vermedi

    }








}


