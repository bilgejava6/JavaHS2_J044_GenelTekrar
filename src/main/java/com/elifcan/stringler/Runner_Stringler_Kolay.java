package com.elifcan.stringler;

public class Runner_Stringler_Kolay {
    public static void main(String[] args) {
        System.out.println(cevap8());
    }
    private static int cevap1(){
        String state = "şsdfkşdsfşds";
        int length = state.length();
        return length;
    }
    private static String cevap2(){
        String state = "Java Programlama";
        String upperCaseState = state.toUpperCase();
        return upperCaseState;
    }
    private static char cevap3(String state) {
        char firstChar = state.charAt(0);
        return firstChar;
    }
    private static int cevap4(){
        String state = "Merhaba Dünya";
        int i = state.indexOf("Dünya");
        return i;
    }
    private static String cevap5(){
        String state = "Merhaba Dünya";
        StringBuilder stringBuilder = new StringBuilder(state);
        return stringBuilder.reverse().toString();
    }
    private static boolean cevap6(){
        String first = "şlfkşdlkşfd";
        String second = "jfklsdjldsjgl";
        if(first.equals(second)){
            return true;
        }
        return false;
    }
    private static boolean cevap7(){
        String control = " ";
        if(control.isEmpty()){
            return true;
        }
        return false;
    }
    private static String cevap8(){
        String statement = "Java çok eğlenceli!";
        String newStatement = statement.replace(" ","");
        return newStatement;
    }
    private static boolean cevap9(String statement){
        if(statement.toLowerCase().contains("a")){
            return true;
        }
        return false;
    }
    private static String cevap10(){
        String hello = "Hello";
        String world = "World";
        String hw = hello.concat(world);
        return hw;
    }
}
