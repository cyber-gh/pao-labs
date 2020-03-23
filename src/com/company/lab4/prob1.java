package com.company.lab4;

import java.util.Arrays;

public class prob1 {
    public static void main(String[] args) {
        System.out.println(areAnagrams("roma", "mort"));
    }


    public static boolean areAnagrams(String str1, String str2) {
        return getSorted(str1).equals(getSorted(str2));
    }

    public static String getSorted(String str) {
        char[] arr1 = str.toCharArray();
        Arrays.sort(arr1);
        return new String(arr1);
    }
}
