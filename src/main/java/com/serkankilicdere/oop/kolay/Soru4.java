package com.serkankilicdere.oop.kolay;

public class Soru4 {

    /*
    4.	Bir sınıfta final bir metot oluşturun ve bu metodun neden override edilemediğini açıklayın.
     */
    public static void main(String[] args) {

    }
    public final void finalMetod(){
        System.out.println("finalMetod");// override edilemez cunki final metoddur
    }
}

class Soru4AltSinif extends Soru4{

   // public final void finalMetod(){
   //     System.out.println("finalMetod");// override edilemez cunki final metoddur --> hata verir
   // }

}
