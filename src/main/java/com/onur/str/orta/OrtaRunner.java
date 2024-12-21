package com.onur.str.orta;

public class OrtaRunner {
    public static void main(String[] args) {

        // 1. Bir metni tersine çeviren bir program yazın ve ters metni ekrana yazdırın.
        String metin = "Merhaba Dünya";
        StringBuilder metinBuilder = new StringBuilder(metin);
        System.out.println("Ters metin: " + metinBuilder.reverse());

        // 2. Kullanıcıdan bir cümle girmesini isteyin ve bu cümledeki kelime sayısını ekrana yazdırın.
        String cumle = "Bugün hava çok güzel";
        String[] kelimeler = cumle.split(" ");
        System.out.println("Kelime sayısı: " + kelimeler.length);

        // 3. “Bugün hava çok güzel” cümlesindeki tüm “a” harflerini “e” ile değiştiren bir kod yaz
        String cumle2 = "Bugün hava çok güzel";
        System.out.println("Değiştirilmiş hali: " + cumle2.replace("a", "e"));

        // 4. Bir metin oluşturun ve içindeki tüm rakamları kaldırarak yeni metni yazdırın.
        String metin2 = "Merhaba 123";
        System.out.println("Rakamlar kaldırıldı: " + metin2.replaceAll("[0-9]", ""));

        // 5. Kullanıcıdan bir cümle isteyin ve cümlenin palindrome olup olmadığını kontrol eden bir kod yazın.
        String cumle3 = "ey edip adanada pide ye";
        String tersCumle = new StringBuilder(cumle3).reverse().toString();
        System.out.println("Palindrome mi: " + cumle3.equals(tersCumle));

        // 6. Kullanıcıdan bir kelime alın ve bu kelimenin her harfini alt alta yazdıran bir kod yazın.
        String kelime = "Merhaba";
        for (int i = 0; i < kelime.length(); i++) {
            System.out.println(kelime.charAt(i));
        }

        // 7. Bir String oluşturun ve ilk 3 karakterini tekrar eden bir metin oluşturun (örneğin: abc → abcabcabc).
        String metin3 = "abc";
        System.out.println("Yeni metin: " + metin3.repeat(3));

        // 8. “programlama” kelimesindeki tüm sesli harfleri sayan bir program yazın.
        String kelime2 = "programlama";
        int sesliHarfSayisi = 0;
        for (int i = 0; i < kelime2.length(); i++) {
            char harf = kelime2.charAt(i);
            if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') {
                sesliHarfSayisi++;
            }
        }
        System.out.println("Sesli harf sayısı: " + sesliHarfSayisi);

        // 10. Kullanıcıdan bir cümle alın ve her kelimenin ilk harfini büyük yaparak yeni bir cümle oluşturun.
        String cumle4 = "merhaba dünya";
        String[] kelimeler2 = cumle4.split(" ");
        StringBuilder yeniCumle = new StringBuilder();
        for (String kelime3 : kelimeler2) {
            yeniCumle.append(kelime3.substring(0, 1).toUpperCase()).append(kelime3.substring(1)).append(" ");
        }
        System.out.println("Yeni cümle: " + yeniCumle.toString().trim());




    }
}
