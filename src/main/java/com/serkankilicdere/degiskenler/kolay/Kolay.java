package com.serkankilicdere.degiskenler.kolay;

public class Kolay {
    /*
     * 	1.	Bir tamsayı değişkeni oluşturun ve ona 10 değerini atayın. Bu değişkeni ekrana yazdırın.
     * 	2.	Bir double türünde değişken tanımlayın ve 3.14 değerini atayın. Değeri konsola yazdırın.
     * 	3.	Bir String değişken oluşturup adınızı atayın. Bu değişkeni kullanarak “Merhaba, [adınız]!” çıktısını alın.
     * 	4.	boolean türünde bir değişken tanımlayın ve ona true değeri verin. Değeri konsolda yazdırın.
     * 	5.	Bir char türünde değişken oluşturun ve ilk harfinizi atayın. Değeri ekrana yazdırın.
     * 	6.	İki tamsayı değişkeni oluşturun (x=5 ve y=7). Bu iki sayının toplamını ekrana yazdırın.
     * 	7.	Bir değişken tanımlayın ve ona null atayın. Sonra değerini 100 olarak değiştirin.
     * 	8.	Bir değişken tanımlayın ve değer atamadan önce bir çıktı almaya çalışın. Hata mesajını yorumlayın.
     * 	9.	Bir float değişken oluşturun ve 2.5 değerini atayın. Bu değeri ekrana yazdırın.
     * 	10.	byte türünde bir değişken tanımlayıp 127 değeri verin. Daha büyük bir değer atarsanız ne olur?
     */
    public static void main(String[] args) {

        // 1.	Bir tamsayı değişkeni oluşturun ve ona 10 değerini atayın. Bu değişkeni ekrana yazdırın.
        int a;
        a=10;
        System.out.println(a);

        System.out.println("""
                --------------------------------------------
                """);

        //2.	Bir double türünde değişken tanımlayın ve 3.14 değerini atayın. Değeri konsola yazdırın.
        double b;
        b=3.14;
        System.out.println(b);

        System.out.println("""
                --------------------------------------------
                """);

        //3.	Bir String değişken oluşturup adınızı atayın. Bu değişkeni kullanarak “Merhaba, [adınız]!” çıktısını alın.
        String isim;
        isim="Serkan";
        System.out.println("Merhaba "+isim);

        System.out.println("""
                --------------------------------------------
                """);

        //4.	boolean türünde bir değişken tanımlayın ve ona true değeri verin. Değeri konsolda yazdırın.

        boolean c=true;
        System.out.println(c);

        System.out.println("""
                --------------------------------------------
                """);

        //5.	Bir char türünde değişken oluşturun ve ilk harfinizi atayın. Değeri ekrana yazdırın.

        char karakter='S';
        System.out.println(karakter);

        System.out.println("""
                --------------------------------------------
                """);

        //6.	İki tamsayı değişkeni oluşturun (x=5 ve y=7). Bu iki sayının toplamını ekrana yazdırın.

        int x=5;
        int y=7;
        System.out.println(x+y);

        System.out.println("""
                --------------------------------------------
                """);

        //7.	Bir değişken tanımlayın ve ona null atayın. Sonra değerini 100 olarak değiştirin.

        String d=null;
        d="100";
        int e=Integer.parseInt(d);
        System.out.println(e);

        System.out.println("""
                --------------------------------------------
                """);

        //8.	Bir değişken tanımlayın ve değer atamadan önce bir çıktı almaya çalışın. Hata mesajını yorumlayın.

        int f;

       // System.out.println(f);

        //error: variable f might not have been initialized hatası --> bu hata henüz değer atanmadığı için adreslenmemesi ile ilgili bir hatadır

        System.out.println("""
                --------------------------------------------
                """);

        //9.	Bir float değişken oluşturun ve 2.5 değerini atayın. Bu değeri ekrana yazdırın.

        float g= 2.5f;
        System.out.println(g);

        System.out.println("""
                --------------------------------------------
                """);

        //10.	byte türünde bir değişken tanımlayıp 127 değeri verin. Daha büyük bir değer atarsanız ne olur?

        byte h=127;
        System.out.println(h);// daha büyük değer byte sınırları dıiındadır-->daha büyük değerlerde 256nın modunu sonuç olarak verir












    }
}
