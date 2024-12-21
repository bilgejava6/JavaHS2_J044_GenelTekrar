package com.seyma.degiskenler;

public class Kolay {
    public static void main(String[] args) {

        /**
         *  	1.  Bir tamsayı değişkeni oluşturun ve ona 10 değerini atayın. Bu değişkeni ekrana yazdırın.
         *      2.	Bir double türünde değişken tanımlayın ve 3.14 değerini atayın. Değeri konsola yazdırın.
         *      3.	Bir String değişken oluşturup adınızı atayın. Bu değişkeni kullanarak “Merhaba, [adınız]!” çıktısını alın.
         *      4.	boolean türünde bir değişken tanımlayın ve ona true değeri verin. Değeri konsolda yazdırın.
         *      5.	Bir char türünde değişken oluşturun ve ilk harfinizi atayın. Değeri ekrana yazdırın.
         *      6.	İki tamsayı değişkeni oluşturun (x=5 ve y=7). Bu iki sayının toplamını ekrana yazdırın.
         *      7.	Bir değişken tanımlayın ve ona null atayın. Sonra değerini 100 olarak değiştirin.
         *      8.	Bir değişken tanımlayın ve değer atamadan önce bir çıktı almaya çalışın. Hata mesajını yorumlayın.
         *      9.	Bir float değişken oluşturun ve 2.5 değerini atayın. Bu değeri ekrana yazdırın.
         *      10.	byte türünde bir değişken tanımlayıp 127 değeri verin. Daha büyük bir değer atarsanız ne olur?
         *
         */


        int sayi =10;
        System.out.println("Tam sayi..: "+sayi);

        double sayi2 =3.14d;
        System.out.println("Ondalık sayi: "+sayi2);

        String name="Şeyma";
        System.out.println("Merhaba ," +" [" +name+"]"+"!");

        boolean sayi3 =true;
        System.out.println("Değerin sonucu..:"+sayi3);

        char sayi4 ='Ş';
        System.out.println("Char sonucu..:"+sayi4);

        int x,y,toplam;
        x=5;
        y=7;
        toplam=x+y;
        System.out.println("Toplam..:"+toplam);

        Integer sayi5 =null;
        sayi5=100;
        System.out.println("Null dönüştürme...:"+sayi5);


       // String name2= ;
       // System.out.println(name2);
        //error: illegal start of expression
        //        String name2= ; İFADENİN DOĞRU ŞEKİLDE BAŞLATILAMAMASI

        Float sayi6 =2.5f;
        System.out.println("Ondalık sayı..:"+sayi6);

        byte sayi7=120;
        System.out.println("Byte sonucu..:"+sayi7);
        //128 ile 127 arasında bir değer aldığı için büyük değer yerine
        int sayi7int=(int) 130;
        System.out.println("Değer yeni sonuç..."+sayi7int);














    }
}
