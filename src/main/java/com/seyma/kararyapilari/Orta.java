package com.seyma.kararyapilari;

import java.util.Scanner;

public class Orta {
    /**   * 	1.	Kullanıcıdan iki sayı alın ve büyüğünü ekrana yazdıran bir kod yazın.
     * 	2.	Kullanıcıdan bir not alın ve bu nota göre harf notu (A, B, C, vb.) yazdırın.
     * 	3.	Kullanıcıdan bir yıl alın ve bu yılın artık yıl olup olmadığını kontrol edin.
     * 	4.	Bir karakter alın ve bu karakterin büyük harf, küçük harf veya sayı olup olmadığını kontrol eden bir program yazın.
     * 	5.	Kullanıcıdan üç sayı alın ve en büyüğünü bulan bir kod yazın.
     * 	6.	Kullanıcıdan bir sayı alın ve bu sayının hangi çeyreğe (0-25, 26-50, vb.) düştüğünü kontrol edin.
     * 	7.	Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisinde olup olmadığını kontrol edin.
     * 	8.	Kullanıcıdan bir gün adı alın ve bu güne göre bir öneri yazdırın (örneğin: “Pazartesi: Yeni haftaya başlıyoruz!”).
     * 	9.	Bir switch ifadesi kullanarak bir hesap makinesi yazın (toplama, çıkarma, çarpma, bölme).
     * 	10.	Kullanıcıdan bir kelime alın ve bu kelimenin uzunluğuna göre farklı mesajlar yazdırın.
     *
     */


    public static void main(String[] args) {
        soru5();

    }

    public static void soru1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        if(sayi1 > sayi2){
            System.out.println("ilk girilen sayı daha büyük"+sayi1);
        }else
            System.out.println("ikinci girilen sayı daha büyük"+sayi2);
    }

    public static void soru2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunu giriniz: ");
        int sinav=scanner.nextInt();

        if (sinav > 0 && sinav<=45){
            System.out.println("FF");
        } else if (sinav >45  && sinav<55) {
            System.out.println("DD");
        } else if (sinav >=55  && sinav<70) {
            System.out.println("CC");
        } else if (sinav >=70 && sinav<80) {
            System.out.println("BB");
        }else if (sinav >=80 && sinav<100) {
            System.out.println("AA");
        }else
            System.out.println("Geçerli bir not giriniz");
    }

    public static void soru3(){

    }
    public static void soru4(){
        System.out.println("Bir karakter giriniz: ");
        char karakter =new Scanner(System.in).next().charAt(0);

        if(Character.isDigit(karakter)){
            System.out.println("Bu bir sayı ");
        } else if (Character.isUpperCase(karakter)) {
            System.out.println("Büyük karakter  ");
        } else if (Character.isLowerCase(karakter)) {
            System.out.println("küçük karakter");
        }else
            System.out.println("diğer");

    }

    public static void soru5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...:");
        int sayi1 = scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz...:");
        int sayi2 = scanner.nextInt();
        System.out.println("üçüncü sayıyı giriniz...:");
        int sayi3 = scanner.nextInt();

        int ebs=sayi1;
        if (sayi2 >sayi1){
            ebs=sayi2;
        } else if (sayi3>sayi2) {
            ebs=sayi3;
        }System.out.println("En büyük sayı"+ebs);

    }

    public static void soru6(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayii = scanner.nextInt();
        if (sayii >= 0 && sayii<=25){
            System.out.println("1.çeyrek");
        } else if (sayii > 25 && sayii<=50) {
            System.out.println("2.çeyrek");

        } else if (sayii > 50 && sayii<=75) {
            System.out.println("3.çeyrek");

        } else if (sayii > 75 && sayii<=100) {
            System.out.println("4.çeyrek");

        }else
            System.out.println("diğer");


    }


    public static void soru7(){

    }

    public static void soru8(){
        System.out.println("Haftanın bir gününü yazınız...:");
        String gun = new Scanner(System.in).nextLine().toLowerCase();

        switch (gun){
            case "pazartesi":
                System.out.println("haftanın ilk günün pazartesi");
            case "salı":
                System.out.println("2. gün");
            case "çarsamba":
                System.out.println("3.gün");
            case "persembe":
                System.out.println("4.gün");
            case "cuma":
                System.out.println("5.gün");
            case "cumartesi":
                System.out.println("6.gün");
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("geçersiz gün");

        }

    }

    public static void soru9(){

        System.out.println("Bir sayı giriniz...:");
        int sayi =new Scanner(System.in).nextInt();
        System.out.println("Bir sayı daha giriniz");
        int sayi2 =new Scanner(System.in).nextInt();

        System.out.println("""
                *******işlemler****
                1-toplama
                2-çıkarma
                3-çarpma
                4-bölme
                0-çıkış""");
        System.out.println("lütfen seçiniz...:");
        int secim = new Scanner(System.in).nextInt();

        switch (secim) {
            case 1: System.out.println("Toplama yapıldı");break;
            case 2: System.out.println("Çıkartma yapıldı");break;
            case 3: System.out.println("çarpma");break;
            case 4: System.out.println("bölme");break;
            case 0: System.out.println("çıkış");break;
            default:
                System.out.println("yanlış seçim" );;




        }

    }

}
