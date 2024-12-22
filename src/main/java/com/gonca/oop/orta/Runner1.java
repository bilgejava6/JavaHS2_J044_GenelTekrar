package com.gonca.oop.orta;

import com.gonca.oop.kolay.Run10;

public class Runner1 extends Run10 {
    //	Bir sınıf oluşturun ve bu sınıftan miras alan başka bir sınıf tanımlayın.
    //	super anahtar kelimesini kullanarak üst sınıfın constructor’ına erişimi gösterin.

    private String ad;
    private int yas;

    public Runner1(String ad, int yas) {
        super(ad,yas);
        this.ad = ad;
        this.yas = yas;
    }
}
