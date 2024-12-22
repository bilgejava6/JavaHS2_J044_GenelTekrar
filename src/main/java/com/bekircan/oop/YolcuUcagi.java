package com.bekircan.oop;

public class YolcuUcagi implements Ucak {


    @Override
    public void havalan() {
        System.out.println("Yolcu uçağı havalanıyor...");
    }

    @Override
    public void in() {
        System.out.println("Yolcu uçağı iniş yapıyor...");
    }
}
