package com.bekircan.oop;

public class Hayvan extends Canli{
   // constructor
    public Hayvan(String isim) {
        super(isim);
    }

        @Override
        public void sesCikar() {
            System.out.println(isim + " diyor ki: Meaoow!");

    }
}
