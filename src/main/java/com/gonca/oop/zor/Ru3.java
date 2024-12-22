package com.gonca.oop.zor;

public class Ru3  {
    private YINTERFACE yinterface;
    public Ru3(YINTERFACE yinterface) {
        this.yinterface = yinterface;
    }
    //Bir sınıf oluşturun ve bu sınıfta bir factory metodu kullanarak nesne yaratımını kontrol edin.

    public void detay()
    {
        String detay="Detaylar yazıldı";
    }

    public static void main(String[] args) {
        Ru3 nesne=new Ru3(new Ru_3_1());
        nesne.detay();
    }

}
