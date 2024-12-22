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

        System.out.println("Toplama Sonucu: " + toplam); // 15
        System.out.println("Çarpma Sonucu: " + carpim); // 24
    }
}
