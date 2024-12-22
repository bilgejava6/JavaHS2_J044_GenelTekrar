package com.gonca.kararyapıları;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class KARARYAPILARI {
    public static void main(String[] args) {

        //SORU 1
        // Kullanıcıdan bir sayı alın ve pozitif mi negatif mi olduğunu kontrol edin.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin ");
        int sayı=sc.nextInt();
        if(sayı>0)
        {
            System.out.println("Sayı pozitiftir");
        }
        else {
            System.out.println("Sayı negatifitr");
        }

        //SORU 2
        //Kullanıcıdan bir sayı alın ve bu sayının çift mi tek mi olduğunu yazdıran bir program yazın.

        System.out.println("Lütfen bir sayı girin ");
        int sayıS=sc.nextInt();
        if(sayıS %2==0)
        {
            System.out.println("Sayı çifttir");
        }
        else {
            System.out.println("Sayı tektir");
        }

        //SORU 3
        //	Kullanıcıdan bir yaş değeri alın ve bu yaşa göre “Çocuk”, “Genç”, veya “Yetişkin” yazdırın.
        System.out.println("Lütfen YAŞINIZI girin ");
        int YAS=sc.nextInt();

        if(YAS <18)
        {
            System.out.println(" ÇOCUK ");
        } else if (YAS >18  && YAS< 35) {
            System.out.println("GENÇ ");


        }else
        {
            System.out.println(" YETİŞKİN");
        }
        // SORU 4
        // 	Bir karakter alın ve bu karakterin sesli harf olup olmadığını kontrol eden bir kod yazın.
        System.out.println("BİR KARAKTER GİRİN  ");
          String c=sc.nextLine();

          String[] dizi={"a","e","ı","i","o","ö","u","ü"};
          for(int i=0;i<c.length();i++)
          {
              if(c== dizi[i])
              {
                  System.out.println(" Girdiğiniz harf seslidir ");
              }
              else
              {
                  System.out.println("Sessiz");
              }

          }

          // SORU 5
        //5.	Kullanıcıdan bir not girilmesini isteyin ve bu nota göre “Geçti” veya “Kaldı” yazdırın.
        System.out.println("Lütfen bir not girin   ");
      int not=sc.nextInt();
         if(not<45)
        {
            System.out.println(" KALDI ");
        } else {
             System.out.println("GEÇTİ");
         }
         // SORU 6
        // 	6.	Kullanıcıdan bir gün adı alın ve bu günün hafta içi mi hafta sonu mu olduğunu kontrol edin.

        System.out.println("Lütfen gün adı girin   ");
        String gun=sc.nextLine();
        switch (gun.toUpperCase())
        {
            case "PAZARTESİ":
                System.out.println("HAFTA İÇİ ");
                break;
            case "SALI ":
                System.out.println("HAFTA İÇİ ");
                break;
            case "ÇARŞAMBA":
                System.out.println("HAFTA İÇİ ");
                break;

            case "PERŞEMBE":
                System.out.println("HAFTA İÇİ ");
                break;

            case "CUMA":
                System.out.println("HAFTA İÇİ ");
                break;

            case "CUMARTESİ":
                System.out.println("HAFTA sonu ");
                break;
            case "PAZAR":
                System.out.println("HAFTA  sonu");
                break;


        }
        // SORU7
        //	7.	.	Kullanıcıdan bir rakam girilmesini isteyin ve bu rakamın İngilizce karşılığını yazdırın.
        System.out.println("Lütfen bir  rakam girin   ");
        int rakam=sc.nextInt();

        switch (rakam)
        {
            case 0:
                System.out.println("  ZERO ");
                break;
            case 1:
                System.out.println("ONE  ");
                break;
            case 2:
                System.out.println(" TWO ");
                break;

            case 3:
                System.out.println("THREE ");
                break;

            case 4:
                System.out.println("FOUR ");
                break;

            case 5:
                System.out.println("FİVE ");
                break;
            case  6:
                System.out.println("SİX ");
                break;
            case  7:
                System.out.println("SEVEN ");
                break;
            case 8:
                System.out.println("EİGHT ");
                break;
            case  9:
                System.out.println("NİNE  ");
                break;
            case  10:
                System.out.println("TEN ");
                break;


        }

         //9.	Kullanıcıdan bir sayı alın ve bu sayının 3 ve 5 ile bölünebilirliğini kontrol edin.

        System.out.println("Lütfen bir    sayı girin   ");
        int sy=sc.nextInt();
        if(sayı% 3==0 &&  sayı% 5==0)
        {
            System.out.println("Sayı 3 ve 5 e tam bölünür ");
        }

         //	10.	Kullanıcıdan bir ay numarası alın ve bu ayın kaç gün olduğunu yazdırın.*/
        System.out.println("Lütfenhangi ayda olduğunuzu rakam olarak  girin   ");
        int rakamm=sc.nextInt();



        switch (rakamm)
        {
            case 4,6,9,11:
                System.out.println("30 çeker ");
                break;

            case  1,3,5,7,8,10,12 :
                System.out.println("31 ÇEKER ");
                break;
            case 2:
                System.out.println("28 ÇEKER ");
                break;

        }

        //1.	Kullanıcıdan iki sayı alın ve büyüğünü ekrana yazdıran bir kod yazın.

        System.out.println("Lütfen bir   sayı girin   ");
        int birinci=sc.nextInt();
        System.out.println("Lütfen ikinci  sayı girin   ");
        int ikinci=sc.nextInt();

        if(birinci>ikinci)
        {
            System.out.println("Birinci sayı büyüktür");
        }
        else {
            System.out.println("2. sayı büyüktür");
        }

        // SORU2
        //.	Kullanıcıdan bir not alın ve bu nota göre harf notu (A, B, C, vb.) yazdırın.
        System.out.println("Lütfen  NOTUNUZU   girin   ");
        int not1 =sc.nextInt();

        if(not1 <45)
        {
            System.out.println(" NOTUNUZ C  ");
        } else if (not1 >45  && not1 < 60) {
            System.out.println(" NOTUNUZ B  ");
        }
        else {
            System.out.println(" NOTUNUZ A ");

        }

        // Kullanıcıdan bir yıl alın ve bu yılın artık yıl olup olmadığını kontrol edin.
        System.out.println("Lütfen  NOTUNUZU   girin   ");
        int yil =sc.nextInt();

        if(yil% 4== 0)
        {
            System.out.println("ARTIK YILDIR ");
        }
        else
        {
            System.out.println("ARTIK YIL değildir ");
        }

        //	4.	Bir karakter alın ve bu karakterin büyük harf, küçük harf veya sayı olup olmadığını kontrol eden bir program yazın
        System.out.println("Lütfen  bir karakter    girin   ");
        String karakter  =sc.nextLine();

        if(karakter.toUpperCase().equals(karakter))
        {
            System.out.println("BÜYÜK HARF");
        }
        else
        {
            System.out.println("Küçük harf");
        }

//        if (Character.isDigit(karakter).) {
//            System.out.println("SAYIDIR");
//        }
//        } else {
//            System.out.println("NE SAYI NE DE HARF");
//        }

        // Kullanıcıdan üç sayı alın ve en büyüğünü bulan bir kod yazın.
        System.out.println("Lütfen bir   sayı girin   ");
        int bir=sc.nextInt();
        System.out.println("Lütfen ikinci  sayı girin   ");
        int iki=sc.nextInt();

        System.out.println("Lütfen ikinci  sayı girin   ");
        int üç=sc.nextInt();

        int enbuyuk=bir;
        if(iki>bir )
        {
            enbuyuk=iki;
        }
        else if(üç> bir) {
            enbuyuk=üç;
        }
        else
        {
            enbuyuk=bir;
        }
        System.out.println("En büyük " + enbuyuk);

        //	Kullanıcıdan bir sayı alın ve bu sayının hangi çeyreğe (0-25, 26-50, vb.) düştüğünü kontrol edin.
        System.out.println("Lütfen bir   sayı girin   ");
        int s=sc.nextInt();

        if(s>0 && s<25)
        {
            System.out.println("BİRİNCİ ÇEYREK");
        }
        else if(s>25 && s<50)
        {
            System.out.println("ikinci çeyrek ");
        } else if (s>50 && s<75) {
            System.out.println("üçüncü çeyrek ");
        }else {
            System.out.println("dördüncü çeyrek ");
        }


        //	Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisinde olup olmadığını kontrol edin.
        System.out.println("Lütfen bir   sayı girin   ");
        int s1=sc.nextInt();
        int[] dizii={ 0, 1 ,1 ,2, 3, 5, 8, 13, 21, 34};
        for(int i=0;i<dizii.length;i++)
        {
            if(dizii[i]==s1)
            {
                System.out.println("Sayı seride vardır ");
            }
            else
            {
                System.out.println( "Sayı seride değildir ");
            }
        }

        //	Kullanıcıdan bir gün adı alın ve bu güne göre bir öneri yazdırın (örneğin: “Pazartesi: Yeni haftaya başlıyoruz!”).
        System.out.println("Lütfen bir gün adı  girin   ");
        String gun1=sc.nextLine();
        switch (gun1.toUpperCase())
        {
            case "PAZARTESİ":
                System.out.println("MUTLU GÜNLER  ");
                break;
            case "SALI ":
                System.out.println(" İYİ GÜNLER  ");
                break;
            case "ÇARŞAMBA":
                System.out.println("HOŞÇAKALIN ");
                break;

            case "PERŞEMBE":
                System.out.println(" MERHBALAR  ");
                break;

            case "CUMA":
                System.out.println(" NEREDE KALDINIZ  ");
                break;

            case "CUMARTESİ":
                System.out.println("MUTLU GÜNLER DİLERİZ  ");
                break;
            case "PAZAR":
                System.out.println("MUTLU PAZARLAR ");
                break;


        }


        //	Bir switch ifadesi kullanarak bir hesap makinesi yazın (toplama, çıkarma, çarpma, bölme).


        System.out.println("Lütfen bir   sayı girin   ");
        int b=sc.nextInt();
        System.out.println("Lütfen ikinci  sayı girin   ");
        int k=sc.nextInt();
        System.out.println("""
                TOPLAMA: 1
                ÇIKARTMA: 2
                ÇARPMA: 3
                BÖLME: 4
                
                LÜTFEN SEÇİNİZ 
                
                
                """);
        int secim=sc.nextInt();

        switch (secim)
        {
            case 1 :
                System.out.println("toplama işlemi   ");
                System.out.println("Toplam" + (b+k));
                break;
            case 2:
                System.out.println("ÇIKARTMA İŞLEMİ  ");
                System.out.println("FARK " + (b-k));
                break;
            case 3:
                System.out.println("ÇARPMA İŞLEMİ  ");
                System.out.println("Çarpım" + (b*k));
                break;

            case 4:
                System.out.println("BÖLME  İŞLEMİ  ");
                System.out.println("BÖLÜM " + (b/k));
                break;


        }

        //	Kullanıcıdan bir kelime alın ve bu kelimenin uzunluğuna göre farklı mesajlar yazdırın.
        System.out.println("Lütfen KELİME   girin   ");
        String kelime=sc.nextLine();
        int uzunluk= kelime.length();

        if(uzunluk<10)
        {
            System.out.println("Girdiğiniz kelime 10 harften küçüktür ");
        }
        else if(uzunluk>10 && uzunluk<50)
        {
            System.out.println("Girdiğiniz kelime 50 harften küçüktür ");
        }
        else {
            System.out.println("Girdiğiniz kelime çok büyük ");
        }

        //	1.	Kullanıcıdan bir sayı alın ve bu sayının mükemmel kare olup olmadığını kontrol eden bir program yazın.




         //	Kullanıcıdan bir sıcaklık değeri alın ve bu sıcaklığa göre “Soğuk”, “Ilık”, veya “Sıcak” yazdırın.
        System.out.println("Lütfen sıcaklığı   girin   ");
       int sıcaklık=sc.nextInt();


        if(sıcaklık<40)
        {
            System.out.println("SOĞUK");
        }
        else if(sıcaklık>40 && sıcaklık<60)
        {
            System.out.println("ILIK");
        }
        else {
            System.out.println(" SICAK  ");
        }


                //	3.	Kullanıcıdan bir tarih alın ve bu tarihin geçerli bir tarih olup olmadığını kontrol eden bir kod yazın.
                    System.out.println("Lütfen hangi tarihte olduğunuzu   girin   ");
                    LocalDate day = LocalDate.parse(sc.nextLine());
                    if(day.equals(LocalDate.now()))
                    {
                        if(!(day.getYear()==LocalDate.now().getYear()))
                        {
                            System.out.println("Gçersiz  tarih ");
                        }


                    }

        //	4.	Kullanıcıdan bir sayı alın ve bu sayının asal olup olmadığını kontrol eden bir program yazın.



                //	5.	Kullanıcıdan bir dizi sayı alın ve bu sayıların ortalamasını, medyanını ve modunu hesaplayan bir kod yazın.


         //	6.	Kullanıcıdan bir sayı alın ve bu sayıyı 1’den 5’e kadar karşılaştırarak farklı mesajlar yazdırın.


         //	7.	Bir kelimenin String içindeki en sık tekrar eden harfini bulan bir program yazın.



                // 8.	Kullanıcıdan bir sayı alın ve bu sayının tam kare, tam küp veya başka bir duruma uygun olup olmadığını yazdırın.




                //	9.	Bir yıl alın ve o yılın Çin Zodyak burcunu hesaplayan bir program yazın.*/





    }
}
