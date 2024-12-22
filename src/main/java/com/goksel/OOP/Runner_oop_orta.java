package com.goksel.OOP;


import java.util.Scanner;

public class Runner_oop_orta {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1.
        System.out.println("\n--- 1. Soru: Miras ve super ---");
        Anakart Anakart = new Anakart("Msi", "Gigabyte");
        System.out.println("Anakart adı:" + Anakart.ad);
        System.out.println("PC parçası: " + Anakart.parca);

        // 3.
        System.out.println("\n--- 3. Soru: Interface Oluşturma ---");
        Kedi kedi = new Kedi();
        kedi.sesCikar();

        // 4.
        System.out.println("\n--- 4. Soru: static Metot ---");
        int sonuc = Matematik.kareAl(5);
        System.out.println("5'in karesi: " + sonuc);

        // 5.
        System.out.println("\n--- 5. Soru: final Özellik ---");
        Sabit sabit = new Sabit(100);
        sabit.degerGoster();

        // 6.
        System.out.println("\n--- 6. Soru: enum Kullanımı ---");
        Araba araba = new Araba(Renk.MAVI);
        araba.renkGoster();


        // 9.
        System.out.println("\n--- 9. Soru: protected Özellik ---");
        Ogretmen ogretmen = new Ogretmen();
        ogretmen.adGoster();
        //  Calisan calisan = new Calisan(); // error


        // 10.
        System.out.println("\n--- 10. Soru: Nested Classes ---");
        DisSinif disSinif = new DisSinif();
        DisSinif.IcSinif icSinif = disSinif.new IcSinif();
        icSinif.icBilgiGoster();
        input.close();
    }

    // *** 1
    static class PC {
        String ad;

        public PC(String ad) {
            this.ad = ad;
            System.out.println("Pc constructor çalıştı. Ad: " + ad);
        }
    }

    static class Anakart extends PC {
        String parca;

        public Anakart(String ad, String parca) {
            super(ad);
            this.parca = parca;
            System.out.println("Anakart constructor çalıştı. parca:" + parca);
        }
    }



    // *** 3
    interface SesCikarabilir {
        void sesCikar();
    }

    static class Kedi implements SesCikarabilir {
        @Override
        public void sesCikar() {
            System.out.println("Miyav!");
        }
    }

    // *** 4
    static class Matematik {
        public static int kareAl(int sayi) {
            return sayi * sayi;
        }
    }

    // *** 5
    static class Sabit {
        final int SABIT_DEGER;

        public Sabit(int deger) {
            SABIT_DEGER = deger;
        }
        public void degerGoster() {
            System.out.println("Sabit Değer:"+ SABIT_DEGER);
        }
    }

    // *** 6
    enum Renk {
        KIRMIZI, MAVI, YESIL
    }

    static class Araba {
        Renk renk;

        public Araba(Renk renk) {
            this.renk = renk;
        }
        public void renkGoster(){
            System.out.println("Arabanın rengi: " + renk);
        }
    }


    // *** 9
    static class Personel {
        protected String ad;
    }

    static class Ogretmen extends Personel {
        public void adGoster() {
            ad = "Goksel";
            System.out.println("Öğretmenin adı: " + ad);
        }
    }


    // *** 10
    static class DisSinif {
        int disOzellik = 30;

        class IcSinif {
            int icOzellik = 5;

            public void icBilgiGoster() {
                System.out.println("Dış sınıfın özelliği: " + DisSinif.this.disOzellik);
                System.out.println("İç sınıfın özelliği: " + icOzellik);


            }
        }
    }
}