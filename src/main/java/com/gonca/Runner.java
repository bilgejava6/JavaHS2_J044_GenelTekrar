package com.gonca;

import java.util.Scanner;

public class Runner {


    public  static boolean eslesiyorMu(String deger)
    {

        Integer.parseInt(deger);
        return true;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sayi = 10;
        System.out.println(sayi);

        System.out.println("-------------------------------------------");

        double d = 3.14;
        System.out.println(d);

        System.out.println("------------------------------------------");

        String ad = "Gonca";
        System.out.println(" Merhaba ," + ad + "!");

        System.out.println("---------------------------------");

        boolean bo = true;
        System.out.println(true);

        System.out.println("-------------------------");

        char c = 'G';
        System.out.println(c);

        System.out.println("--------------------");

        int sy1 = 5;
        int sy2 = 6;
        System.out.println(sy1 + sy2);
        System.out.println("-------------------------");

        String n = null;
        // n=1000;

        System.out.println("-----------------");

        float f = 2.5F;
        System.out.println(f);
        System.out.println("----------------");

        byte b = 127;

        System.out.println("-----------------");


        System.out.println("Lütfen yaşınızı giriniz");
        int yas = sc.nextInt();
        System.out.println(yas);

        System.out.println("---------------");

        final int sy = 5;
        // sy=6;
        System.out.println("final olarak tanımlanan sayi değişkenini değiştirmeye çalıştığımda hata verdi");

        System.out.println("----------------");
        String adi = "Goncagül";
        String soyad = "Deniz";
        System.out.println(adi + "  " + soyad);

        System.out.println("---------------");

        double d1 = 3.14;
        int s = 5;

        System.out.println(d1 + s);
        System.out.println("--------------");

        //	Bir String değişkenine bir sayısal değer ("123") atayın ve bunu bir int değişkenine dönüştürerek toplama işlemi yapın.
        String s1 = "123";
        //  int sayi=
        System.out.println("-------------------");

        long l = 1000000000L;
        System.out.println(l);

        System.out.println("-----------------");

        // int float string

        double d31 = 3.56;
        int syi = (int) d31;
        float f23 = (float) syi;
        String s25 = f23 + "sayısı";

        System.out.println("----------------------");

        System.out.println("Bir kelime girin ");
        String kelime = sc.nextLine();
        System.out.println(kelime.length());
        System.out.println("--------------");

        short tkp = 3650;
        int deg = (int) tkp;
        System.out.println("----------------");


        try {
            System.out.println("Lütfen ekrana bir şey girin");
            String girdi = sc.nextLine();
            int number = Integer.parseInt(girdi);
            System.out.println("Girilen değer bir tamsayıdır: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Girilen değer bir tamsayı değil.");
        }

        System.out.println("---------------------");

        final int finaldegiskeni = 5;
        // finaldegiskeni=6;
        System.out.println("--------------------");

        int t = -4;

        System.out.println((t < 0) ? -t : t);
        System.out.println("------------------");
        // byte short int long
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println("-----------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        String input1 = scanner.nextLine();

        System.out.print("İkinci sayıyı girin: ");
        String input2 = scanner.nextLine();

        if ( eslesiyorMu(input1) && eslesiyorMu(input2)) {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            System.out.println("Her iki sayı da int türünde. Toplam: " + (num1 + num2));

        }

        System.out.println("-----------------");

        int number = 123;


        String str1 = String.valueOf(number);
        System.out.println("Birinci yöntemle dönüştürülen String: " + str1);


        String str2 = Integer.toString(number);
        System.out.println("İkinci yöntemle dönüştürülen String: " + str2);

        System.out.println("------------------------------");

        StaticClass.sayac=5;

        StaticClass staticClass=new StaticClass();
        staticClass.staticolmayanDegisken=4;

        System.out.println("--------------------");
        int deger=6;
        deger+=8;
        System.out.println(deger);

        System.out.println("---------------------");

        System.out.println("Bir değer girin ");
        String ifade=sc.nextLine();
        System.out.println("Bir sayı girin ");
        int saayt=sc.nextInt();
        System.out.println(ifade+ "  " + saayt);



    }








}

class sinif {

    private int sayiDegisken;
    private float fdegisken;
    private double dDegidken;
    private char cDegisken;

    public int getSayiDegisken() {
        return sayiDegisken;
    }

    public void setSayiDegisken(int sayiDegisken) {
        this.sayiDegisken = sayiDegisken;
    }

    public float getFdegisken() {
        return fdegisken;
    }

    public void setFdegisken(float fdegisken) {
        this.fdegisken = fdegisken;
    }

    public double getdDegidken() {
        return dDegidken;
    }

    public void setdDegidken(double dDegidken) {
        this.dDegidken = dDegidken;
    }

    public char getcDegisken() {
        return cDegisken;
    }

    public void setcDegisken(char cDegisken) {
        this.cDegisken = cDegisken;
    }




}

class StaticClass {
    public static int sayac;
    public int staticolmayanDegisken;
}









