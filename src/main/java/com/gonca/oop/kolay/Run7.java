package com.gonca.oop.kolay;

public class Run7 {
    //Bir sınıfta toString metodunu override ederek sınıfın verilerini anlamlı bir şekilde yazdırın.
    private String ad;
    private int yas;
    private String gorev;

    public Run7() {}

    public Run7(String ad, int yas, String gorev) {
        this.ad = ad;
        this.yas = yas;
        this.gorev = gorev;
    }

    @Override
    public String toString() {
        return "Run7{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", gorev='" + gorev + '\'' +
                '}';
    }

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

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }


    public static void main(String[] args) {
        Run7 run7 = new Run7();
        run7.toString();
    }
}
