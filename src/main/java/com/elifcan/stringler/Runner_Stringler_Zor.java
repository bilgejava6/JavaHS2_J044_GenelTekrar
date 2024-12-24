package com.elifcan.stringler;

import java.util.HashSet;
import java.util.Set;

public class Runner_Stringler_Zor {
    public static void main(String[] args) {
        cevap5("selam! bugün yeni bir güne uyandım");
    }
    private static void cevap1(String str) {
        String [] strlist = str.split(" ");
        String newStr = "";
        for (int i = strlist.length-1; i > -1; i--){
            newStr += strlist[i] + " ";
        }
        System.out.println(newStr.trim());
    }
    private static void cevap2(String str) {
        String [] strlist = str.split(" ");

        for (int i = 0; i < strlist.length; i++) {
            StringBuilder builder = new StringBuilder(strlist[i]);
            System.out.println(builder.reverse());
        }
    }
    private static void cevap3() {
        String str = "Merhaba Dünya";
        int ascii = 0;
        for (int i = 0; i < str.length(); i++) {
            ascii = str.charAt(i);
            System.out.println(ascii);
        }
    }
    private static void cevap4(String word) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            charSet.add(word.charAt(i));
        }
        String newWord = "";
        for (int i = 0; i < charSet.size(); i++) {
            newWord += charSet.toArray()[i];
        }
        System.out.println(newWord);
    }
    private static void cevap5(String str) {
        String [] strlist = str.split(" ");
        String longestWord = strlist[0];
        for (int i = 0; i < strlist.length; i++) {
            if (strlist[i].length() > longestWord.length()) {
                longestWord = strlist[i];
            }
        }
        System.out.println(longestWord);
    }

}
