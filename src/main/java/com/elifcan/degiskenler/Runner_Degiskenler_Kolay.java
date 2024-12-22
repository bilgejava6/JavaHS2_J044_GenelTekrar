package com.elifcan.degiskenler;

public class Runner_Degiskenler_Kolay {
    public static void main(String[] args) {
        cevap10();
    }

    private static void cevap1(){
        int sayi = 10;
        System.out.println(sayi);
    }
    private static double cevap2(){
        double degisken = 3.14;
        return degisken;
    }
    private static String cevap3(String str){
        String merhaba = "Merhaba, " + str +  "!";
        return merhaba;
    }
    private static boolean cevap4(){
        boolean cvp = true;
        return cvp;
    }
    private static void cevap5(){
        char ilk = 'E';
        System.out.println(ilk);
    }
    private static void cevap6(){
        int x = 5;
        int y = 7;
        System.out.println("Toplam = " + (x + y));
    }
    private static void cevap7(){
        String degisken = null;
        degisken = String.valueOf((int) 100);
    }
    private static void cevap8(){
        String degisken;
        //System.out.println(degisken);
        // degisken değeri initialized edilememiştir. Önce değer atanması gerekmektedir.
        // Değer atandıktan sonra intialized edilebilecektir.
    }
    private static void cevap9(){
        float degisken = 2.5f;
        System.out.println(degisken);
    }
    private static void cevap10(){
        byte degisken = 127;
        // 127'den daha büyük bir değer verilirse incompatible(uyumsuz) type hatası verecektir.
        // Oluşturulan değişken ile ona tamınlanan değerin uyumsuzluğundan dolayı bu hata çıkar.
        // Değişken byte iken değer int'dir bu yüzden bu hatayı verir.
    }

}
