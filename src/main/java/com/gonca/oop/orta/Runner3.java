package com.gonca.oop.orta;

public class Runner3 implements İnterFaceKul {
    //Bir arayüz (interface) oluşturun ve bu arayüzü uygulayan bir sınıf yazın.

    private String ad;
    private int yas;

    @Override
    public void yaz() {
        System.out.println(ad+ "adlı kullanıcının yaşı"+ yas);
    }

    public static void main(String[] args) {
        new Runner3().yaz();
    }



}
