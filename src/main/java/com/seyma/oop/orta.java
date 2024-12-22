package com.seyma.oop;


public class orta {

    /**
     *    1.	Bir sınıf oluşturun ve bu sınıftan miras alan başka bir sınıf tanımlayın. super anahtar kelimesini kullanarak üst sınıfın constructor’ına erişimi gösterin.
     *          2.	Bir abstract sınıf ve ondan türeyen bir sınıf oluşturun. Abstract bir metodu override edin.
     *          3.	Bir arayüz (interface) oluşturun ve bu arayüzü uygulayan bir sınıf yazın.
     *          4.	Bir sınıfta static bir metot tanımlayın ve bunun nesne oluşturmadan nasıl çağrıldığını gösterin.
     *          5.	Bir sınıfta final bir özellik tanımlayın ve bu özelliğe sadece constructor içinde bir değer atanabileceğini gösterin.
     *          6.	Bir enum oluşturun ve bu enum türünde bir değişkeni sınıf içinde kullanın.
     *          7.	Bir sınıfta birden fazla arayüz (interface) uygulamanın nasıl yapıldığını gösteren bir örnek yazın.
     *          8.	Bir sınıfta polymorphism (çok biçimlilik) kullanarak aynı metot ismini farklı sınıflarda nasıl kullandığınızı gösterin.
     *          9.	Bir protected özelliğin sadece alt sınıflardan erişilebilir olduğunu gösteren bir örnek yazın.
     *          10.	İç içe sınıflar (nested classes) oluşturarak bir sınıf içinde başka bir sınıf tanımlayın ve kullanın.
     */


    public void main(String[] args) {
        int sonuc=Hesap.toplama(2,3);
        System.out.println(sonuc);

        Okulll okulll = new Okulll();
        okulll.save("Ali");
        okulll.update("2Öğrenci");

        Personel personel =new Personel("Ali","Ankara",Unvan.MUDUR);




    }



    //1.soru

    class Okull{
        String name;
        String adres;

        public Okull(String name, String adres) {
            this.name = name;
            this.adres = adres;
        }
    }

    class Sinif extends Okull{
        int kademe;
        int ogrSayisi;

        public Sinif(String name, String adres, int kademe, int ogrSayisi) {
            super(name, adres);
            this.kademe = kademe;
            this.ogrSayisi = ogrSayisi;
        }
    }



    //2.Soru


    abstract class Sehir{
        String name;
        int plaka;

        public abstract Sehir adres();

    }



    class ilce extends Sehir{
        String ilcename;

        @Override
        public Sehir adres() {
            return null;
        }
    }

    //3.Soru
    static class  Okulll implements Siniff{

       @Override
        public void save(Object object) {

        }

        @Override
        public void update(Object object) {

       }
    }

    //4.Soru

    class Hesap{


        public static int toplama(int a,int b){

            return a+b;
        }
    }


    //5.Soru

    class Aracc{
        final String name;
        final int plaka;

        public Aracc(String name, int plaka) {
            this.name = name;
            this.plaka = plaka;
        }

        public void aracBilgi(){
            System.out.println("Arac adı"+name+" Arac plakası"+plaka);
        }
    }

    //6.soru

    class Personel{
        String name;
        String adres;
        private Unvan unvan;

        public Personel(String name, String adres, Unvan unvan) {
            this.name = name;
            this.adres = adres;
            this.unvan=unvan;

        }
    }






















}









