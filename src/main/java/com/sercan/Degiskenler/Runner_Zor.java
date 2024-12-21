package com.sercan.Degiskenler;

import java.util.Scanner;

public class Runner_Zor {
    public static void main(String[] args) {
        /**
         * 	-- ZOR
         * 	1.	Kullanıcıdan bir String girişi alın ve bunun bir tamsayı olup olmadığını kontrol edin. Eğer tamsayıysa ekrana dönüştürülmüş değerini yazdırın.
         * 	2.	int, float, double, ve char türlerini kapsayacak şekilde bir sınıf oluşturun. Her türde değişkenler için setter ve getter metotları yazın.
         * 	3.	Bir final değişken oluşturun ve bu değişkenin sadece bir kez atanabileceğini göstermek için bir örnek yapın.
         * 	4.	int türünden bir değişken tanımlayın ve buna negatif bir değer atayın. Ardından bu değeri pozitif bir değere dönüştürmek için bir kod yazın.
         * 	5.	byte, short, int, ve long türlerini kapsayacak şekilde bir karşılaştırma yaparak her birinin maksimum değerlerini ekrana yazdıran bir program yazın.
         * 	6.	Kullanıcıdan iki sayı alarak bu sayıların değişken türlerinin eşleşip eşleşmediğini kontrol edin. Eşleşiyorsa toplamlarını yazdırın.
         * 	7.	Bir tamsayı değişkeni tanımlayın ve bu değişkeni bir String değişkene dönüştürün. Bu işlemi iki farklı yöntemle yapın.
         * 	8.	static ve non-static değişkenlerin farkını göstermek için bir sınıf yazın.
         * 	9.	Bir değişken tanımlayın ve bu değişkene += gibi bir işlem uygulayın. İşlemin sonucunu konsola yazdırın.
         * 	10.	Kullanıcıdan bir String ve bir sayı isteyin. Bu ikisini birleştirerek bir cümle oluşturun ve ekrana yazdırın.
         * 	,*/


    }

    public static void cevap1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir deger giriniz : ");
        String gDeger=sc.nextLine();
        System.out.println(gDeger);

    }

    public static void cevap2(){
        Sinif sinif=new Sinif();
        sinif.setIntDeger(10);
        sinif.setFloatDeger(10.42f);
        sinif.setCharDeger('A');
        sinif.setDoubleDeger(15.58d);

    }

    public static void cevap3(){}

    public static void cevap4(){
        int sayi=-5;
        int pozsayi=sayi*(-1);
        System.out.println(pozsayi);
       // sayi=Math.abs(sayi);
    }

    public static void cevap5(){
        byte byteDeger=Byte.MAX_VALUE;
        short shortDeger=Short.MAX_VALUE;
        int intDeger=Integer.MAX_VALUE;
        long longDeger=Long.MAX_VALUE;
        System.out.println(" Byte maks degeri :"+byteDeger);
        System.out.println(" Short maks degeri :"+shortDeger);
        System.out.println(" Int maks degeri :"+intDeger);
        System.out.println(" Long maks degeri :"+longDeger);


    }

    public static void cevap6(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. sayiyi giriniz : ");
        int sayi=sc.nextInt();
        System.out.println("2. sayiyi giriniz : ");
        double sayi2=sc.nextDouble();


    }


}


class Sinif{
    private int intDeger;
    private float floatDeger;
    private double doubleDeger;
    private char charDeger;



    public int getIntDeger() {
        return intDeger;
    }

    public void setIntDeger(int intDeger) {
        this.intDeger = intDeger;
    }

    public float getFloatDeger() {
        return floatDeger;
    }

    public void setFloatDeger(float floatDeger) {
        this.floatDeger = floatDeger;
    }

    public double getDoubleDeger() {
        return doubleDeger;
    }

    public void setDoubleDeger(double doubleDeger) {
        this.doubleDeger = doubleDeger;
    }

    public char getCharDeger() {
        return charDeger;
    }

    public void setCharDeger(char charDeger) {
        this.charDeger = charDeger;
    }
}






