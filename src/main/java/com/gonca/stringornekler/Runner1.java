package com.gonca.stringornekler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner1 {
    public static void main(String[] args) {

        System.out.println("  SORU  1  CEVAP ");

        String ifade = " Bugun hava çok güzel";
        System.out.println(ifade.length());

        System.out.println("SORU  2  CEVAP ");

        String javaifade = " Java Programlama";
        System.out.println(javaifade.toUpperCase());

        System.out.println("SORU  3  CEVAP ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir ifade girin");
        String input = sc.nextLine();
        System.out.println(input.charAt(0));

        System.out.println("SORU  4  CEVAP ");

        String ifd = "Merhaba Dünya";

        System.out.println(ifd.indexOf("Dünya"));

        System.out.println("SORU  5  CEVAP ");

        String kl = " G O N C A G Ü L";
        String ters = "";
        for (int i = kl.length() - 1; i >= 0; i--) {
            ters += kl.charAt(i);
        }
        System.out.println(ters);

        System.out.println("SORU  6  CEVAP ");

        String jk = " Merhaba";
        String ol = "merhaba";

        if (jk.equals(ol)) {
            System.out.println("İfadeler birbirine eşit ");
        } else {
            System.out.println("İfadeler birbirine eşit değil");
        }

        System.out.println("SORU  7  CEVAP ");
        //  Bir String oluşturun ve boş olup olmadığını kontrol eden bir kod yazın.
        String metin = "";
        if (metin.isEmpty()) {
            System.out.println("String boştur.");
        } else {
            System.out.println("String boş değildir. İçeriği: " + metin);
        }

        System.out.println("SORU  8  CEVAP ");

        //“Java çok eğlenceli!” ifadesindeki tüm boşlukları kaldırarak yeni metni yazdırın.

        String ifade1 = "Java çok eğlenceli!";
        System.out.println(ifade1.replace(" ", ""));
        System.out.println("SORU  9  CEVAP ");
        //Kullanıcıdan bir kelime girmesini isteyin ve kelimenin içinde “a” harfinin olup olmadığını kontrol edin.

        System.out.println(" Lütfen bir kelime girin");
        String kelime = sc.nextLine();
        if (kelime.contains("e")) {
            System.out.println("Evet içeirisnde e harfi bulunuyor ");
        } else {
            System.out.println("Bulunmuyor ");
        }

        System.out.println("SORU  10  CEVAP ");
        //10.	“Hello” ve “World” metinlerini birleştirerek konsola yazdırın.

        System.out.println(" HELLO " + " WORD ");

        System.out.println("ORTA SORU CEVAPLARI");

        /*

         * 	8.	“programlama” kelimesindeki tüm sesli harfleri sayan bir program yazın.
         * 	10.	Kullanıcıdan bir cümle alın ve her kelimenin ilk harfini büyük yaparak yeni bir cümle oluşturun.  */

        System.out.println("SORU CEVAP 1");
        //Bir metni tersine çeviren bir program yazın ve ters metni ekrana yazdırın.
        String metin2 = " Bugun günlerden pazar.İçim de kelebekler uçuyor.Hava rüzgarlı ve yağışlı.";
        String tersi = "";
        for (int i = metin2.length() - 1; i >= 0; i--) {
            ters += metin2.charAt(i);
        }
        System.out.println(tersi);

        System.out.println("SORU CEVAP 2");
        //Kullanıcıdan bir cümle girmesini isteyin ve bu cümledeki kelime sayısını ekrana yazdırın.

        System.out.println("Bir cümle  girin");
        String kelime2 = sc.nextLine();
        String[] kelimeuzunluk = kelime2.split(" ");
        System.out.println("Cümledeki kelime sayısı" + kelimeuzunluk);

        System.out.println("SORU CEVAP 3 ");
        //“Bugün hava çok güzel” cümlesindeki tüm “a” harflerini “e” ile değiştiren bir kod yazın.

        String cumle = "Bugün hava çok güzel";
        String yeni = cumle.replace("a", "e");
        System.out.println(yeni);

        System.out.println("Soru CEVAP 4");
        // 	4.	Bir metin oluşturun ve içindeki tüm rakamları kaldırarak yeni metni yazdırın.

        String metin4 = "Bugun 3 adet kitap aldım.  65  tl para ödedim.5 gün sonra kitapları teslim edeceğim";


        // Tüm rakamları kaldır
        String yeniMetin = metin4.replaceAll("[0-9]", "");

        // Yeni metni yazdır
        System.out.println("Yeni Metin: " + yeniMetin);

        System.out.println("Soru cevap 5");
        //	5.	Kullanıcıdan bir cümle isteyin ve cümlenin palindrome olup olmadığını kontrol eden bir kod yazın.


        System.out.println("Bir cümle giriniz ");
        String cumle5 = sc.nextLine();

        String tersini = "";
        for (int i = cumle5.length() - 1; i >= 0; i--) {
            ters += cumle5.charAt(i);
        }
        if (cumle5.equals(ters)) {
            System.out.println("Cümle palindromiktir");
        } else {
            System.out.println("Cümle palindromik değildir");
        }
        System.out.println(" SORU CEVAP 6");
        //	6.	Kullanıcıdan bir kelime alın ve bu kelimenin her harfini alt alta yazdıran bir kod yazın.
        System.out.println("Bir kelime  giriniz ");
        String kelime5 = sc.nextLine();

        for (int i = 0; i < kelime5.length(); i++) {
            System.out.println(kelime5.charAt(i));
            System.out.println();
        }

        System.out.println("SORU CEVAP 7");
        //7.	Bir String oluşturun ve ilk 3 karakterini tekrar eden bir metin oluşturun (örneğin: abc → abcabcabc).

        String op = "GONCA";
        String yenil = op.substring(0, 2);
        for (int i = 0; i < 10; i++)
        {
            System.out.print(yenil);
        }

        System.out.println("SORU CEVAP 8 ");
        // 8.	“” kelimesindeki tüm sesli harfleri sayan bir program yazın.

        String p="programlama";
        char[] yeniok={'a','e','ı','i','o','ö','u','ü'};
        int sayac=0;
        for(int i=0;i<p.length();i++)
        {
            if(p.charAt(i)==yeniok[i])
            {
                sayac++;
            }
        }
        System.out.println("Sesli harf kelime sayısı"+ sayac);

        System.out.println("SORU CEVAP 9");

        //Kullanıcıdan bir cümle alın ve her kelimenin ilk harfini büyük yaparak yeni bir cümle oluşturun.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle girin: ");
        String cumle2 = scanner.nextLine();

        // Cümleyi böl ve her kelimenin ilk harfini büyük yap
        String[] kelimeler = cumle2.split(" ");
        StringBuilder yeniCumle = new StringBuilder();

        for (String kelime1 : kelimeler) {
            // İlk harfi büyük yap, geri kalan harfleri olduğu gibi bırak
            if (!kelime1.isEmpty()) {
                yeniCumle.append(kelime1.substring(0, 1).toUpperCase())
                        .append(kelime1.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        System.out.println("Yeni Cümle: " + yeniCumle.toString().trim());











    }

}
