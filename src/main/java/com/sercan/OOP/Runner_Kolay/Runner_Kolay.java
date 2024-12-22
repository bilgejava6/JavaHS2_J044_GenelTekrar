package com.sercan.OOP.Runner_Kolay;

public class Runner_Kolay {
    public static void main(String[] args) {
        /**OOP - Kolay
         1.	Bir class oluşturun ve bu sınıfta bir özellik (field) ve bir metot tanımlayın.
         2.	Bir sınıfta private bir özellik tanımlayın ve buna erişmek için bir getter ve setter metodu oluşturun.
         3.	Bir sınıfta static bir özellik tanımlayın ve bu özelliğe sınıf adıyla erişin.
         4.	Bir sınıfta final bir metot oluşturun ve bu metodun neden override edilemediğini açıklayın.
         5.	Bir sınıfın birden fazla constructor tanımlamasını (constructor overloading) gösteren bir örnek yazın.
         6.	Bir this anahtar kelimesini kullanarak bir sınıf içindeki özelliğe erişimi gösterin.
         7.	Bir sınıfta toString metodunu override ederek sınıfın verilerini anlamlı bir şekilde yazdırın.
         8.	Bir sınıf oluşturun ve bu sınıfın bir nesnesini new anahtar kelimesi ile oluşturun.
         9.	Bir sınıfta bir metodu aynı isimle farklı parametrelerle tanımlayarak metot overloading yapın.
         10.	Bir sınıfta default bir constructor tanımlayın ve bu constructor’ın kullanımını gösterin.
         *
         */
        cevap10();
    }

    public static void cevap1(){
        Musteri musteri=new Musteri("Ahmet");
        musteri.musteriAdınıYazdir();
    }

    public static void cevap2(){
        Private private2=new Private();
        private2.getAd();
        private2.getYas();
        private2.setAd("Ahmet");
        private2.setYas(25);

    }

    public static void cevap3(){
        Yazar.yazarAdi="Mehmet";
        System.out.println(Yazar.yazarAdi);
    }

    public static void cevap4(){
        /**
         * Final bir method değiştilemediği için sabit olduğu için override edilemez.
         */
    }

    public static void cevap5(){
        Araba araba=new Araba();
        System.out.println(araba.toString());
        Araba araba1=new Araba("Toyata","Mavi",2024);
        System.out.println(araba1.toString());
    }

    public static void cevap7(){
        Dizi dizi=new Dizi("Supacell","Aksiyon",2024);
        System.out.println(dizi.toString());
    }

    public static void cevap8(){
        Dizi dizi=new Dizi();
    }

    public static void cevap9(){

    }

    public static void cevap10(){
//        Takım takım=new Takım();
//        takım.setAd("Fenerbahçe");
//        takım.setYil(1907);
        Takım takım=new Takım();
        System.out.println(takım.toString());

    }


}
// Cevap 1
class Musteri{
    String ad;

    public Musteri(String ad){
        this.ad=ad;
    }

    public void musteriAdınıYazdir(){
        System.out.println("Müşteri adı : "+ad);
    }
} //end  class musteri

//Cevap 2
class Private{
    private String ad;
    private int yas;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}   // end class private

// Cevap3
class Yazar{
    static String yazarAdi;

}

//CEvap4
class Final{

}

//Cevap 5
class Araba{
    private String ad;
    private String renk;
    private int yil;

    public Araba() {
        this.ad="";
        this.renk="";
    }

    public Araba(String ad, String renk, int yil) {
        this.ad = ad;
        this.renk = renk;
        this.yil = yil;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cevap5{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", renk='").append(renk).append('\'');
        sb.append(", yil=").append(yil);
        sb.append('}');
        return sb.toString();
    }
} // end class araba


//Cevap 6
class Film{
    private String ad;
    private String konu;

    public Film(String ad, String konu) {
        this.ad = ad;
        this.konu = konu;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }
} // end class film

//CEvap 7
class Dizi{
    private String ad;
    private String diziTuru;
    private int yil;

    public Dizi() {
    }

    public Dizi(String ad, String diziTuru, int yil) {
        this.ad = ad;
        this.diziTuru = diziTuru;
        this.yil = yil;
    }
    public  String toString(){
        return "Dizi Adı :"+ad+"\n"+
                "Dizi Türü : "+diziTuru+"\n"
                +"Dizi yili : "+yil;

    }

} // end class dizi


//Cevap 9
class Topla{

    public int toplama(int a,int b){
        return a+b;
    }

    public double toplama(double a,double b){
        return a+b;
    }
} //end class topla


// cevap 10
class Takım{
    private String ad;
    private int yil;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Takım{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", yil=").append(yil);
        sb.append('}');
        return sb.toString();
    }

    public Takım() {
    this.ad="Bilinmiyor";
    this.yil=0;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
} // end class takim


