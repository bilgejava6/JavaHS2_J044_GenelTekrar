package com.seyma.degiskenler;

import java.util.Scanner;

public class Zor {
    /**
     * 1.	Kullanıcıdan bir String girişi alın ve bunun bir tamsayı olup olmadığını kontrol edin. Eğer tamsayıysa ekrana dönüştürülmüş değerini yazdırın.
     * 2.	int, float, double, ve char türlerini kapsayacak şekilde bir sınıf oluşturun. Her türde değişkenler için setter ve getter metotları yazın.
     * 3.	Bir final değişken oluşturun ve bu değişkenin sadece bir kez atanabileceğini göstermek için bir örnek yapın.
     * 4.	int türünden bir değişken tanımlayın ve buna negatif bir değer atayın. Ardından bu değeri pozitif bir değere dönüştürmek için bir kod yazın.
     * 5.	byte, short, int, ve long türlerini kapsayacak şekilde bir karşılaştırma yaparak her birinin maksimum değerlerini ekrana yazdıran bir program yazın.
     * 6.	Kullanıcıdan iki sayı alarak bu sayıların değişken türlerinin eşleşip eşleşmediğini kontrol edin. Eşleşiyorsa toplamlarını yazdırın.
     * 7.	Bir tamsayı değişkeni tanımlayın ve bu değişkeni bir String değişkene dönüştürün. Bu işlemi iki farklı yöntemle yapın.
     * 8.	static ve non-static değişkenlerin farkını göstermek için bir sınıf yazın.
     * 9.	Bir değişken tanımlayın ve bu değişkene += gibi bir işlem uygulayın. İşlemin sonucunu konsola yazdırın.
     * 10.	Kullanıcıdan bir String ve bir sayı isteyin. Bu ikisini birleştirerek bir cümle oluşturun ve ekrana yazdırın.
     */
    public static void main(String[] args) {
        soru1();
        Soru2 soru2 = new Soru2();
        soru2.ad = "ŞEYMA";
        soru2.fiyat = 123122d;
        soru2.sayi = 1;
        soru2.sube = 'A';
        System.out.println("Soru2 Bilgiler...:" + soru2.ad + " " + soru2.sube + " " + soru2.fiyat + " " + soru2.sayi);

        soru3();
        soru4();
        soru5();
        soru7();
        StatikNonStatic statik = new StatikNonStatic();
        System.out.println("Statik olan.."+statik.statikDegisken);
        StatikNonStatic statik2 = new StatikNonStatic();
        System.out.println("Statik olmayan..:"+statik2.statikOlmayanDegisken);

        soru9();
        soru10();


    }

    public static void soru1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Bir değer yazınız...:");
        String deger1 = in.nextLine();
        int sayi1 = Integer.parseInt(deger1);
        System.out.println("Sayı..:"+sayi1);



    }

    public static class Soru2 {
        public String ad;
        public int sayi;
        public Double fiyat;
        public char sube;

        public String getAd() {
            return ad;
        }

        public void setAd(String ad) {
            this.ad = ad;
        }

        public int getSayi() {
            return sayi;
        }

        public void setSayi(int sayi) {
            this.sayi = sayi;
        }

        public Double getFiyat() {
            return fiyat;
        }

        public void setFiyat(Double fiyat) {
            this.fiyat = fiyat;
        }

        public char getSube() {
            return sube;
        }

        public void setSube(char sube) {
            this.sube = sube;
        }
    }

    public static void soru3() {
        final int sayi = 10;
        System.out.println("Sayının değer..:" + sayi);


    }

    public static void soru4() {
        int sayi = -10;
        System.out.println("Sayı değer..:" + sayi);
        sayi = -sayi;
        System.out.println("Sayı pozitif değer...:" + sayi);
    }

    public static void soru5() {
        System.out.println("Byte en büyük değer...:"+Byte.MAX_VALUE);
        System.out.println("Short en büyük değer...:"+Short.MAX_VALUE);
        System.out.println("İnteger en büyük değer...:"+Integer.MAX_VALUE);
        System.out.println("Double en büyük değer...:"+Double.MAX_VALUE);
        System.out.println("Long en büyük değer...:"+Long.MAX_VALUE);

    }

    public static void soru6(){
        Scanner in = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...:");
        int sayi = in.nextInt();
        System.out.println("ikinci sayıyı giriniz...:");
        int sayi2 = in.nextInt();



    }

    public static void soru7(){
        int sayi = 10;

        String sayi1 =String.valueOf(sayi);
        System.out.println("Birinci yöntem"+ sayi1);

        String sayi2 =Integer.toString(sayi);
        System.out.println("İkinci yöntem"+ sayi2);

    }

    public static class StatikNonStatic {

        static int statikDegisken = 0;
        int statikOlmayanDegisken = 0;


        public static void staticMetod() {
            statikDegisken++;


        }

        public void nonStaticMetod() {

            statikOlmayanDegisken++;


        }

    }

    public static void  soru9(){
        int sayi = 10;
        int ysayi= sayi+=5;
        System.out.println("Sayı yeni değer"+ysayi);
    }

    public static void soru10(){
        Scanner in = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...:");
        int sayi = in.nextInt();

        System.out.println("Bir metin giriniz...:");
        String deger2 = in.next();


        System.out.println("Sonuç...:" +sayi+" "+deger2);

    }









}





