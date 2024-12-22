package com.seyma.oop;

public class kolay {
    /**
     * Bir class oluşturun ve bu sınıfta bir özellik (field) ve bir metot tanımlayın.
     * 2.	Bir sınıfta private bir özellik tanımlayın ve buna erişmek için bir getter ve setter metodu oluşturun.
     * 3.	Bir sınıfta static bir özellik tanımlayın ve bu özelliğe sınıf adıyla erişin.
     * 4.	Bir sınıfta final bir metot oluşturun ve bu metodun neden override edilemediğini açıklayın.
     * 5.	Bir sınıfın birden fazla constructor tanımlamasını (constructor overloading) gösteren bir örnek yazın.
     * 6.	Bir this anahtar kelimesini kullanarak bir sınıf içindeki özelliğe erişimi gösterin.
     * 7.	Bir sınıfta toString metodunu override ederek sınıfın verilerini anlamlı bir şekilde yazdırın.
     * 8.	Bir sınıf oluşturun ve bu sınıfın bir nesnesini new anahtar kelimesi ile oluşturun.
     * 9.	Bir sınıfta bir metodu aynı isimle farklı parametrelerle tanımlayarak metot overloading yapın.
     * 10.	Bir sınıfta default bir constructor tanımlayın ve bu constructor’ın kullanımını gösterin.
     */


    public static void main(String[] args) {
        System.out.println("Öğrencinin sınıfı"+Ogrenci.sinifi);

        Arac arac = new Arac();
        arac.renk();

        Personel personel=new Personel("Seyma","Karadere",3);
        personel.personelBilgileri();

        Calisan calisan=new Calisan("ali","ayyıldız","Ankara","keçiören");
        System.out.println(calisan);

        Araba araba =new Araba("Toyota",2020);

        Hesap hesap =new Hesap();

        Sinif sinif =new Sinif();
        System.out.println(sinif.adi);
        System.out.println(sinif.ogrSayisi);




    }
}


 class Okul{
    public String ogrAdi;
    public int puan;
    public int sinav;

    public void derece(){
        System.out.println("Derece yaptı");



    }
 }

 class Banka{
    private int musteriNo;

     public int getMusteriNo() {
         return musteriNo;
     }

     public void setMusteriNo(int musteriNo) {
         this.musteriNo = musteriNo;
     }
 }

 class Ogrenci{
    static String sinifi="A";
 }

 class Arac{
    public final void renk(){
        System.out.println("Arabanın rengi");
        //değiştirilmesini istemediğimiz şeylere final ekleriz

    }


 }

 class Hastane{
    public String adi;
    public int hastaSayisi;
    public  int doktorSayisi;

     public Hastane(String adi, int hastaSayisi, int doktorSayisi) {
         this.adi = adi;
         this.hastaSayisi = hastaSayisi;
         this.doktorSayisi = doktorSayisi;
     }
 }

 class Personel{
    String adi;
    String soyadi;
    int yasi;

     public Personel(String adi, String soyadi, int yasi) {
         this.adi = adi;
         this.soyadi = soyadi;
         this.yasi = yasi;
     }

     public void personelBilgileri(){
         System.out.println("Ad"+this.adi+" soyadi"+this.soyadi);
         System.out.println("yasi"+this.yasi);
     }
 }

 class Calisan{
    String adi;
    String soyadi;
    String bilgileri;
    String adres;

     public Calisan(String adi, String soyadi, String bilgileri, String adres) {
         this.adi = adi;
         this.soyadi = soyadi;
         this.bilgileri = bilgileri;
         this.adres = adres;
     }

     @Override
     public String toString() {
         return "Calisan{" +
                 "adi='" + adi + '\'' +
                 ", soyadi='" + soyadi + '\'' +
                 ", bilgileri='" + bilgileri + '\'' +
                 ", adres='" + adres + '\'' +
                 '}';
     }
 }

 class Araba{
    String model;
    int yil;

     public Araba(String model, int yil) {
         this.model = model;
         this.yil = yil;
     }


 }

 class Hesap{
    public int topla(int a,int b){
        return a+b;
    };
    public int topla(int a,int b,int c){
        return a+b+c;
    }
 }

 class Sinif{
    String adi;
    int ogrSayisi;

     public Sinif() {
         adi="Sinif";
         ogrSayisi=0;
     }
 }















