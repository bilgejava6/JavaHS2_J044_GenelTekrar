package com.bekircan.degiskenler;

import java.util.Scanner;

/**
 *          * 	-- ZOR
 *          * 	1.	Kullanıcıdan bir String girişi alın ve bunun bir tamsayı olup olmadığını kontrol edin. Eğer tamsayıysa ekrana dönüştürülmüş değerini yazdırın.
 *          * 	2.	int, float, double, ve char türlerini kapsayacak şekilde bir sınıf oluşturun. Her türde değişkenler için setter ve getter metotları yazın.
 *          * 	3.	Bir final değişken oluşturun ve bu değişkenin sadece bir kez atanabileceğini göstermek için bir örnek yapın.
 *          * 	4.	int türünden bir değişken tanımlayın ve buna negatif bir değer atayın. Ardından bu değeri pozitif bir değere dönüştürmek için bir kod yazın.
 *          * 	5.	byte, short, int, ve long türlerini kapsayacak şekilde bir karşılaştırma yaparak her birinin maksimum değerlerini ekrana yazdıran bir program yazın.
 *          * 	6.	Kullanıcıdan iki sayı alarak bu sayıların değişken türlerinin eşleşip eşleşmediğini kontrol edin. Eşleşiyorsa toplamlarını yazdırın.
 *          * 	7.	Bir tamsayı değişkeni tanımlayın ve bu değişkeni bir String değişkene dönüştürün. Bu işlemi iki farklı yöntemle yapın.
 *          * 	8.	static ve non-static değişkenlerin farkını göstermek için bir sınıf yazın.
 *          * 	9.	Bir değişken tanımlayın ve bu değişkene += gibi bir işlem uygulayın. İşlemin sonucunu konsola yazdırın.
 *          * 	10.	Kullanıcıdan bir String ve bir sayı isteyin. Bu ikisini birleştirerek bir cümle oluşturun ve ekrana yazdırın.
 */

public class Runner_Degiskenler_Zor {
    public static void main(String[] args) {
        // soru 1 Kullanıcıdan bir String girişi alın ve bunun bir tamsayı olup olmadığını kontrol edin. Eğer tamsayıysa ekrana dönüştürülmüş değerini yazdırın.
        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen bir değer giriniz: ");
        String deger1 =  sc.nextLine();

        try {
            int number =Integer.parseInt(deger1);
            System.out.println("Sayı girdiniz. " + number);

        }catch (Exception e){
            System.out.println("Girdiginiz değer integer degildir.");
        }
    }
        // soru 2 int, float, double, ve char türlerini kapsayacak şekilde bir sınıf oluşturun. Her türde değişkenler için setter ve getter metotları yazın.

}
class VeriTipleri {

    private int intDeger;
    private float floatDeger;
    private double doubleDeger;
    private char charDeger;

    // get set
    // int
    public int getIntDeger(){
        return intDeger;
    }
    public void setIntDeger(int intDeger){
        this.intDeger = intDeger;
    }
    //float
    public float getFloatDeger(){
        return floatDeger;
    }
    public void setFloatDeger(float floatDeger){
        this.floatDeger = floatDeger;
    }
    // double
    public  void setDoubleDeger(double doubleDeger){
        this.doubleDeger=doubleDeger;
    }
    public double getDoubleDeger(){
        return doubleDeger;
    }
    // char
    public char getCharDeger(){
        return charDeger;
    }
    public void setCharDeger(char charDeger){
        this.charDeger=charDeger;
    }

    public static void main(String[] args) {
        VeriTipleri veri = new VeriTipleri();

        // Değerleri ayarla
        veri.setIntDeger(100);
        veri.setFloatDeger(3.14f);
        veri.setDoubleDeger(123.456d);
        veri.setCharDeger('A');

        // Değerleri yazdır
        System.out.println("int değer: " + veri.getIntDeger());
        System.out.println("float değer: " + veri.getFloatDeger());
        System.out.println("double değer: " + veri.getDoubleDeger());
        System.out.println("char değer: " + veri.getCharDeger());
    }

}
