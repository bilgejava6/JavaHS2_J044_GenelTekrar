package com.onur.donguler.orta;

import java.util.Scanner;

public class OrtaRunner {

    public static void main(String[] args) {

        //1. Kullanıcıdan bir sayı alın ve bu sayıya kadar olan tüm asal sayıları ekrana yazdırın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        for (int i = 2; i <= sayi; i++) {
            boolean asalMi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.println(i);
            }
        }

        //2. Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisini konsola yazdıran bir program yazın.
        System.out.println("Bir sayı girin: ");
        int sayi2 = scanner.nextInt();
        int onceki = 0;
        int sonraki = 1;
        for (int i = 0; i < sayi2; i++) {
            System.out.println(onceki);
            int toplam = onceki + sonraki;
            onceki = sonraki;
            sonraki = toplam;
        }

        //3. İç içe döngüler kullanarak bir çarpım tablosu oluşturun.
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        //4. Kullanıcıdan bir sayı alın ve bu sayıyı tersten yazdıran bir program yazın.
        System.out.println("Bir sayı girin: ");
        int sayi3 = scanner.nextInt();
        String sayiStr = String.valueOf(sayi3);
        for (int i = sayiStr.length() - 1; i >= 0; i--) {
            System.out.print(sayiStr.charAt(i));
        }

        //5. Kullanıcıdan bir kelime alın ve kelimenin her karakterini bir satıra yazdıran bir kod yazın.
        System.out.println("Bir kelime girin: ");
        String kelime = scanner.next();
        for (int i = 0; i < kelime.length(); i++) {
            System.out.println(kelime.charAt(i));
        }

        //6. Bir for döngüsüyle 1’den 100’e kadar olan sayıların toplamını hesaplayın.
        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam += i;
        }

        //7. Bir sayı dizisindeki en büyük ve en küçük sayıyı bulan bir döngü yazın.
        int[] sayilar = {5, 8, 2, 1, 9, 4, 6, 3};
        int enBuyuk = sayilar[0];
        int enKucuk = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i];
            }
            if (sayilar[i] < enKucuk) {
                enKucuk = sayilar[i];
            }
        }

        //8. Bir while döngüsüyle bir sayının basamaklarının toplamını hesaplayan bir program yazın.
        System.out.println("Bir sayı girin: ");
        int sayi4 = scanner.nextInt();
        int toplam2 = 0;
        while (sayi4 > 0) {
            toplam2 += sayi4 % 10;
            sayi4 /= 10;
        }

        //9. İç içe döngülerle bir yıldız desen çizdirin (örneğin, piramit).
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //10. 1 ile 100 arasındaki sayıları kontrol ederek sadece 3 ve 5’e tam bölünebilenleri ekrana yazdırın.
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }



    }

}
