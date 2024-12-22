package com.onur.oop.zor;

import com.onur.oop.zor.alti.Person;
import com.onur.oop.zor.dort.Singleton;
import com.onur.oop.zor.on.GenericSorter;
import com.onur.oop.zor.sekiz.Person8;
import com.onur.oop.zor.yedi.OuterClass;

import java.util.Arrays;
import java.util.List;

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

        //7. soru
        // Instantiate static nested class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        // Instantiate non-static nested class (inner class)
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        //8. soru
        Person8 person = new Person8()
                .setName("Onur")
                .setAge(37)
                .setAddress("Izmir");

        System.out.println(person);

        //10. soru
        List<Integer> intList = Arrays.asList(5, 3, 8, 1, 9);
        List<String> stringList = Arrays.asList("Banana", "Apple", "Cherry", "Date");

        GenericSorter.sortList(intList);
        GenericSorter.sortList(stringList);

        System.out.println("Sorted Integer List: " + intList);
        System.out.println("Sorted String List: " + stringList);

    }

}
