package com.mberkan;

public class RunnerOOPOrta {

}
// 1. Sorunun cevabi

class Parent{
    String isim;
    public Parent(String isim){
      this.isim=isim;
    }
}
class Child extends Parent{
    public Child(String isim){
        super(isim);
    }
    /**
     * Parents da ki constructor i çağırır.
     */
}


// 2. Sorunun cevabi

abstract class Hayvan {
    abstract void sesCikar();

    void bilgiVer() {
        System.out.println("Bu bir hayvandır.");
    }

}
class Kedi extends Hayvan {
    @Override
    void sesCikar() {
        System.out.println("Miyav.");
    }
}
/**
 * Kedi sınıfı hem burdan bilgiVer methoduna erişim sağlar hem de
 * sesCikar methodunu override ederek kullanabilir.
 */

// 3. Sorunun Cevabi

interface repository{
    void save();
    void delete();
}
class MusteriRepository implements repository{

    @Override
    public void save() {
        System.out.println("Musteri Kaydedildi");
    }

    @Override
    public void delete() {
        System.out.println("Musteri silindi");
    }
}

//4. Sorunun Cevabi

class Matematik {

    static int toplama(int a, int b) {
        return a + b;
    }

    static int carpma(int a, int b) {
        return a * b;
    }
}

class Mains {
    public static void main(String[] args) {

        int toplam = Matematik.toplama(5, 10);
        int carpim = Matematik.carpma(4, 6);

        System.out.println("Toplama Sonucu: " + toplam);
        System.out.println("Çarpma Sonucu: " + carpim);
    }
}

// 5. Sorunun Cevabi

class FinalDegerli{
    private final int deger;

    FinalDegerli(int deger) {
        this.deger = deger;
    }

    /**
     * Eğer constuctor da değer atamazsak bir başlangıç değeri atamak zorundayiz.!
     */
}

// 6.Sorunun Cevabi

enum Cinsiyet{
    Erkek,
    Kadin
}
class Uye{
    private Cinsiyet cinsiyet;

    public Uye(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public static void main(String[] args) {
        Uye uye = new Uye(Cinsiyet.Erkek);
    }
}

// 7. Sorunun cevabi

interface BackendDev{
    void veritabanıTasarim();
    void apiGelistir();
}
interface FrontEndDev{
    void arayuzTasarim();
    void frontendKodlama();
}
class FullStack implements BackendDev, FrontEndDev{

    @Override
    public void veritabanıTasarim() {
        System.out.println("Veri tabani");
    }

    @Override
    public void apiGelistir() {
        System.out.println("apiGelistir");
    }

    @Override
    public void arayuzTasarim() {
        System.out.println("arayuzTasarim");
    }

    @Override
    public void frontendKodlama() {
        System.out.println("frontendKodlama");
    }
}

// 8. Soru Cevabi

class Hayvanlar{
    void sesYap() {
    }
}
class Kedii extends Hayvanlar{
    void sesYap() {
        System.out.println("Miyav");
    }
}
class Kopek extends Hayvanlar{
    void sesYap() {
        System.out.println("Hav hav");
    }
}

// 9. Soru Cevabi

class ProdectedClass{
    protected static int sayim=0;
}
class ProdectedClass2 extends ProdectedClass{
    public static void main(String[] args) {
        System.out.println(sayim);
    }
}

// 10. Soru Cevabi

    class DisSinif {
        private int sayim = 5;

        class IcSinif {
            void sayimSayisi() {
                System.out.println("Sayim Sayisi : " + sayim);
            }
        }

        public void main(String[] args) {
            DisSinif disSinif = new DisSinif();
            IcSinif icSinif = disSinif.new IcSinif();
            icSinif.sayimSayisi();
        }
    }
    // TODO : Çıktı alamıyorum ve disSinif.new kullanımı!!!! ...



