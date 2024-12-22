package com.serkankilicdere.oop.kolay;

public class Soru1Soru2Soru3 {
    /*
     1.	Bir class oluşturun ve bu sınıfta bir özellik (field) ve bir metot tanımlayın.
     2.	Bir sınıfta private bir özellik tanımlayın ve buna erişmek için bir getter ve setter metodu oluşturun.
     3.	Bir sınıfta static bir özellik tanımlayın ve bu özelliğe sınıf adıyla erişin.
     */
    private static int soruSayisi;// soru 3 static field
    private String soru;// soru 1 soru 2 cevap

    public static void main(String[] args) {
        Soru1Soru2Soru3.soruSayisi = 0;// soru 3 cevap
    }
    public String soruConcat(String soru, String s2) {// soru 1 metod
        return soru.concat(s2);
    }
// soru 2 getter setter
    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }
}
