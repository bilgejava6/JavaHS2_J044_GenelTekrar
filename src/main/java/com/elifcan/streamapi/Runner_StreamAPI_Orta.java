package com.elifcan.streamapi;

import java.util.ArrayList;
import java.util.List;

public class Runner_StreamAPI_Orta {
    public static void main(String[] args) {
        cevap1();
    }
    private static void cevap1() {
        List<String> strListe = new ArrayList<>();
        strListe.add("Fizik");
        strListe.add("Biyoloji");
        strListe.add("Kimya");
        strListe.add("Matematik");

        strListe.stream().sorted((x,y)-> Integer.compare(x.length(),y.length())).forEach(System.out::println);
    }
    private static void cevap2() {

    }
}

