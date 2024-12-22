package com.mberkan;

import java.util.UUID;

import static java.lang.System.out;

public class RunnerOOPKolay {
    public static void main(String[] args) {
//        Cevap1.cevap1Method(100);
//        System.out.println(Cevap3.siraNo);



    }
}
class Cevap1{
    int hiz;

    static void cevap1Method(int hiz){
        out.println("ARababnin hizi : " + hiz);
    }


}
class Cevap2k{
    private String ad;
    private String soyad;
    private String adres;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
class Cevap3{
    public static int siraNo = 0;
}
class Cevap4{
    public final void finalMethod(){
        out.println("Final");
    }
    /**
     * üst siniftan kesinlikle final keywordu override edilemez!
     */
}
class Cevap5{
    private String name;
    private String adress;
    private String lastName;
    private String telephone;
    private UUID uuid;

    public Cevap5() {
    }

    public Cevap5(String name, String telephone, String lastName, String adress) {
        this.name = name;
        this.telephone = telephone;
        this.lastName = lastName;
        this.adress = adress;
    }

    public Cevap5(UUID uuid) {
        this.uuid = uuid;
    }
    /**
     * Farklı parametreler alarak overloading işlemi gerçekleşir.
     */
}
class Cevap6{
    String name;

   void method(){
        this.name = "Mehmet Berkan";
        out.println(this.name);
    }
    /**
     * static methodlardan erişilemez..!!
     */
}
class Cevap7{
    String name;
    String address;
    public Cevap7(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cevap7{" +
                "name='" + name + '\'' +
                ", adress='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cevap7 cvp7 = new Cevap7("Ahmet","Ankara");
        out.println(cvp7.toString());
    }
}
class Cevap8d{
    private String name;
    private String adress;
    public Cevap8d(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public static void main(String[] args) {
        Cevap8d cvp = new Cevap8d("Ahmet","Ankara");
    }
}
class Cevap9d{
    int s1 = 2;
    int s2 = 3;
    int s3 = 4;
    int s4 = 5;

    int toplama(int s1,int s2){
       return s1+s2;
    }
    int toplama(int s1, int s2, int s3){

        return s1 + s2 + s3;
    }
    int toplama(int s1, int s2, int s3, int s4){
        return s1 + s2 + s3 + s4;
    }
}
class Cevap10d{
    private String adress;

    public Cevap10d() {
        this.adress = "isimsiz";
    }

    @Override
    public String toString() {
        return "Cevap10d{" +
                "adress='" + adress + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cevap10d cvp = new Cevap10d();
        System.out.println(cvp);
        /**
         * Nesne oluşturur ve erişmemize yardımcı olur...
         */
    }
}
