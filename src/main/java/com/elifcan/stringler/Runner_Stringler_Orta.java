package com.elifcan.stringler;

import java.util.Scanner;

public class Runner_Stringler_Orta {
    public static void main(String[] args) {
        System.out.println(cevap8());

    }
    private static String cevap1(String state){
        StringBuilder stringBuilder = new StringBuilder(state);
        return stringBuilder.reverse().toString();
    }
    private static int cevap2(){
        Scanner scanner = new Scanner(System.in);
        String state = scanner.nextLine();
        String [] states = state.split(" ");
        int count = states.length;
        return count;
    }
    private static String cevap3(){
        String statement = "Bugün hava çok güzel";
        String newStatement = statement.replace("a","e");
        return newStatement;
    }
    private static String cevap4(){
        String statement = "kfşdk24ırfpj3pg94gh94";
        for(int i = 0 ; i < 10 ; i++){
            String a = String.valueOf(i);
            statement = statement.replace(a,"");
        }
        return statement;
    }
    private static boolean cevap5(String state){
        StringBuilder stringBuilder = new StringBuilder(state);
        if(state.equalsIgnoreCase(stringBuilder.reverse().toString())){
            return true;
        }
        return false;
    }
    private static void cevap6(String state){
        for(int i = 0 ; i < state.length() ; i++){
            System.out.println(state.charAt(i));
        }
    }
    private static String cevap7(){
        String state = "fabrika";
        String tekrar = state.substring(0,3) + state.substring(0,3) + state.substring(0,3);
        return tekrar;
    }
    private static int cevap8(){
        String state = "programlama";
        int count = 0;
        for (int i = 0; i < state.length(); i++){
            if(state.charAt(i) == 'a' || state.charAt(i) == 'o')
                count++;
        }
        return count;
    }
}
