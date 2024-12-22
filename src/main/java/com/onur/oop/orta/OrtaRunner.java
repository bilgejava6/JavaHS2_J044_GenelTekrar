package com.onur.oop.orta;

import com.onur.oop.orta.siniflar.Dort;
import com.onur.oop.orta.siniflar.On;
import com.onur.oop.orta.siniflar.alti.Day;
import com.onur.oop.orta.siniflar.alti.Schedule;
import com.onur.oop.orta.siniflar.dokuz.Child;
import com.onur.oop.orta.siniflar.sekiz.Animal;
import com.onur.oop.orta.siniflar.sekiz.Cat;
import com.onur.oop.orta.siniflar.sekiz.Dog;

public class OrtaRunner {

    public static void main(String[] args) {

        //4. soru
        Dort.staticMethod();

        //6. soru
        Schedule schedule = new Schedule(Day.MONDAY);
        schedule.printDay();

        //8. soru
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Outputs: Bark
        myCat.makeSound(); // Outputs: Meow


        //10. soru
        On outer = new On();
        On.InnerClass inner = outer.new InnerClass();

        inner.innerMethod();

    }

}
