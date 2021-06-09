package com.afaqy;

import java.util.*;

public class CountingCapitalLetters {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter String");
        String str = myObj.nextLine();
        str = str.toUpperCase();
        str = str.replaceAll("\\s", "").replaceAll("\\[", "").replaceAll("\\]","");

        ArrayList<Character> charList = new ArrayList<Character>();
        for (int i = 0; i <str.length() ; i++) {
            charList.add(str.charAt(i));
        }
        Collections.sort(charList);
        //System.out.println(charList);

        Map<Character ,Integer> hashMap = new HashMap<>();
        for (int i = 0; i <charList.size() ; i++) {
            if(!hashMap.containsKey(charList.get(i))){
                hashMap.put(charList.get(i),Collections.frequency(charList,charList.get(i)));
            }
        }
        //System.out.println(hashMap);

        Map<Character,Integer> treeMap = new TreeMap<Character,Integer> (hashMap);
        //System.out.println(treeMap);
        for (Map.Entry<Character,Integer> entry : treeMap.entrySet())
            System.out.println(entry.getKey()+ " " + changeToAsterisk(entry.getValue()));
    }

    public static String changeToAsterisk(int n){
        String asterisk ="";
        for (int i = 0; i < n; i++) {
            asterisk = asterisk + "*";
        }
        return asterisk;
    }

}
