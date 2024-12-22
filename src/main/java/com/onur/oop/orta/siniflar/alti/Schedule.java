package com.onur.oop.orta.siniflar.alti;

public class Schedule {
    private Day day;

    public Schedule(Day day) {
        this.day = day;
    }

    public void printDay() {
        System.out.println("The scheduled day is: " + day);
    }
}
