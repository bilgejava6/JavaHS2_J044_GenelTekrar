package com.serkankilicdere.degiskenler.zor;

import java.util.Scanner;



// 	2.	int, float, double, ve char türlerini kapsayacak şekilde bir sınıf oluşturun. Her türde değişkenler için setter ve getter metotları yazın.
class Degiskenler{//2. soru icin oluşturulan ic sınıf
    private int a;
    private float f;
    private double d;
    private char c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }
}

//8.    static ve non-static değişkenlerin farkını göstermek için bir sınıf yazın.
class StatikVsNonStatik{// 8. soru için olusturulan sınıf
     static int statikSayi=0;
     int nonStatikSayi=0;

    public static void staticMetod(){
        // statik metodta statik değişken kullanılabilir nonstatik kullanılmaz
        statikSayi++;
        System.out.println(statikSayi);
    }
    public void nonStatikMetod(){
        // hem statik hemde statik olmayan değişkenler kullanılabilir
        statikSayi++;
        nonStatikSayi++;
        System.out.println(statikSayi+nonStatikSayi);
    }

}
public class Zor {


    public static int sayi;//4. soru için değişken tanımlama


    /*
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
     */



    public static void main(String[] args) {

        //1.	Kullanıcıdan bir String girişi alın ve bunun bir tamsayı olup olmadığını kontrol edin. Eğer tamsayıysa ekrana dönüştürülmüş değerini yazdırın.

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sey yazın  ");
        String birSey = sc.nextLine();

        try{
            int sayi = Integer.parseInt(birSey);
            System.out.println("sayidir "+sayi);
        }catch(Exception e){
            System.out.println("sayi degildir");
        }

        System.out.println("""
                --------------------------------------------
                """);

        //	2.	int, float, double, ve char türlerini kapsayacak şekilde bir sınıf oluşturun. Her türde değişkenler için setter ve getter metotları yazın.
        // --> cevap yukarıda

       // 3.	Bir final değişken oluşturun ve bu değişkenin sadece bir kez atanabileceğini göstermek için bir örnek yapın.

        final int a1=5;
       // a1=9; //Cannot assign a value to final variable 'a1' --> hata verir


        //4.	int türünden bir değişken tanımlayın ve buna negatif bir değer atayın. Ardından bu değeri pozitif bir değere dönüştürmek için bir kod yazın.

        int sayi = -45;
        // method asagıda
        System.out.println(pozitifYap(sayi));

        System.out.println("""
                --------------------------------------------
                """);

        //5.	byte, short, int, ve long türlerini kapsayacak şekilde bir karşılaştırma yaparak her birinin maksimum değerlerini ekrana yazdıran bir program yazın.

        System.out.println("Byte Maksimum : " + Byte.MAX_VALUE);
        System.out.println("Short  Maksimum : " + Short.MAX_VALUE);
        System.out.println("Int  Maksimum : " + Integer.MAX_VALUE);
        System.out.println("Long  Maksimum : " + Long.MAX_VALUE);

        System.out.println("""
                --------------------------------------------
                """);

        //6.	Kullanıcıdan iki sayı alarak bu sayıların değişken türlerinin eşleşip eşleşmediğini kontrol edin. Eşleşiyorsa toplamlarını yazdırın.

        //7.	Bir tamsayı değişkeni tanımlayın ve bu değişkeni bir String değişkene dönüştürün. Bu işlemi iki farklı yöntemle yapın.

        int sayi5 = 123;
        String str1 = String.valueOf(sayi5);
        sayi5 = 123;
        String str2 = Integer.toString(sayi5);

        System.out.println("""
                --------------------------------------------
                """);

        //8.    static ve non-static değişkenlerin farkını göstermek için bir sınıf yazın.



        System.out.println("""
                --------------------------------------------
                """);

        //9.	Bir değişken tanımlayın ve bu değişkene += gibi bir işlem uygulayın. İşlemin sonucunu konsola yazdırın.
        int z=5;
        for(int i=0;i<5;i++){
            z+=i;
            System.out.println(z);
        }


        System.out.println("""
                --------------------------------------------
                """);

        //10.	Kullanıcıdan bir String ve bir sayı isteyin. Bu ikisini birleştirerek bir cümle oluşturun ve ekrana yazdırın.

        Scanner inp = new Scanner(System.in);
        System.out.println("kelime giriniz ");
        String str = inp.nextLine();
        System.out.println("sayi giriniz");
        int f=inp.nextInt();

        System.out.println(str+f);




    }

    private static int pozitifYap(int sayi) {// 4. soru metod
        Zor.sayi = sayi;//4. soru method
        if(sayi<0) sayi=Math.abs(sayi);
        return sayi;
    }


}
