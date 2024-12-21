package com.gonca.donguler;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Donguler {
    public static void main(String[] args) {

         // SORU 1
        //for döngüsü kullanarak 1’den 10’a kadar olan sayıları ekrana yazdırın.
        for(int i=0;i<10;i++)
        {
            System.out.println("Sayı : " +i);
        }

        // SORU 2
        //Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayan bir program yazın.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin");
        int sayi=sc.nextInt();
        for(int i=1;i<sayi;i++)
        {
            sayi*=i;
        }
        System.out.println("Faktöriyel" + sayi);

        // SORU 3
        // while döngüsü kullanarak 1’den 100’e kadar olan çift sayıları ekrana yazdırın.


        int sayif=1;
        while(sayif<100)
        {
            if(sayif %2==0)
            {
                System.out.println(" Çift sayı"+ sayi);
            }
            sayif++;
        }

        // SORU 4
        // 4.	1 ile 50 arasındaki sayılardan 5’in katlarını yazdıran bir döngü yazın.

        for(int i=1;i<50;i++)
        {
            if(i%5==0)
            {
                System.out.println(i);
            }
        }

        //SORU 5
        //do-while döngüsü kullanarak 1’den 20’ye kadar olan sayıları yazdırın.
        int k=1;
        do {
            System.out.println(k);
            k++;

        }while(k<20);

        // SORU6
        // Bir döngü içinde “Java” kelimesini 3 kez ekrana yazdırın.
        for(int i=1;i<3;i++)
        {
            System.out.println("JAVA");
        }
        // SORU7
        //Kullanıcıdan bir sayı alın ve 1’den bu sayıya kadar olan sayıların toplamını hesaplayan bir kod yazın.


        System.out.println("Lütfen bir sayı girin");
        int sayio=sc.nextInt();
        int toplam=0;
        for(int i=1;i<sayi;i++)
        {
             toplam +=sayio;
        }
        System.out.println(toplam);

        // SORU8
        //Bir for döngüsüyle 10’dan geriye doğru sayan bir program yazın.

        for(int i=10;i>=0;i--)
        {
            System.out.println(i);
        }

        //SORU 9
      // Bir döngü ile 0’dan 10’a kadar olan sayıların karesini ekrana yazdırın.
        for(int i=0;i<10;i++)
        {
            System.out.println(i + "nci sayının karesi "+  i*i);
        }
        // SORU 1
        System.out.println("Lütfen bir sayı girin ");
        int sayı=sc.nextInt();
        for(int i=1;i<sayi;i++)
        {
            if(!(sayi%i==0))
            {
                System.out.println(i +" Sayısı asaldır ");
            }
        }

        // SORU 2
        //Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisini konsola yazdıran bir program yazın.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisi için bir sayı girin: ");
        int sa = scanner.nextInt();

        // Fibonacci serisini hesapla ve yazdır
        int birinci = 0, ikinci = 1;

        System.out.print("Fibonacci Serisi: " + birinci);
        if (sa > 1) {
            System.out.print(", " + ikinci);
        }

        int sonraki;
        for (int i = 2; i < sayi; i++) {
            sonraki = birinci + ikinci; // Yeni Fibonacci sayısı
            System.out.print(", " + sonraki);
            birinci = ikinci; // İkinci sayı birinci olur
            ikinci = sonraki; // Yeni sayı ikinci olur
        }

        // SORU 3
        // İç içe döngüler kullanarak bir çarpım tablosu oluşturun.

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.println(i + " X "+ j+ "="+ i*j);
            }
        }

        // SORU 4
        // Kullanıcıdan bir sayı alın ve bu sayıyı tersten yazdıran bir program yazın.


        System.out.print(" 3 basamaklı bir  sayı girin  ");
        int say = scanner.nextInt();

        int birlerBasamagi = sayi % 10; // Son basamağı al
        int onlarBasamagi = (sayi / 10) % 10; // Ortadaki basamağı al
        int yuzlerBasamagi = sayi / 100; // İlk basamağı al

        // Ters sayı oluştur
        int tersSayi = (birlerBasamagi * 100) + (onlarBasamagi * 10) + yuzlerBasamagi;

        // Ters sayıyı yazdır
        System.out.println("Ters sayı: " + tersSayi);

        // SORU 5
        // Kullanıcıdan bir kelime alın ve kelimenin her karakterini bir satıra yazdıran bir kod yazın.
        System.out.print(" Lütfen bir kelime girin  ");
       String kelime = scanner.nextLine();

       for(int i=0;i<kelime.length();i++)
       {
           System.out.println(kelime.charAt(i));
           System.out.println();
       }

       // SORU 6
        //Bir for döngüsüyle 1’den 100’e kadar olan sayıların toplamını hesaplayın.
        int toplam1=0;
        for(int i=0;i<100;i++)
        {
         toplam1+=i;
        }
        System.out.println(toplam1);

        //SORU 7
        //Bir sayı dizisindeki en büyük ve en küçük sayıyı bulan bir döngü yazın.

        int[] dizi={5,8,41,7,6,82};
        int  enbuyuk=dizi[0];
        int enKucuk=dizi[0];
        for(int i=0;i<dizi.length;i++)
        {

            if(dizi[i]>enbuyuk)
            {
                enbuyuk=dizi[i];
            }
            if(dizi[i]<enKucuk)
            {
                enKucuk=dizi[i];
            }

        }
        System.out.println("En büyük dizi elemanı "+ enbuyuk);
        System.out.println("En küçük dizi elemanı "+ enKucuk);




        // SORU9
        // * 	9.	İç içe döngülerle bir yıldız desen çizdirin (örneğin, piramit).
        for(int i=0;i<10;i++)
        {
            for(int j=10;j>0;j--)
            {
                System.out.println("* ");
            }
        }

        // soru 10
        // * 	10.	1 ile 100 arasındaki sayıları kontrol ederek sadece 3 ve 5’e tam bölünebilenleri ekrana yazdırın.*/
         for(int i=1;i<100;i++)
         {
             if(i%3==0  && i% 5==0)
             {
                 System.out.println(i);
             }
         }


        // soru1
        // Kullanıcıdan bir sayı alın ve bu sayıyı asal çarpanlarına ayıran bir program yazın.

        // Kullanıcıdan bir sayı alın
        System.out.print("Bir sayı girin: ");
        int sayid = scanner.nextInt();


        System.out.print(sayid + " sayısının asal çarpanları: ");

        // Asal çarpanları bul
        for (int i = 2; i <= sayid; i++) {
            while (sayid % i == 0) {
                System.out.print(i + " ");
                sayi /= i; // Sayıyı bölerek azalt
            }
        }

        // soru 2
        // Bir sayı dizisindeki tüm çift ve tek sayıların toplamını ayrı ayrı bulan bir döngü yazın.

        int[]  sayilar={1,8,9,7,33,47,89,8,10,26,4};
        for(int i=0;i<sayilar.length;i++)
        {
           if(sayilar[i]%2 ==0)
           {
               System.out.println("Çift sayılar " + i);
           }
           else
           {
               System.out.println("Tek sayılar " + i);
           }
        }
        // SORU3
        // 	Kullanıcıdan bir sayı alın ve bu sayının mükemmel sayı olup olmadığını kontrol eden bir program yazın.

        System.out.print("Bir sayı girin: ");
        int sayiR = scanner.nextInt();


        int toplam12 = 0;


        for (int i = 1; i <= sayiR / 2; i++) { // Kendisi hariç bölenler
            if (sayiR % i == 0) {
                toplam12 += i;
            }
        }

        // Sonucu kontrol et ve ekrana yazdır
        if (toplam12 == sayiR) {
            System.out.println(sayi + " mükemmel bir sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel bir sayı değildir.");
        }
        // SORU 4
        //Kullanıcıdan bir kelime alın ve kelimenin permütasyonlarını iç içe döngüler kullanarak yazdırın.

        System.out.print("Bir kelime girin (3 harfli): ");
        String kelimeN = scanner.next();



        char a = kelimeN.charAt(0);
        char b = kelimeN.charAt(1);
        char c = kelimeN.charAt(2);

        System.out.println("Permütasyonlar:");
        System.out.println("" + a + b + c);
        System.out.println("" + a + c + b);
        System.out.println("" + b + a + c);
        System.out.println("" + b + c + a);
        System.out.println("" + c + a + b);
        System.out.println("" + c + b + a);




        //SORU 5
        //	Kullanıcıdan bir sayı alın ve bu sayıyı binary formatına dönüştüren bir döngü yazın.

        System.out.println("Bir sayı girin");
        int sy=sc.nextInt();


        // Binary formatını tutacak değişken
        String binary = "";

        // Sayıyı binary formatına dönüştür
        while (sayi > 0) {
            int kalan = sayi % 2; // 2'ye bölümünden kalan
            binary = kalan + binary; // Kalanı başa ekle
            sayi /= 2; // Sayıyı 2'ye böl
        }
        // SORU 6
        // 6.	Bir dizi içindeki tekrarlayan öğeleri bulan bir döngü yazın.

        int[] syt={1,5,6,6,9,8,6};
        for(int i=0;i<syt.length;i++)
        {
            if(syt[i]==syt[i+1])
            {
                System.out.println("Tekrarlayan değer" + sayi);
            }
        }

        // SORU7
        // 7.	İç içe döngülerle bir elmas deseni çizen bir program yazın.

        System.out.print("Elmasın yarı yüksekliğini (satır sayısı) girin: ");
        int n = scanner.nextInt();



        // Üst üçgen (dahil) kısmı çiz
        for (int i = 1; i <= n; i++) {
            // Boşlukları çiz
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları çiz
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt üçgen (hariç) kısmı çiz
        for (int i = n - 1; i >= 1; i--) {
            // Boşlukları çiz
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları çiz
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // SORU 8
        System.out.print("Bir sayı girin: ");
        int sayiŞ = scanner.nextInt();

        int tersSayiİ = 0;

        // Sayıyı tersine çevir
        while (sayiŞ != 0) {
            int basamak = sayiŞ % 10;  // Son basamağı al
            tersSayi = tersSayi * 10 + basamak;  // Basamağı yeni sayıya ekle
            sayiŞ /= 10;  // Son basamağı sayıyı 10'a bölerek çıkar
        }

        // Sonucu ekrana yazdır
        System.out.println("Tersine çevrilmiş sayı: " + tersSayi);

        //  Bir for döngüsü kullanarak Pascal üçgenini ekrana yazdıran bir program yazın.*/




        System.out.print("Pascal üçgeni için satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();

        // Pascal üçgenini yazdırmak için döngü
        for (int i = 0; i < satirSayisi; i++) {
            // Satır başında boşlukları yazdır
            for (int j = 0; j < satirSayisi - i - 1; j++) {
                System.out.print(" ");
            }

            // Her satırdaki sayıları yazdır
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Kombinasyon formülü
            }

            System.out.println(); // Yeni satıra geç
        }
















    }




}
