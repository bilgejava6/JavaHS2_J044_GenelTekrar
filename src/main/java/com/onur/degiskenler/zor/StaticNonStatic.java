package com.onur.degiskenler.zor;

public class StaticNonStatic {

    private static int staticDegisken = 10;
    private int nonStaticDegisken = 20;

    // constructor
    public StaticNonStatic() {
        staticDegisken++;
        nonStaticDegisken++;
    }


    public static int getStaticDegisken() {
        return staticDegisken;
    }

    public int getNonStaticDegisken() {
        return nonStaticDegisken;
    }
}
