package com.serkankilicdere.kararYapilari.orta;

import java.util.Scanner;

public class Orta {

    /*
    Orta
                                    * 	1.	Kullanıcıdan iki sayı alın ve büyüğünü ekrana yazdıran bir kod yazın.
                                    * 	2.	Kullanıcıdan bir not alın ve bu nota göre harf notu (A, B, C, vb.) yazdırın.
                                    * 	3.	Kullanıcıdan bir yıl alın ve bu yılın artık yıl olup olmadığını kontrol edin.
                                    * 	4.	Bir karakter alın ve bu karakterin büyük harf, küçük harf veya sayı olup olmadığını kontrol eden bir program yazın.
                                    * 	5.	Kullanıcıdan üç sayı alın ve en büyüğünü bulan bir kod yazın.
                                    * 	6.	Kullanıcıdan bir sayı alın ve bu sayının hangi çeyreğe (0-25, 26-50, vb.) düştüğünü kontrol edin.
                                    * 	7.	Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisinde olup olmadığını kontrol edin.
                                    * 	8.	Kullanıcıdan bir gün adı alın ve bu güne göre bir öneri yazdırın (örneğin: “Pazartesi: Yeni haftaya başlıyoruz!”).
                                    * 	9.	Bir switch ifadesi kullanarak bir hesap makinesi yazın (toplama, çıkarma, çarpma, bölme).
                                    * 	10.	Kullanıcıdan bir kelime alın ve bu kelimenin uzunluğuna göre farklı mesajlar yazdırın.
     */

    public static void main(String[] args) {

        //1.	Kullanıcıdan iki sayı alın ve büyüğünü ekrana yazdıran bir kod yazın.

        Scanner sc = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz: ");
        int ilkSayi = sc.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        int ikinciSayi = sc.nextInt();

        if (ilkSayi > ikinciSayi) {
            System.out.println(ilkSayi);
        }else {
            System.out.println(ikinciSayi);
        }


    }
}
