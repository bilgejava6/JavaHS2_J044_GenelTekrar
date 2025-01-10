package com.elifcan.stringler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Runner_Stringler_Zor {
    public static void main(String[] args) {

        cevap10("the company has the huge amount of the invesment.","the");
        cevap9("selam! bugün yeni bir güne uyandım");
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
    private static void cevap6(String str) {
        int ascii = 0;
        char newChar = ' ';
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            ascii = str.charAt(i);
            newChar = (char) (ascii + 3);
            newString += newChar;
        }
        System.out.println(newString);
    }
    private static void cevap9(String str) {
        String [] strlist = str.split(" ");
        Arrays.sort(strlist, (a,b) -> Integer.compare(a.length(), b.length()));
        for (String word : strlist) {
            System.out.println(word); // Print the sorted words
        }
    }
    private static void cevap10(String str1, String str2) {
        int count = 0;
        while (str1.contains(str2)){
            count++;
            str1 = str1.substring(str1.indexOf(str2)+str2.length(),str1.length());
            System.out.println(str1);
        }
        System.out.println(str2 + " kelimesi " + count + " adet bulunmaktadır.");
    }
}
