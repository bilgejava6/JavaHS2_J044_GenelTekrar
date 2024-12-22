package com.gonca.oop.zor;

public class UrunRepo {
    private static UrunRepo  INSTANCE;

    public static UrunRepo getInstance() {
        if(INSTANCE == null){
            INSTANCE = new UrunRepo();
        }
        return INSTANCE;
    }

    private UrunRepo(){}

    public void save(Urun urun){}
    public Urun findById(Long id){
        return null;
    }
}
