package com.elifcan.kararyapilari;

import java.util.Scanner;

public class Runner_Kararyapilari_Orta {
    public static void main(String[] args) {
        cevap7(8);
    }
    private static void cevap1(int sayi1, int sayi2) {
        if(sayi1 > sayi2) {
            System.out.println("Büyük sayi : " + sayi1);
        }
        else {
            System.out.println("Büyük sayi : " + sayi2);
        }
    }
    private static void cevap2(int sayi) {
        if(sayi < 50) {
            System.out.println("FF");
        }
        else if(sayi < 60) {
            System.out.println("FD");
        }
        else if (sayi < 65){
            System.out.println("DD");
        }
        else if(sayi < 70){
            System.out.println("DC");
        }
        else if(sayi < 75) {
            System.out.println("CC");
        }
        else if (sayi < 80){
            System.out.println("CB");
        }
        else if(sayi < 85){
            System.out.println("BB");
        }
        else if(sayi < 90) {
            System.out.println("BA");
        }
        else if (sayi <= 100){
            System.out.println("AA");
        }
        else {
            System.out.println("You entered wrong grade.");
        }
    }
    private static void cevap3(int yil) {
        if ( yil % 4 == 0){
            System.out.println(yil + " artik yildir.");
        }
        else{
            System.out.println(yil + " artik yil degildir.");
        }
    }
    private static void cevap4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir karakter giriniz : ");
        if (scanner.hasNextInt()) {
            System.out.println("Sayi girdiniz.");
        }
        else if(scanner.hasNextLine()){
            System.out.println("String girdiniz");
        }
    }
    private static void cevap5(int sayi1, int sayi2, int sayi3) {
        int eb = sayi1;
        if(sayi2 > sayi1 && sayi2 > sayi3) {
            eb = sayi2;
        }
        else if(sayi3 > sayi1 && sayi3 > sayi2) {
            eb = sayi3;
        }
        System.out.println("En büyük sayi : " + eb);
    }
    private static void cevap6(int sayi){
        if ( sayi < 25 || sayi >0){
            System.out.println(sayi + " sayi ilk çeğreğe aittir.");
        }
        else if ( sayi < 50 ){
            System.out.println(sayi + " sayi ikinci çeğreğe aittir.");
        }
        else if ( sayi < 75 ){
            System.out.println(sayi + " sayi üçüncü çeğreğe aittir.");
        }
        else if ( sayi < 100 ){
            System.out.println(sayi + " sayi son çeğreğe aittir.");
        }
    }
    private static void cevap7(int sayi) {
        int a = 0, b = 1;
        for (int i = 2; i < sayi+2; ++i) {
            int c = a + b;
            a = b;
            b = c;
            if(sayi == c){
                System.out.println("vardır");
            }
        }
    }
    private static void cevap8(String gun) {
        switch (gun){
            case "Pazartesi":
                System.out.println("Yeni haftaya merhaba!");
                break;
            case "Sali":
                System.out.println("Sali sallanir");
                break;
            case "Çarşamba":
                System.out.println("Çarşamba yeni cuma");
                break;
            case "Perşembe":
                System.out.println("Az kaldı haftaiçi bitiyor");
                break;
            case "Cuma":
                System.out.println("Thanks God it's friday");
                break;
            case "Cumartesi":
                System.out.println("Sosyalleşme günü");
                break;
            case "Pazar":
                System.out.println("Dinleme günü");
                break;
            default:
                System.out.println("There is no day called " + gun);
        }
    }
    private static void cevap9(int sayi1, int sayi2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                ********* Hesap Makinesi *********
                1- Toplama
                2- Çıkarma
                3- Çarpma
                4- Bölme
                0- Cikis
                Yapmak istediğiniz işlemi seçin.
                """);
        int sayi = scanner.nextInt();
        switch (sayi){
            case 1:
                int toplama = sayi1 + sayi2;
                break;
            case 2:
                int cikarma = sayi1 - sayi2;
                break;
            case 3:
                int çarpma = sayi1 * sayi2;
                break;
            case 4:
                int bolme = sayi1 / sayi2;
                break;
            case 0:
                System.out.println("Çıkış yapıldı");
                break;
            default:
                System.out.println("Geçersiz giriş yaptınız.");
        }
    }
    private static void cevap10(String statement) {
        if(statement.length()<15){
            System.out.println(statement + " uzunlugu 15'ten küçük.");
        }
        else if(statement.length()<30){
            System.out.println(statement + " uzunlugu 30'dan küçük.");
        }
        else if(statement.length()<15){
            System.out.println(statement + " uzunlugu 50'den küçük.");
        }
        else{
            System.out.println("Bitti.");
        }
    }
}
