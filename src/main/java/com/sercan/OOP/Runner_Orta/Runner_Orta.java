package com.sercan.OOP.Runner_Orta;

public class Runner_Orta {
    public static void main(String[] args) {
        /**OOP - Orta
         1.	Bir sınıf oluşturun ve bu sınıftan miras alan başka bir sınıf tanımlayın. super anahtar kelimesini kullanarak üst sınıfın constructor’ına erişimi gösterin.
         2. Bir abstract sınıf ve ondan türeyen bir sınıf oluşturun. Abstract bir metodu override edin.
         3.	Bir arayüz (interface) oluşturun ve bu arayüzü uygulayan bir sınıf yazın.
         4.	Bir sınıfta static bir metot tanımlayın ve bunun nesne oluşturmadan nasıl çağrıldığını gösterin.
         5.	Bir sınıfta final bir özellik tanımlayın ve bu özelliğe sadece constructor içinde bir değer atanabileceğini gösterin.
         6.	Bir enum oluşturun ve bu enum türünde bir değişkeni sınıf içinde kullanın.
         7.	Bir sınıfta birden fazla arayüz (interface) uygulamanın nasıl yapıldığını gösteren bir örnek yazın.
         8.	Bir sınıfta polymorphism (çok biçimlilik) kullanarak aynı metot ismini farklı sınıflarda nasıl kullandığınızı gösterin.
         9.	Bir protected özelliğin sadece alt sınıflardan erişilebilir olduğunu gösteren bir örnek yazın.
         10.	İç içe sınıflar (nested classes) oluşturarak bir sınıf içinde başka bir sınıf tanımlayın ve kullanın.
         *
         */
        cevap10();

    }
    public static void cevap4(){
        int carpim =Matematik.carpma(5,8);
        System.out.println(carpim);
    }

    public static void cevap5(){
        Kitap kitap=new Kitap("Fırın");

    }

    public static void cevap6(){
        System.out.println(OdemeYontemi.Havale);
    }

    public static void cevap8(){
        Sekil sekil=new Sekil();
        Dikdortgen dikdortgen=new Dikdortgen();
        Ucgen ucgen=new Ucgen();
        sekil.ciz();
        dikdortgen.ciz();
        ucgen.ciz();
    }

    public static void cevap10(){
        Hesapla hesapla=new Hesapla();
        System.out.println(hesapla.toplam(10,15));
    }

}
// CEvap 1
class Hayvan{
        private String ad;
        private int yas;

    public Hayvan(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }
} // end class CEvap 1
class Kopek extends Hayvan{
    private String tur;

    public Kopek(String ad, int yas, String tur) {
        super(ad, yas);
        this.tur = tur;
    }
} //end class CEvap 1

//Cevap 2
abstract class Hayvan_{
    public abstract void sesCikar();
} //end class CEvap2
class Kedi extends Hayvan_{

    @Override
    public void sesCikar() {
        System.out.println("Miyav");
    }
}// end class Cevap 2

//Cevap 3
interface Hesaplama{
    int islem(int a,int b);
} //end interface Cevap3
class Toplama implements Hesaplama{

    @Override
    public int islem(int a, int b) {
        return a+b;
    }
} // end class CEvap3

//CEvap4
class Matematik{
    public static int  carpma(int a,int b){
        return a*b;
    }
} //end class Cevap4

//Cevap 5
class Kitap{
    private final String ad;

    public Kitap(String ad) {
        this.ad = ad;
    }
} //end class CEvap 5

//CEvap 6
enum OdemeYontemi{
    Kredi_Karti, Havale, Taksit, EFT, Nakit
} // end enum Cevap6

//Cevap 7
interface AlanHesapla{
    double alanHesapla();
}
interface CevreHesapla{
    double cevreHesapla();
}
class Daire implements AlanHesapla,CevreHesapla{
        private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    public double cevreHesapla() {
        return 2*Math.PI*yaricap;
    }
}


//Cevap8
class Sekil{
     public void ciz(){
        System.out.println("Bir şekil çiziliyor");
    };
}

class Ucgen extends Sekil{
    @Override
    public void ciz() {
        System.out.println("Bir daire çiziliyor");
    }
}
class Dikdortgen extends Sekil{
    @Override
    public void ciz() {
        System.out.println("Dikdörtgen çiziliyor.");
    }
}



//Cevap 9

class Takım{
    protected String isim;
}

class Futbol extends Takım{
    public void futbolisim(){
        System.out.println("Futbol takımının ismi :"+isim);
    }
}
class Basketbol{
    public void basketbolisim(Takım takım){
        System.out.println("Basketbol takımının ismi: "+takım.isim);
    }
}



//Cevap 10

class Hesapla{
    public int toplam(int a,int b){
        return a+b;
    }
}







