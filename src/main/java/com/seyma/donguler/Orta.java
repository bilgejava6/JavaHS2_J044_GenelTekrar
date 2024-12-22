package com.seyma.donguler;

import java.util.Scanner;

public class Orta {
    /**
     * 1.	Kullanıcıdan bir sayı alın ve bu sayıya kadar olan tüm asal sayıları ekrana yazdırın.
     * 2.	Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisini konsola yazdıran bir program yazın.
     * 3.	İç içe döngüler kullanarak bir çarpım tablosu oluşturun.
     * 4.	Kullanıcıdan bir sayı alın ve bu sayıyı tersten yazdıran bir program yazın.
     * 5.	Kullanıcıdan bir kelime alın ve kelimenin her karakterini bir satıra yazdıran bir kod yazın.
     * 6.	Bir for döngüsüyle 1’den 100’e kadar olan sayıların toplamını hesaplayın.
     * 7.	Bir sayı dizisindeki en büyük ve en küçük sayıyı bulan bir döngü yazın.
     * 8.	Bir while döngüsüyle bir sayının basamaklarının toplamını hesaplayan bir program yazın.
     * 9.	İç içe döngülerle bir yıldız desen çizdirin (örneğin, piramit).
     * 0.	1 ile 100 arasındaki sayıları kontrol ederek sadece 3 ve 5’e tam bölünebilenleri ekrana yazdırın.
     */
    public static void main(String[] args) {
        soru1();
        soru2();
        soru3();
        soru4();
        soru5();
        soru6();
        soru7();
        soru8();
        soru9();
        soru10();

    }

    public static void soru1() {

        System.out.println("Bir sayı giriniz...:");
        int sayi = new Scanner(System.in).nextInt();

        for (int i = 2; i <=sayi; i++) {
            boolean asal = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }

            }
            if (asal) {
                System.out.println("Asal sayılar...:"+i);

            }

        }

    }

    public static void soru2() {

        // 0,1,1,2,3,5,8,13......

    }

    public static void soru3() {
        System.out.println("Bir sayı giriniz...:");
        int sayi1 = new Scanner(System.in).nextInt();
        System.out.println("İkinci sayıyı giriniz...:");
        int sayi2 = new Scanner(System.in).nextInt();

        for (int i = 0; i <sayi1; i++) {
            for (int j = 0; j <sayi2; j++) {
                int carpim = i*j;
                System.out.println(i+"*"+j+"Çarpım"+carpim);
            }
        }



    }

    public static void soru4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...:");
        int sayi3 = scanner.nextInt();

    }

    public static void soru5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz...:");
        String kelime = scanner.nextLine();

        for (int i = 0; i < kelime.length(); i++) {
            System.out.println(kelime.charAt(i));
        }


    }

    public static void soru6(){
        int toplam = 0;
        for (int i=1;i<100;i++){
            toplam +=i;
        }
        System.out.println("TOPLAM..:"+toplam);

    }

    public static void soru7(){

        int [] sayilar = {32,45,67,89,77,95,954,95,43,21,78};
        int eb =sayilar[0];
        int ek =sayilar[0];
        for (int sayi : sayilar) {
            if(sayi>eb) {
                eb = sayi;
            }
            if(sayi<ek) {
                ek = sayi;
            }
        }

        System.out.println("En büyük sayı..:"+eb);
        System.out.println("En küçük sayı..:"+ek);






    }

    public static void soru8(){

        int sayi = 24533;
        int toplamm = 0;
        while (sayi != 0){
            int basamak = sayi%10;
            toplamm +=basamak;
            sayi /=10;

        }
        System.out.println("TOPLAM..:"+toplamm);

    }

    public static void soru9(){


        for (int i=1; i<8;i++){
            for(int j=1;j<8-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void soru10(){

        for (int i=1; i<=100;i++){
            if(i%5== 0 && i%3==0){
                System.out.println("3 ve 5 e tam bölünen sayı...:"+ i);
            }
        }

    }













}

















