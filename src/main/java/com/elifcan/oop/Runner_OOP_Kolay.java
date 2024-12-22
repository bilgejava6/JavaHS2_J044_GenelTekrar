package com.elifcan.oop;

public class Runner_OOP_Kolay {
    public static void main(String[] args) {
        Sale sale = new Sale();
        sale.sell(15);
        Cevap7 cevap7 = new Cevap7("elif",31);
        System.out.println("Musteri bilgileri : " + cevap7.toString());
    }

}
// 1. Soru
class Ogrenci{
    int yas;
    String ad;

    public void kacinciSinif(){
        if(yas < 12 && yas > 7){
            System.out.println("ilk okul");
        }
        else if(yas < 15){
            System.out.println("orta okul");
        }
    }
}
//2. Soru
class Ulke{
    private String ad;
    private int nufus;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getNufus() {
        return nufus;
    }

    public void setNufus(int nufus) {
        this.nufus = nufus;
    }
}
//3. Soru
class Customer {
    static String name = "Ali";
    static int yas = 34;
}
//4. Soru
class Sale{
    int stock = 25;
    public final void sell(int quantity){
        if (quantity <= 25){
            stock -= quantity;
        }
        System.out.println(stock);
    }
}
class Customers extends Sale{
    static String name = "Ali";
    static int yas = 34;
    //public void sell(int quantity){} HATA VERECEKTİR.
}
//5. Soru
class CustomerNew {
    String name = "Ali";
    int yas = 34;

    public CustomerNew() {
    }

    public CustomerNew(String name, int yas) {
        this.name = name;
        this.yas = yas;
    }
}
//6.Soru
class ThisDeneme{

    private String name;
    private int yas;

    public void thisDeneme(String name, int yas) {
        this.name = name;
        this.yas = yas;
    }
}
//7.Soru ve 8.Soru
class Cevap7 {

    private String name;
    private int yas;

    public Cevap7(String name, int yas) {
        this.name = name;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "newThisDeneme{" +
                "name='" + name + '\'' +
                ", yas=" + yas +
                '}';
    }
}
class Cevap9{
    public void hesapla(){
        System.out.println("hesaplandı.");
    }
    public void hesapla(int sayi1, int sayi2){
        System.out.println(sayi1 + sayi2);
    }
}
