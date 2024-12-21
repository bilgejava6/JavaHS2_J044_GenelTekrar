package com.onur.degiskenler.zor;

import java.util.Scanner;

public class ZorRunner {
    public static void main(String[] args) {

        // 1. Kullanıcıdan bir String girişi alın ve bunun bir tamsayı olup olmadığını kontrol edin. Eğer tamsayıysa ekrana dönüştürülmüş değerini yazdırın.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı girin: ");
        String tamsayi = scanner.next();
        try {
            int tamsayiInt = Integer.parseInt(tamsayi);
            System.out.println("Girilen tamsayı: " + tamsayiInt);
        } catch (NumberFormatException e) {
            System.out.println("Girilen değer tamsayı değil.");
        }

        // 2. int, float, double, ve char türlerini kapsayacak şekilde bir sınıf oluşturun. Her türde değişkenler için setter ve getter metotları yazın.
        Degiskenler degiskenler = new Degiskenler();
        degiskenler.setSayi(10);
        degiskenler.setOndalik(3.14f);
        degiskenler.setOndalik2(3.14);
        degiskenler.setKarakter('O');
        System.out.println("Sayı: " + degiskenler.getSayi());
        System.out.println("Ondalık: " + degiskenler.getOndalik());
        System.out.println("Ondalık2: " + degiskenler.getOndalik2());
        System.out.println("Karakter: " + degiskenler.getKarakter());

        // 3. Bir final değişken oluşturun ve bu değişkenin sadece bir kez atanabileceğini göstermek için bir örnek yapın.
        final int SABIT = 10;
        // SABIT = 20;
        // Hata: The final local variable SABIT cannot be assigned. It must be blank and not using a compound assignment

        // 4. int türünden bir değişken tanımlayın ve buna negatif bir değer atayın. Ardından bu değeri pozitif bir değere dönüştürmek için bir kod yazın.
        int sayi = -10;
        sayi = Math.abs(sayi);
        System.out.println(sayi);

        // 5. byte, short, int, ve long türlerini kapsayacak şekilde bir karşılaştırma yaparak her birinin maksimum değerlerini ekrana yazdıran bir program yazın.
        System.out.println("Byte: " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MAX_VALUE);

        // 6. Kullanıcıdan iki sayı alarak bu sayıların değişken türlerinin eşleşip eşleşmediğini kontrol edin. Eşleşiyorsa toplamlarını yazdırın.
        System.out.print("İlk sayıyı girin: ");
        String sayi1 = scanner.next();
        System.out.print("İkinci sayıyı girin: ");
        String sayi2 = scanner.next();
        if (sayi1 instanceof String && sayi2 instanceof String) {
            try {
                int sayi1Int = Integer.parseInt(sayi1);
                int sayi2Int = Integer.parseInt(sayi2);
                System.out.println("Toplam: " + (sayi1Int + sayi2Int));
            } catch (NumberFormatException e) {
                System.out.println("Girilen değerler tamsayı değil.");
            }
        }

        // 7. Bir tamsayı değişkeni tanımlayın ve bu değişkeni bir String değişkene dönüştürün. Bu işlemi iki farklı yöntemle yapın.
        int sayi3 = 10;
        String sayi3String1 = String.valueOf(sayi3);
        String sayi3String2 = Integer.toString(sayi3);

        // 8. static ve non-static değişkenlerin farkını göstermek için bir sınıf yazın.
        StaticNonStatic staticNonStatic = new StaticNonStatic();
        System.out.println("Static değişken: " + StaticNonStatic.getStaticDegisken());
        System.out.println("Non-static değişken: " + staticNonStatic.getNonStaticDegisken());

        // 9. Bir değişken tanımlayın ve bu değişkene += gibi bir işlem uygulayın. İşlemin sonucunu konsola yazdırın.
        int sayi4 = 10;
        sayi4 += 5;
        System.out.println(sayi4);

        // 10. Kullanıcıdan bir String ve bir sayı isteyin. Bu ikisini birleştirerek bir cümle oluşturun ve ekrana yazdırın.
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.next();
        System.out.print("Bir sayı girin: ");
        int sayi5 = scanner.nextInt();
        System.out.println(kelime + " " + sayi5);












    }
}
