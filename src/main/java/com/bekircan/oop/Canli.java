package com.bekircan.oop;

public abstract class Canli {
        String isim;

        // constructor oluşturuyorum
        public Canli(String isim) {
        this.isim = isim;
        }

        // abstract method oluştur
        public abstract void sesCikar();
        // normal method
        public void bilgiGoster(){
            System.out.println("Canlı ismi: " + isim);
        }
    }

