package com.sercan.Degiskenler;

public class Runner_Kolay {
    public static void main(String[] args) {
        /**
         * ** DEĞİŞKENLER
         * -- Kolay
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
         * 	*/



    }
    public void cevap1(){
        System.out.println("""
                1. sorunun çözümü
                """);
        int tamSayi=10;
        System.out.println(tamSayi);
        System.out.println("-------------------------------------------");
    }

    public void cevap2(){
        System.out.println("""
                2. sorunun çözümü
                """);
        double deger=3.14d;
        System.out.println(deger);
        System.out.println("--------------------------------------------");
    }

    public void cevap3(){
        System.out.println("""
                3.sorunun cevabı
                """);
        String ad="Sercan";
        System.out.println("Merhaba "+"["+ad+"]!");
        System.out.println("----------------------------------------------");
    }

    public void cevap4(){
        System.out.println("""
                4.sorunun cevabı
                """);
        boolean dogruMu=true;
        System.out.println(dogruMu);
        System.out.println("------------------------------------------------");
    }

    public void cevap5(){
        System.out.println("""
                5. sorunun cevabı
                """);
        char ilkHarf='S';
        System.out.println(ilkHarf);
        System.out.println("-------------------------------------------------");
    }

    public void cevap6(){
        System.out.println("""
                6. sorunun cevabı
                """);
        int x=5,y=7;
        int toplam=x+y;
        System.out.println("Toplam : "+toplam);
        System.out.println("-------------------------------------------------");
    }

    public void cevap7(){
        System.out.println("""
                7. sorunun cevabı
                """);
        Integer sayi=null;
        sayi=100;
        System.out.println(sayi);
        System.out.println("-------------------------------------------------");
    }

    public void cevap8(){
        System.out.println("""
                8. sorunun cevabı
                """);
        int  k;
       /** variable k might not have been initialized
        değer atanmadığı için başlatılamadığını ifade ediyor

        */
        System.out.println("-------------------------------------------------");
    }

    public void cevap9(){
        System.out.println("""
                9. sorunun cevabı
                """);
        float j=2.5f;
        System.out.println(j);
        System.out.println("-------------------------------------------------");
    }

    public void cevap10(){
        System.out.println("""
                10. sorunun cevabı
                """);
        byte byteDegeri=127;
        System.out.println(byteDegeri);
        System.out.println("""
                        byte -128 ile 127 aralığında değer alır daha büyük değer verirsek int dönüştürmemizi ister byte şeklinde istersek
                        -128 ile 127 aralığında o sayiya denk gelen değeri döner
                        """);

        System.out.println("-------------------------------------------------");
    }

}
