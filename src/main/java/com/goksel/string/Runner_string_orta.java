package com.goksel.string;

import java.util.Scanner;

public class Runner_string_orta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1)

        String metin1 = "Tersinemetnicevirdim";

        String ters1 = new StringBuilder(metin1).reverse().toString();
        System.out.println("(1) Orijinal: " + metin1);
        System.out.println("    Ters çevrilmiş: " + ters1);

        // 2)

        System.out.print("(2) Bir cümle giriniz: ");
        String cumle2 = scanner.nextLine();

        String[] kelimeler2 = cumle2.trim().split("\\s+");

        System.out.println("    Kelime sayısı: " + kelimeler2.length);

        // 3)

        String metin35 = "Bugün hava çok güzel";
        String degistirilmis3 = metin35.replace('a', 'e');
        System.out.println("(3) Orijinal: " + metin35);
        System.out.println("    'a' → 'e' dönüşümü: " + degistirilmis3);

        // 4)
        String metin4 = "Gs35Xy678";

        String rakamsiz4 = metin4.replaceAll("\\d", "");
        System.out.println("(4) Orijinal: " + metin4);
        System.out.println("    Rakamlar kaldırıldı: " + rakamsiz4);

        // 5)

        System.out.print("(5) Bir cümle giriniz (palindrome kontrolü): ");
        String cumle5 = scanner.nextLine();

        String duz5 = cumle5.replaceAll("\\s+", "");
        String ters5 = new StringBuilder(duz5).reverse().toString();
        if (duz5.equalsIgnoreCase(ters5)) {
            System.out.println("    Bu cümle palindrome.");
        } else {
            System.out.println("    Bu cümle palindrome DEĞİL.");
        }

        // 6)

        System.out.print("(6) Bir kelime giriniz: ");
        String kelime6 = scanner.nextLine();
        System.out.println("    Harfleri alt alta:");
        for (int i = 0; i < kelime6.length(); i++) {
            System.out.println("    " + kelime6.charAt(i));
        }

        // 7)

        String metin7 = "Merhaba";

        int length7 = Math.min(3, metin7.length());
        String ilkUc7 = metin7.substring(0, length7);

        String tekrar7 = ilkUc7 + ilkUc7 + ilkUc7;
        System.out.println("(7) Orijinal: " + metin7);
        System.out.println("    İlk 3 karakter x3: " + tekrar7);

        // 8)

        String kelime8 = "programlama";
        int sesliSayac = 0;


        for (int i = 0; i < kelime8.length(); i++) {
            char c = Character.toLowerCase(kelime8.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'ı' || c == 'ü' || c == 'ö') {
                sesliSayac++;
            }
        }
        System.out.println("(8) \"programlama\" kelimesindeki sesli harf sayısı: " + sesliSayac);

        // 10)

        System.out.print("(10) Bir cümle giriniz: ");
        String cumle10 = scanner.nextLine().trim();


        String[] kelimeler10 = cumle10.split("\\s+");
        StringBuilder sb10 = new StringBuilder();

        for (int i = 0; i < kelimeler10.length; i++) {
            if (!kelimeler10[i].isEmpty()) {


                String ilkHarfBuyuk = kelimeler10[i].substring(0,1).toUpperCase();
                String geriKalan = "";
                if (kelimeler10[i].length() > 1) {
                    geriKalan = kelimeler10[i].substring(1);
                }
                sb10.append(ilkHarfBuyuk).append(geriKalan).append(" ");
            }
        }

        String yeniCumle10 = sb10.toString().trim();
        System.out.println("    Her kelimenin ilk harfi büyük: " + yeniCumle10);
    }
}
