package com.seyma.oop;

public class orta {
    /**
     *    1.	Bir sınıf oluşturun ve bu sınıftan miras alan başka bir sınıf tanımlayın. super anahtar kelimesini kullanarak üst sınıfın constructor’ına erişimi gösterin.
     *          2.	Bir abstract sınıf ve ondan türeyen bir sınıf oluşturun. Abstract bir metodu override edin.
     *          3.	Bir arayüz (interface) oluşturun ve bu arayüzü uygulayan bir sınıf yazın.
     *          4.	Bir sınıfta static bir metot tanımlayın ve bunun nesne oluşturmadan nasıl çağrıldığını gösterin.
     *          5.	Bir sınıfta final bir özellik tanımlayın ve bu özelliğe sadece constructor içinde bir değer atanabileceğini gösterin.
     *          6.	Bir enum oluşturun ve bu enum türünde bir değişkeni sınıf içinde kullanın.
     *          7.	Bir sınıfta birden fazla arayüz (interface) uygulamanın nasıl yapıldığını gösteren bir örnek yazın.
     *          8.	Bir sınıfta polymorphism (çok biçimlilik) kullanarak aynı metot ismini farklı sınıflarda nasıl kullandığınızı gösterin.
     *          9.	Bir protected özelliğin sadece alt sınıflardan erişilebilir olduğunu gösteren bir örnek yazın.
     *          10.	İç içe sınıflar (nested classes) oluşturarak bir sınıf içinde başka bir sınıf tanımlayın ve kullanın.
     */


    public static void main(String[] args) {

    }
}



class Okull {
    String name;
    Sinif adres;

    public Okull(String name, Sinif adres) {
        this.name = name;
        this.adres = adres;
    }
}

class Siniff extends Okull {
    String sinifname;
    int ogrSayisi;

    public Siniff(String name, Sinif adres, String sinifname, int ogrSayisi) {
        super(name, adres);
        this.sinifname = sinifname;
        this.ogrSayisi = ogrSayisi;
    }
}






abstract class Sehir{
    String name;
    int plaka;

    public abstract Sehir adres();


}

class ilce extends Sehir{
    String ilcename;

    @Override
    public Sehir adres() {
        return null;
    }
}


