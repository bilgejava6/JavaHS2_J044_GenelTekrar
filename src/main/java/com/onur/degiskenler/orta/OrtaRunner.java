package com.onur.degiskenler.orta;

import java.util.Scanner;

public class OrtaRunner {

    public static void main(String[] args) {


        // 1. Kullanıcıdan yaşını isteyin ve bunu bir değişkende saklayarak konsola yazdırın.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();
        System.out.println("Yaşınız: " + yas);

        // 2. Bir final değişken oluşturun ve ona bir sabit değer atayın. Daha sonra bu değeri değiştirmeye çalışın ve ne olduğunu açıklayın.
        final int SABIT = 10;
        // SABIT = 20;
        // Hata: The final local variable SABIT cannot be assigned. It must be blank and not using a compound assignment

        // 3. İki String değişkeni tanımlayın, birine adınızı, diğerine soyadınızı atayın. Bu değişkenleri birleştirerek tam adınızı konsola yazdırın.
        String ad = "Onur";
        String soyad = "Cinstas";
        System.out.println(ad + " " + soyad);

        // 4. Bir double ve bir int değişken oluşturup bunları topladığınızda çıkan sonucun türü nedir? Test ederek gösterin.
        double ondalik = 3.14;
        int tamSayi = 5;
        System.out.println(ondalik + tamSayi);
        // Sonuç double türündedir.

        // 5. Bir String değişkenine bir sayısal değer ("123") atayın ve bunu bir int değişkenine dönüştürerek toplama işlemi yapın.
        String sayi = "123";
        int sayiInt = Integer.parseInt(sayi);
        System.out.println(sayiInt + 5);

        // 6. long türünde bir değişken tanımlayın ve 1 milyar gibi büyük bir sayı atayın. Sonuçta bir hata alır mısınız?
        long buyukSayi = 1000000000;
        System.out.println(buyukSayi);
        // Hata alınmaz.

        // 7. Bir değişken tanımlayın ve önce int, sonra float, ardından String türüne dönüştürerek konsola yazdırın.
        int sayi2 = 10;
        float ondalik2 = sayi2;
        String sayi3 = String.valueOf(ondalik2);
        System.out.println(sayi2);
        System.out.println(ondalik2);
        System.out.println(sayi3);

        // 8. Kullanıcıdan bir kelime girmesini isteyin ve bu kelimenin uzunluğunu hesaplayan bir program yazın.
        System.out.print("Kelime girin: ");
        String kelime = scanner.next();
        System.out.println("Kelimenin uzunluğu: " + kelime.length());

        // 9. Bir short değişken oluşturup bir int değişkenine atayın. Bu işlem sırasında bir hata alır mısınız?
        short kisaSayi = 10;
        int intSayi = kisaSayi;
        System.out.println(intSayi);
        // Hata alınmaz.





    }

}
