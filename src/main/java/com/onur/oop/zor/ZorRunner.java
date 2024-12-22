package com.onur.oop.zor;

import com.onur.oop.zor.alti.Person;
import com.onur.oop.zor.dort.Singleton;

public class ZorRunner {

    public static void main(String[] args) {

        //4. soru
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        //6. soru
        Person person1 = new Person();
        Person person2 = new Person("John");
        Person person3 = new Person("Jane", 25);
        Person person4 = new Person("Alice", 30, "123 Main St");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

    }

}
