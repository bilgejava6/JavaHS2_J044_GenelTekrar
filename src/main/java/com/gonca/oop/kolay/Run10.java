package com.gonca.oop.kolay;

public class Run10  {
    //Bir sınıfta default bir constructor tanımlayın ve bu constructor’ın kullanımını gösterin.
    private String ad;
    private int yas;


     public Run10() {

     }
    public Run10(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }


    public static void main(String[] args) {
        Run10 run10 = new Run10();
        run10.ad="GONCA";
       run10.yas=20;
    }
}
