package com.afaqy;

import java.util.*;

public class NewCountingCapitalLetters {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter String");
        String str = myObj.nextLine().toUpperCase().replaceAll("\\W+","");

        List<String> charList = Arrays.asList(str.split(""));

        Map<String,String> treeMap = new TreeMap<>();
        for(String key : charList) {
            String value = changeToAsterisk(Collections.frequency(charList, key));
            treeMap.put(key, value);
            }
        treeMap.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public static String changeToAsterisk(int n){
        StringBuilder asterisk = new StringBuilder();
        for (int i = 0; i < n; i++) {
            asterisk.append("*");
        }
        return asterisk.toString();
    }

}

