package com.onur.oop.kolay;

import com.onur.oop.kolay.siniflar.On;
import com.onur.oop.kolay.siniflar.Sekiz;
import com.onur.oop.kolay.siniflar.Uc;

public class KolayRunner {

    public static void main(String[] args) {

        //3 Bir sınıfta static bir özellik tanımlayın ve bu özelliğe sınıf adıyla erişin.
        String ad = Uc.ad;

        //8 Bir sınıf oluşturun ve bu sınıfın bir nesnesini new anahtar kelimesi ile oluşturun.
        Sekiz sekiz = new Sekiz("Onur", 37, "Izmir");

        // 10 Bir sınıfta default bir constructor tanımlayın ve bu constructor’ın kullanımını gösterin.
        On on = new On();

    }
}
