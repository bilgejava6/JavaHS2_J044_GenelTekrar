package com.onur.str.kolay;

public class KolayRunner {
    public static void main(String[] args) {

        // 1 .Bir String oluşturun ve uzunluğunu konsola yazdırın.
        String str = "Merhaba Dünya";
        System.out.println("String uzunluğu: " + str.length());

        // 2. “Java Programlama” metnini büyük harflerle ekrana yazdıran bir kod yazın.
        String str2 = "Java Programlama";
        System.out.println(str2.toUpperCase());

        // 3. Kullanıcıdan bir metin girmesini isteyin ve metnin ilk harfini konsola yazdırın.
        String str3 = "Merhaba Dünya";
        System.out.println("İlk harf: " + str3.charAt(0));

        // 4. “Merhaba Dünya” ifadesinde “Dünya” kelimesinin başlangıç indeksini bulun.
        String str4 = "Merhaba Dünya";
        System.out.println("Dünya kelimesinin başlangıç indeksi: " + str4.indexOf("Dünya"));

        // 5. Bir String oluşturun ve ters çevirerek konsola yazdırın.
        String str5 = "Merhaba Dünya";
        StringBuilder str5Builder = new StringBuilder(str5);
        System.out.println("Ters çevrilmiş hali: " + str5Builder.reverse());

        // 6. İki String değişken tanımlayın ve bu değişkenlerin eşit olup olmadığını kontrol edin.
        String str6 = "Merhaba";
        String str7 = "Merhaba";
        System.out.println("Eşit mi: " + str6.equals(str7));

        // 7. Bir String oluşturun ve boş olup olmadığını kontrol eden bir kod yazın.
        String str8 = "";
        System.out.println("Boş mu: " + str8.isEmpty());

        // 8. “Java çok eğlenceli!” ifadesindeki tüm boşlukları kaldırarak yeni metni yazdırın.
        String str9 = "Java çok eğlenceli!";
        System.out.println("Boşluklar kaldırıldı: " + str9.replace(" ", ""));

        // 9. Kullanıcıdan bir kelime girmesini isteyin ve kelimenin içinde “a” harfinin olup olmadığını kontrol edin.
        String str10 = "Merhaba";
        System.out.println("İçinde 'a' harfi var mı: " + str10.contains("a"));

        // 10. “Hello” ve “World” metinlerini birleştirerek konsola yazdırın.
        String str11 = "Hello";
        String str12 = "World";
        System.out.println("Birleştirilmiş hali: " + str11.concat(str12));



    }
}
