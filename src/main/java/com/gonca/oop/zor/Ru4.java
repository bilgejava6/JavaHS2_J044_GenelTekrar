package com.gonca.oop.zor;

public class Ru4 {
    public static void main(String[] args) {
        Urun urun=new Urun("Bilgisayar",30,165156L);
        UrunRepo repo= UrunRepo.getInstance();
        repo.save(urun);
    }
}
