package com.serkankilicdere.oop.orta;

public class Soru1Soru4 {
    /*
    1.	Bir sınıf oluşturun ve bu sınıftan miras alan başka bir sınıf tanımlayın.
    super anahtar kelimesini kullanarak üst sınıfın constructor’ına erişimi gösterin.
     */
    /*
    4.	Bir sınıfta static bir metot tanımlayın ve bunun nesne oluşturmadan nasıl çağrıldığını gösterin.
     */

    public Soru1Soru4() {
    }

    public static String soru4concat(String s1, String s2 ) {//soru 4  method cevap
        return s1 + s2;
    }

    public static void main(String[] args) {
        soru4concat("a","b");// soru 4 metod cagırma
    }

}

class Soru1MirasAlanSinif extends Soru1Soru4 {
    public Soru1MirasAlanSinif() {
        super();
    }
}
